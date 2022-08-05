package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    Button button2;
    EditText editTextTextEmailAddress;
    EditText editTextPhone;
    EditText editTextTextPassword;
    EditText editTextTextPassword2;

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);

        editTextTextEmailAddress.getText().toString();
        String email =editTextPhone.getText().toString();
        String pw =editTextTextPassword.getText().toString();
        String cpw =editTextTextPassword2.getText().toString();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextPhone.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity2.this, "Invlid Number", Toast.LENGTH_SHORT).show();
                }
                else if (editTextPhone.getText().length() < 10){
                    Toast.makeText(MainActivity2.this, "Number is too short", Toast.LENGTH_SHORT).show();
                }
                else if (editTextTextPassword.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity2.this, "Invlid Password", Toast.LENGTH_SHORT).show();
                }
                else if (editTextTextPassword.getText().length() < 4){
                    Toast.makeText(MainActivity2.this, "Password is too short", Toast.LENGTH_SHORT).show();
                }
                else if (!cpw.equals(pw)){
                    Toast.makeText(MainActivity2.this, "Different password", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(MainActivity2.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}