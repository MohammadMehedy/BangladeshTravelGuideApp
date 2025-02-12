package com.example.travelbd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class sundarban_resturent  extends AppCompatActivity {

    ImageView adapter71;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sundarban_resturent);

        adapter71 = findViewById(R.id.adapter71);

        adapter71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sundarban_resturent.this, info.class);
                startActivity(intent);
            }
        });


    }
}