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

public class explore2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore2);
        String DEFAULT_URL = "https://www.tripadvisor.com/Tourism-g293935-Bangladesh-Vacations.html";


        WebView webView = findViewById(R.id.webView12qw1);

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