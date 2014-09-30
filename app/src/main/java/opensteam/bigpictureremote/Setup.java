package opensteam.bigpictureremote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.koushikdutta.async.future.FutureCallback;

import org.json.JSONObject;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import opensteam.bigpictureremote.Discovery.*;

import opensteam.bigpictureremote.Discovery.net.DiscoveryClient;
import opensteam.bigpictureremote.Discovery.proto.SteamMsgRemoteClient.*;

public class Setup extends Activity {
    private static final int MSG_RECEIVE_SERVER = 10;
    private DiscoveryClient discoveryClient;

    private ArrayList<String> itemArray;
    private ArrayList<ServerListItem> serverList;
    private ArrayAdapter<String> itemAdapter;
    private ListView listView;

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_RECEIVE_SERVER:
                    serverReceived((ServerListItem) msg.obj);
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        listView = (ListView) this.findViewById(R.id.remoteClientListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                remoteClientSelected(position);
            }
        });
        itemArray = new ArrayList<String>();
        serverList = new ArrayList<ServerListItem>();
        itemArray.clear();
        itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemArray);
        listView.setAdapter(itemAdapter);

        discoveryClient = new DiscoveryClient(Utils.getClientId(this), new DiscoveryListener());
        refreshList();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.setup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void refreshList() {
        itemAdapter.clear();
        discoveryClient = new DiscoveryClient(Utils.getClientId(this), new DiscoveryListener());
        discoveryClient.start();
    }

    private void remoteClientSelected(int index) {
        discoveryClient.stop();
        try {
            Global.remoteControl = new RemoteControl(serverList.get(index).address.getAddress());
            Global.remoteControl.CheckAuthorization(new FutureCallback<JSONObject>() {
                @Override
                public void onCompleted(Exception e, JSONObject object) {
                    if (e != null)
                        e.printStackTrace();
                    try {
                        if (object.getString("success") == "true") { //Already authorized
                            if (object.getJSONObject("data").getInt("tenfoot") == 0) {
                                Intent myIntent = new Intent(Setup.this, LaunchBigPicture.class);

                                startActivity(myIntent);
                                finish();

                            } else if (object.getJSONObject("data").getInt("tenfoot") == 1) {
                                Intent myIntent=new Intent(Setup.this, Controller.class);
                                startActivity(myIntent);
                                finish();
                            }
                        } else if (object.getString("success") == "false") { //Not authorized
                            Intent myIntent = new Intent(Setup.this, Authorize.class);
                            startActivity(myIntent);
                            finish();
                        }
                    } catch (
                            Exception ex
                            )

                    {
                        ex.printStackTrace();
                    }

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void serverReceived(ServerListItem item) {
        if (!itemArray.contains(item.address.getAddress().toString())) {
            itemArray.add(item.address.getAddress().toString());
            serverList.add(item);
            itemAdapter.notifyDataSetChanged();
        }
    }

    private class DiscoveryListener implements DiscoveryClient.ResponseListener {
        public void onResponse(InetSocketAddress sockAddr, CMsgRemoteClientBroadcastHeader header, CMsgRemoteClientBroadcastStatus status) {
            ServerListItem item = new ServerListItem(sockAddr, header.getClientId(), status);
            handler.sendMessage(handler.obtainMessage(MSG_RECEIVE_SERVER, item));
        }

        public void onError(Exception e) {
        }
    }
}
