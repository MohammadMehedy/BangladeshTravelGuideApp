package com.example.travelbd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class sylhet_resturent extends AppCompatActivity {

    ImageView adapter7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sylhet_resturent);

        adapter7 = findViewById(R.id.adapter7);

        adapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sylhet_resturent.this, info.class);
                startActivity(intent);
            }
        });


    }
}