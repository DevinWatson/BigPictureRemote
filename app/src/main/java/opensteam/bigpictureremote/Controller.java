package opensteam.bigpictureremote;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.koushikdutta.async.future.FutureCallback;

import org.json.JSONObject;

import opensteam.bigpictureremote.Discovery.Global;


public class Controller extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);
        ((ImageButton)findViewById(R.id.btnA)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.btnB)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.btnX)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.btnY)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.btnUp)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.btnDown)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.btnLeft)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.btnRight)).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.controller, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnA:
                Global.remoteControl.ButtonPress(RemoteControl.Button.A, new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "false") {
                                //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                break;
            case R.id.btnB:
                Global.remoteControl.ButtonPress(RemoteControl.Button.B, new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "false") {
                                //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                break;
            case R.id.btnX:
                Global.remoteControl.ButtonPress(RemoteControl.Button.X, new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "false") {
                                //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                break;
            case R.id.btnY:
                Global.remoteControl.ButtonPress(RemoteControl.Button.Y, new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "false") {
                                //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                break;
            case R.id.btnUp:
                Global.remoteControl.ButtonPress(RemoteControl.Button.Up, new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "false") {
                                //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                break;
            case R.id.btnDown:
                Global.remoteControl.ButtonPress(RemoteControl.Button.Down, new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "false") {
                                //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                break;
            case R.id.btnLeft:
                Global.remoteControl.ButtonPress(RemoteControl.Button.Left, new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "false") {
                                //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                break;
            case R.id.btnRight:
                Global.remoteControl.ButtonPress(RemoteControl.Button.Right, new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "false") {
                                //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                break;
        }
    }
}
