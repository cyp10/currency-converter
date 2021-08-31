package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber;
    EditText editText;
    Button button;
    public void button(View view){
        Log.i("this","button pressed");
        Log.i("this",editTextNumber.getText().toString());
        Double rupee=Double.parseDouble(editTextNumber.getText().toString());
        Double dolor=rupee*74.49;

        Toast.makeText(this, "It is"+dolor, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button=(Button) findViewById(R.id.button);
         editText=(EditText)findViewById(R.id.editTextTextPersonName);
         editTextNumber=(EditText) findViewById(R.id.editTextNumber);
    }
}