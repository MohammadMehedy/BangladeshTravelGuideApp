package com.example.travelbd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class coxsbazarInfo extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager manager;
    ArrayList<RecyclerViewModel> list = new ArrayList<>();
    RecyclerViewItemDecoration decoration;
    Button button232;
    Button web3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coxsbazar_info);

        ///// RECYCLER VIEW :
        list.add(new RecyclerViewModel("Bandarban", "2 km", R.drawable.bandarban, 4.5f));
        list.add(new RecyclerViewModel("Sundarban", "28 km", R.drawable.sundarbans, 4f));
        list.add(new RecyclerViewModel("Saint Martin", "2 km", R.drawable.saint_martin, 4.5f));
        list.add(new RecyclerViewModel("Jaflong", "3 km", R.drawable.jaflong_sylhet, 3f));

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
        manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        decoration = new RecyclerViewItemDecoration(16);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(decoration);


        button232 = findViewById(R.id.button232);
        button232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coxsbazarInfo.this, res1.class);
                startActivity(intent);

            }
        });

        web3 = findViewById(R.id.web3);
        web3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coxsbazarInfo.this, web3.class);
                startActivity(intent);
            }
        });

    }
}