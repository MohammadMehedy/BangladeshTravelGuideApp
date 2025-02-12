package com.example.travelbd;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AdapterViewFlipper flipper;
    ArrayList<AdapterFlipperModel> flipper_data;
    AdapterFlipper_BaseAdapter flipper_baseadapter;

    ConstraintLayout btnExplore, btnExplore2, btnExplore3 ;
    CardView cardbandarban, cardcoxsbazar, cardsylhet, cardpaharpur, card_saint_martin, card_sundarban ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper = findViewById(R.id.adapter_flipper_home); //main flipper of the home which would be shown in application

        flipper_data = new ArrayList<>();

        //Adding items to flipper_data arraylist.


        flipper_data.add(new AdapterFlipperModel("Bandarban", "Chittagong", R.drawable.bandarban)); //setting values to the items which were in the constructor of model adpater java class
        flipper_data.add(new AdapterFlipperModel("Jaflong", "Sylhet", R.drawable.jaflong_sylhet));
        flipper_data.add(new AdapterFlipperModel("Coxs Bazar", "Chittagong", R.drawable.coxs_bazar));
        flipper_data.add(new AdapterFlipperModel("Sundarbans", "Khulna", R.drawable.sundarbans));
        flipper_data.add(new AdapterFlipperModel("Paharpur", "Naogaon", R.drawable.paharpur));
        flipper_data.add(new AdapterFlipperModel("Saint Martin", "Island", R.drawable.saint_martin));



        //Setting the adapter
        flipper_baseadapter = new AdapterFlipper_BaseAdapter(this, flipper_data);
        flipper.setAdapter(flipper_baseadapter);

        //Few settings for controlling the flipper
        flipper.setAutoStart(true); //start when the application starts without the user click.
        flipper.setFlipInterval(3000); //3000 milliseconds = 3 seconds.

        cardbandarban = findViewById(R.id.cardbandarban);
        cardbandarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, City_Information.class));
            }
        });

        cardcoxsbazar = findViewById(R.id.cardcoxsbazar);
        cardcoxsbazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, coxsbazarInfo.class));
                finish();
            }
        });

        cardsylhet = findViewById(R.id.cardsylhet);
        cardsylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, sylhetInfo.class));
            }
        });

        cardpaharpur = findViewById(R.id.cardpaharpur);
        cardpaharpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, paharpurInfo.class));
            }
        });

        card_saint_martin = findViewById(R.id.card_saint_martin);
        card_saint_martin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, saintmartinInfo.class));
            }
        });

        card_sundarban = findViewById(R.id.card_sundarban);
        card_sundarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, sundarbanInfo.class));
            }
        });

        btnExplore = findViewById(R.id.btnExplore);
        btnExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, explore.class));
            }
        });

        btnExplore2 = findViewById(R.id.btnExplore2);
        btnExplore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, explore2.class));
            }
        });

        btnExplore3 = findViewById(R.id.btnExplore3);
        btnExplore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, explore3.class));
            }
        });
    }
}