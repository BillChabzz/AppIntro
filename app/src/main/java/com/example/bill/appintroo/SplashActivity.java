package com.example.bill.appintroo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by bill on 10/12/15. For testing the splash screen
 */
public class SplashActivity extends Activity{
    //Splash timer
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,Myintro.class);
                startActivity(i);

                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
