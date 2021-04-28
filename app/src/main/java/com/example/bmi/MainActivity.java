package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double weight = 0.0;
    Double height = 0.0;
    Double bmi = 0.0;

    public void onClickButton(View view) {
        EditText weightInput = (EditText) findViewById(R.id.weightInput);
        EditText heightInput = (EditText) findViewById(R.id.heightInput);

        if (TextUtils.isEmpty(weightInput.getText().toString()))
        {
            Toast.makeText(this, "Enter required values", Toast.LENGTH_SHORT).show();
        } else
        {
            String weightS = weightInput.getText().toString();
            weight = Double.parseDouble(weightS);
        }
        if (TextUtils.isEmpty(heightInput.getText().toString()))
        {
            Toast.makeText(this, "Enter required values", Toast.LENGTH_SHORT).show();
        } else
        {
            String heightS = heightInput.getText().toString();
            height = Double.parseDouble(heightS);
        }

        if (weight > 0 && height > 0)
        {
            bmi = weight / Math.pow(height/100,2);
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("bmi", bmi);
            startActivity(intent);
        }
    }
}