package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class GridPage1 extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_page1);

        imageView = findViewById(R.id.imageView5);

          Bundle extras = getIntent().getExtras();
//        String value = extras.getString("image");
        if (extras != null) {
            int image = extras.getInt("image");
            imageView.setImageResource(image);
        }
    }
}