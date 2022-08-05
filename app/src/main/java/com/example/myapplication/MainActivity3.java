package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private Button button5;
    private Button button4;
    private Button button3;
    private EditText editTextTextPhone2;
    private EditText editTextTextPassword3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        editTextTextPhone2 = findViewById(R.id.editTextTextPhone2);
        editTextTextPassword3 = findViewById(R.id.editTextTextPassword3);
        button5 = findViewById(R.id.button5);
        button4 = findViewById(R.id.button4);
        button3 = findViewById(R.id.button3);


        String s = editTextTextPhone2.getText().toString();
        String t = editTextTextPassword3.getText().toString();
        //int a = Integer.parseInt(s);
        
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (editTextTextPhone2.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity3.this, "Number Can't be empty", Toast.LENGTH_SHORT).show();
                }
                
                else if (editTextTextPhone2.getText().length() < 10) {
                        Toast.makeText(MainActivity3.this, "Number should be 10 digit", Toast.LENGTH_SHORT).show();
                    }
                else if (editTextTextPassword3.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity3.this, "Password incorrect", Toast.LENGTH_SHORT).show();
                }
                else if (editTextTextPassword3.getText().length() < 4) {
                    Toast.makeText(MainActivity3.this, "Password should be 8 digit", Toast.LENGTH_SHORT).show();
                }
                else if (editTextTextPhone2.getText().toString().equals("1111111111") && editTextTextPassword3.getText().toString().equals("1111")){
                    Intent intent = new Intent(MainActivity3.this,FirstpageActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity3.this, "Wrong password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}