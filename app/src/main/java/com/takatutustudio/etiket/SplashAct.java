package com.takatutustudio.etiket;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //setting timer untuk 1 detik
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //berpindah ke Activity Getstarted
                Intent gogetstarted = new Intent(SplashAct.this, GetStartedAct.class);
                startActivity(gogetstarted);
                finish();
            }
        }, 1000); // 1000 ms = 1s
    }
}
