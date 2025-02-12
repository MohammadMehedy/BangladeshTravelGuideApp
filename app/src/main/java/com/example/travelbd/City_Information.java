package com.example.travelbd;

import android.annotation.SuppressLint;
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

public class City_Information extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager manager;
    ArrayList<RecyclerViewModel> list = new ArrayList<>();
    RecyclerViewItemDecoration decoration;


    Button button3;
    Button web01;
    Button web1_1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_information);

        ///// RECYCLER VIEW :

        list.add(new RecyclerViewModel("Thanchi Road", "28 km", R.drawable.thanchi_road, 4f));
        list.add(new RecyclerViewModel("Shoilo Propat Waterfall", "2 km", R.drawable.shoilo_propat_waterfall, 4.5f));
        list.add(new RecyclerViewModel("Golden Temple", "3 km", R.drawable.golden_temple, 3f));
        list.add(new RecyclerViewModel("Amiakhum WaterFall", "2 km", R.drawable.amiakhum_waterfall, 4.5f));

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
        manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        decoration = new RecyclerViewItemDecoration(16);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(decoration);


        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(City_Information.this, res.class);
                startActivity(intent);
            }
        });
        web01 = findViewById(R.id.web01);
        web01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(City_Information.this, web1.class);
                startActivity(intent);
            }
        });

        web1_1 = findViewById(R.id.web1_1);
        web1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(City_Information.this, web1_1.class);
                startActivity(intent);
            }
        });

    }
}
