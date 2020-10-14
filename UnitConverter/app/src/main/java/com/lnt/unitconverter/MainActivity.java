package com.lnt.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bmi, percent, area, temp, volume, length, mass, currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goBMI(View view){
        Intent intent = new Intent(this, BMI_calc.class);
        startActivity(intent);
    }
    public void goPERCENT(View view){
        Intent intent = new Intent(this, PERCENT_calc.class);
        startActivity(intent);
    }
    public void goAREA(View view){
        Intent intent = new Intent(this, AREA_conv.class);
        startActivity(intent);
    }
    public void goTEMPERATURE(View view){
        Intent intent = new Intent(this, TEMPERATURE_conv.class);
        startActivity(intent);
    }
    public void goLENGTH(View view){
        Intent intent = new Intent(this, LENGTH_conv.class);
        startActivity(intent);
    }
    public void goWEIGHT(View view){
        Intent intent = new Intent(this, WEIGHT_conv.class);
        startActivity(intent);
    }
    public void goCURRENCY(View view){
        Intent intent = new Intent(this, CURRENCY_conv.class);
        startActivity(intent);
    }
}