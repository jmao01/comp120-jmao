package com.example.helloandroid;

import android.os.AsyncTask;
import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PostMessage extends AsyncTask<String, Integer, HttpResponse> {
    @Override
    // Taken from http://stackoverflow.com/questions/2938502/sending-post-data-in-android
    protected HttpResponse doInBackground(String... args) {
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(MainActivity.MESSAGES_API_URL); // the URL to your messagehub

        try {
            // Set the data
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(3);
            nameValuePairs.add(new BasicNameValuePair("message[username]", args[0]));
            nameValuePairs.add(new BasicNameValuePair("message[content]", args[1]));
            nameValuePairs.add(new BasicNameValuePair("message[app_id]", "4"));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            // Execute HTTP Post Request
            HttpResponse response = httpclient.execute(httppost);
            return response;
        }
        catch (ClientProtocolException e) {
            Log.e("***** MainActivity postMessage(): ", e.toString());
            return null;
        }
        catch (IOException e) {
            Log.e("***** MainActivity postMessage(): ", e.toString());
            return null;
        }
    }

    @Override
    protected void onPostExecute(HttpResponse resp) {
        // Display alert on error (any response code > 202)
    }
}
