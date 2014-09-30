package opensteam.bigpictureremote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.koushikdutta.async.future.FutureCallback;

import org.json.JSONObject;

import opensteam.bigpictureremote.Discovery.Global;


public class LaunchBigPicture extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_big_picture);
        ImageButton btnLaunchBigPicture = (ImageButton) findViewById(R.id.btnLaunchBigPicture);
        btnLaunchBigPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Global.remoteControl.LaunchBigPicture(new FutureCallback<JSONObject>() {
                    @Override
                    public void onCompleted(Exception e, JSONObject object) {
                        if (e != null)
                            e.printStackTrace();
                        try {
                            if (object.getString("success") == "true") {
                                Intent myIntent=new Intent(LaunchBigPicture.this, Controller.class);
                                startActivity(myIntent);
                                finish();
                            }
                            else
                            {
                              //TODO error state
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.launch_big_picture, menu);
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
