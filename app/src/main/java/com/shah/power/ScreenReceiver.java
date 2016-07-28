package com.shah.power;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;

public class ScreenReceiver extends BroadcastReceiver {

    String ali;
    public static boolean wasScreenOn = true;

    @Override
    public void onReceive(final Context context, final Intent intent) {

        Log.e("LOBe","onReceive");

        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            // do whatever you need to do here
            wasScreenOn = false;
            Log.e("LOBe","wasScreenOn"+wasScreenOn);

        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            // and do whatever you need to do here
            vibrate();
            wasScreenOn = true;

        }else if(intent.getAction().equals(Intent.ACTION_USER_PRESENT)){
            Log.e("LOB","userpresent");
            Log.e("LOB","wasScreenOn"+wasScreenOn);
            String url = "http://www.stackoverflow.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
    }
    public void vibrate()
    {


        // Vibrate for 500 milliseconds
        MainActivity.v.vibrate(500);

    }
}