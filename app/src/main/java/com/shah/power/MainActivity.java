package com.shah.power;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Vibrator;

public class MainActivity extends AppCompatActivity {
Intent intent;
   static Vibrator v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        startService(new Intent(getApplicationContext(), com.shah.power.LockService.class)) ;

    }

}
