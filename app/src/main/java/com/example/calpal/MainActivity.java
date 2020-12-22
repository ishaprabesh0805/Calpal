package com.example.calpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.calpal.Views.SplashActivity;
import com.example.calpal.activities.LoginActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent logInIntent = new Intent(this, SplashActivity.class);
        startActivity(logInIntent);
        finish();
    }


}
