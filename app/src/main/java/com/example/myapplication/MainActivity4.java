package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity4 extends AppCompatActivity {
    private Button button6;
    private Button button7;
    EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        editTextNumber = findViewById(R.id.editTextNumber);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNumber.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity4.this, "Invalid OTP", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this,FirstpageActivity.class);
                startActivity(intent);

            }
        });
    }

}