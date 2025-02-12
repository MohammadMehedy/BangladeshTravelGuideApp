package com.example.travelbd;

import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class explore extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore);
        String DEFAULT_URL = "https://www.shohoz.com/";


        WebView webView = findViewById(R.id.webView12qw);

        // Enable JavaScript in WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Make sure WebView opens URLs inside the app
        webView.setWebViewClient(new WebViewClient());

        // Load Google homepage by default
        webView.loadUrl(DEFAULT_URL);


        //  @Override
        //  public void onBackPressed() {
        //   if (webView1.canGoBack()) {
        //        webView1.goBack();
        //   } else {
        //         super.onBackPressed();
        //   }
    }
}