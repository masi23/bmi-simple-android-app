package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Double bmi = 0.0;
        TextView resultText = (TextView) findViewById(R.id.resultText);
        String result = "null";
        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if(extras == null)
            {
                bmi = 0.0;
            } else
            {
                bmi = extras.getDouble("bmi");
            }
        }


            if(bmi <= 18.5)
            {
                result = "Underweight";
            }
            if(bmi > 18.5 && bmi < 24.99)
            {
                result = "Normal weight";
            }if(bmi > 25.0 && bmi < 29.9)
            {
                result = "Overweight";
            }if(bmi > 30.0 && bmi < 34.99)
            {
                result = "Obesity 1st degree";
            }if(bmi > 35.0 && bmi < 39.99)
            {
                result = "Obesity 2nd degree";
            }if(bmi > 40.0)
            {
                result = "Critical obesity";
            }

        String bmiString = String.format("%.2f",bmi);
        resultText.setText("Your BMI is\n" + bmiString + "\nwhich is\n" + result);


    }
}