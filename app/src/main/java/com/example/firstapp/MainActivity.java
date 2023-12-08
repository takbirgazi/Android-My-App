package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView= findViewById(R.id.webViewId);
        WebSettings WebSettings = WebView.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());
        WebView.loadUrl("https://shopmanage.takbirgazi.repl.co/");
    }

    @Override
    public void onBackPressed() {
        if(WebView.canGoBack()){
            WebView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}