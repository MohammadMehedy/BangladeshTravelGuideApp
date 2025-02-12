package com.example.travelbd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class paharpur_resturent  extends AppCompatActivity {

    ImageView adapter23;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paharpur_resturent);

        adapter23 = findViewById(R.id.adapter23);

        adapter23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paharpur_resturent.this, info.class);
                startActivity(intent);
            }
        });


    }
}