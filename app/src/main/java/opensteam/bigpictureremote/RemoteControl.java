package opensteam.bigpictureremote;

import android.app.Activity;
import android.os.Build;

import com.koushikdutta.async.future.FutureCallback;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RemoteControl extends Activity {

    public enum Button {Up, Down, Left, Right, A, B, X, Y}

    final String port = "27037";
    private InetAddress address;
    private String deviceToken;
    private IgnoreSSLErrorsHttpClient client;

    public RemoteControl(InetAddress address) {
        this.address = address;
        this.deviceToken = capitalize(Build.MANUFACTURER) + capitalize(Build.MODEL);
        client = new IgnoreSSLErrorsHttpClient();
    }

    private String capitalize(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char first = s.charAt(0);
        if (Character.isUpperCase(first)) {
            return s;
        } else {
            return Character.toUpperCase(first) + s.substring(1);
        }
    }

    public void CheckAuthorization(final FutureCallback<JSONObject> callback) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                List<NameValuePair> parameters = new ArrayList<NameValuePair>();
                parameters.add(new BasicNameValuePair("device_token", deviceToken));
                JSONObject response = doGET("authorized/", parameters);
                try {
                    callback.onCompleted(null, response);
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.onCompleted(e, null);
                }
            }
        });
        thread.start();
    }

    public void Authorize(final FutureCallback<JSONObject> callback) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                List<NameValuePair> parameters = new ArrayList<NameValuePair>();
                parameters.add(new BasicNameValuePair("device_token", deviceToken));
                parameters.add(new BasicNameValuePair("device_name", deviceToken));
                JSONObject response = doPOST("authorize/", parameters);
                try {

                    callback.onCompleted(null, response);
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.onCompleted(e, null);
                }
            }
        });
        thread.start();
    }

    public void LaunchBigPicture(final FutureCallback<JSONObject> callback) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                List<NameValuePair> parameters = new ArrayList<NameValuePair>();
                parameters.add(new BasicNameValuePair("device_token", deviceToken));
                parameters.add(new BasicNameValuePair("device_name", deviceToken));
                JSONObject response = doPOST("ui/tenfoot/", parameters);
                try {

                    callback.onCompleted(null, response);
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.onCompleted(e, null);
                }
            }
        });
        thread.start();
    }

    public void ButtonPress(final Button button, final FutureCallback<JSONObject> callback) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                List<NameValuePair> parameters = new ArrayList<NameValuePair>();
                parameters.add(new BasicNameValuePair("device_token", deviceToken));
                parameters.add(new BasicNameValuePair("device_name", deviceToken));
                JSONObject response = null;
                switch (button) {
                    case A:
                        response = doPOST("button/a/", parameters);
                        break;
                    case B:
                        response = doPOST("button/b/", parameters);
                        break;
                    case X:
                        response = doPOST("button/x/", parameters);
                        break;
                    case Y:
                        response = doPOST("button/y/", parameters);
                        break;
                    case Up:
                        response = doPOST("button/up/", parameters);
                        break;
                    case Down:
                        response = doPOST("button/down/", parameters);
                        break;
                    case Left:
                        response = doPOST("button/left/", parameters);
                        break;
                    case Right:
                        response = doPOST("button/right/", parameters);
                        break;
                }

                try {

                    callback.onCompleted(null, response);
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.onCompleted(e, null);
                }
            }
        });
        thread.start();
    }

    private JSONObject doGET(String URI, List<NameValuePair> parameters) {
        JSONObject jsonObject = null;
        try {
            HttpGet get = new HttpGet("https://" + address.getHostAddress() + ":" + port + "/steam/" + URI + "?" + URLEncodedUtils.format(parameters, "utf-8"));
            HttpResponse response = (HttpResponse) client.execute(get);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instream = entity.getContent();
                jsonObject = new JSONObject(convertStreamToString(instream));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }


    private JSONObject doPOST(String URI, List<NameValuePair> parameters) {
        JSONObject jsonObject = null;
        try {
            HttpPost post = new HttpPost("https://" + address.getHostAddress() + ":" + port + "/steam/" + URI);
            post.setEntity(new UrlEncodedFormEntity(parameters));
            HttpResponse response = (HttpResponse) client.execute(post);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instream = entity.getContent();
                jsonObject = new JSONObject(convertStreamToString(instream));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    private static String convertStreamToString(InputStream is) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
