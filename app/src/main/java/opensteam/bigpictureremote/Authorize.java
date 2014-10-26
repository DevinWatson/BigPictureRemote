package opensteam.bigpictureremote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.koushikdutta.async.future.FutureCallback;

import org.json.JSONObject;

import opensteam.bigpictureremote.Discovery.Global;

public class Authorize extends Activity {
    boolean BigPictureActive = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorize);
        Bundle extras = getIntent().getExtras();

        Global.remoteControl.Authorize(new FutureCallback<JSONObject>() {
            @Override
            public void onCompleted(Exception e, JSONObject object) {
                try {
                    if (object.getString("success") == "true") {
                        if (object.getJSONObject("data").getInt("tenfoot") == 0) {
                            Intent myIntent=new Intent(Authorize.this, LaunchBigPicture.class);
                            startActivity(myIntent);
                            finish();
                        } else if (object.getJSONObject("data").getInt("tenfoot") == 1) {
                            Intent myIntent=new Intent(Authorize.this, Controller.class);
                            startActivity(myIntent);
                            finish();
                        }
                    } else if (object.getString("success") == "false") {

                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.authorize, menu);
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
}
