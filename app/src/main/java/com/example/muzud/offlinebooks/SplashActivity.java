package com.example.muzud.offlinebooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread time = new Thread()
        {
            public void run(){
                try{
                    sleep(2500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    finish();
                    startActivity(i);
                }
            }
        };
        time.start();
    }
}
