package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class StartScreen extends AppCompatActivity {
    private ProgressBar progress;
    private int prog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        progress = findViewById(R.id.progress);
        Thread thred = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });

        thred.start();
    }
    public void doWork(){
        for (prog=20; prog<=100;prog=prog+20) {
            try {
                Thread.sleep(1000);
                progress.setProgress(prog);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void startApp(){
        Intent intent = new Intent(StartScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}