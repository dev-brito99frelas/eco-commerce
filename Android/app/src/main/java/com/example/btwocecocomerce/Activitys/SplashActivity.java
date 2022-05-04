package com.example.btwocecocomerce.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.btwocecocomerce.R;

public class SplashActivity extends AppCompatActivity implements Runnable{
    private final long TEMP = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler r1 = new Handler();
        r1.postDelayed(this,this.TEMP);
    }

    @Override
    public void run() {
        Intent itnt = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(itnt);
        finish();

    }
}