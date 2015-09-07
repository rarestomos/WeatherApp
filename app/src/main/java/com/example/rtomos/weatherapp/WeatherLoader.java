package com.example.rtomos.weatherapp;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.Notification;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.rtomos.weatherapp.objects.WeatherInfo;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.MessageFormat;

/**
 * Created by rtomos on 8/24/2015.
 */
public class WeatherLoader /*extends AsyncTask<String, Void, WeatherInfo>*/ {
    private static String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?q={0}&units=metric";
    private static final String TAG
            = "WeatherLoader";

    private TextView resultView;

    public WeatherLoader(TextView resultView) {
        this.resultView = resultView;
    }


    //TODO Volley request
    /*@Override
    protected WeatherInfo doInBackground(String... strings) {

        RequestQueue queue = Volley.newRequestQueue(this);
        String query = "http://api.openweathermap.org/data/2.5/weather?q={0}&units=metric";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, query, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                JSONObject object = new Gson().fromJson(jsonObject.toString(), JSONObject.class);
            }, new Response.ErrorListener() {
                @Override
                        public void onErrorResponse(VolleyError volleyError){
                    if (volleyError.networkResponse == null)
                        Crouton.makeText(((Activity) mContext), mContext.getResources().getString(R.string.message_no_internet), Notification.Style.ALERT).show();
                    else
                        Crouton.makeText(((Activity) mContext), mContext.getResources().getString(R.string.message_error), Notification.Style.ALERT).show();

                }
        });
            queue.add(stringRequest);

        WeatherInfo result = null;*/

        //TODO the old http request
        /*HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            URL url = new URL(MessageFormat.format(WEATHER_URL, URLEncoder.encode(strings[0], "UTF-8")));
            httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.setReadTimeout(10 * 1000);
            httpURLConnection.setConnectTimeout(10 * 1000);

            httpURLConnection.connect();

            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(inputStream));
                StringBuilder responseString = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    responseString.append(line);
                }

                Log.d(TAG, responseString.toString());

                Gson gson = new Gson();
                result = gson.fromJson(responseString.toString(),
                        WeatherInfo.class);


            } else {
                throw new IllegalStateException("Invalid response: " + responseCode);
            }

        } catch (Exception ex) {
            Log.e(TAG, "Error loading weather information.", ex);
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception ex) {
                }
            }
        }
        return result;
    }*/

    /*@Override
    protected void onPostExecute(WeatherInfo weatherInfo) {
        resultView.setText(weatherInfo.toString());
    }*/
}

