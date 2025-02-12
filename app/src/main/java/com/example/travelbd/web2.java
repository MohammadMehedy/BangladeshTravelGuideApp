package com.example.travelbd;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class web2 extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web2);
        WebView web2;
        String DEFAULT_URL = "https://www.tripadvisor.com/Restaurants-g293936-Dhaka_City_Dhaka_Division.html";


        web2 = findViewById(R.id.webView2);

        // Enable JavaScript in WebView
        WebSettings webSettings = web2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Make sure WebView opens URLs inside the app
        web2.setWebViewClient(new WebViewClient());

        // Load Google homepage by default
        web2.loadUrl(DEFAULT_URL);


        //  @Override
        //  public void onBackPressed() {
        //   if (webView1.canGoBack()) {
        //        webView1.goBack();
        //   } else {
        //         super.onBackPressed();
        //   }
    }
}