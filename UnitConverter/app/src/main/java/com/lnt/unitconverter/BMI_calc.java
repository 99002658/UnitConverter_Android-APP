package com.lnt.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI_calc extends AppCompatActivity {
    Button calculate;
    TextView output;
    EditText height, weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i_calc);

        calculate = (Button) findViewById(R.id.calculate);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        output = (TextView) findViewById(R.id.output);
    }

    public void calculateBMI(View view){
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr) && weightStr != null && !"".equals(weightStr)){
            float heightValue = Float.parseFloat(heightStr)/100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue/(heightValue*heightValue);
            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi){
        String bmiLabel = "";
        if (Float.compare(bmi,15f) <= 0){
            bmiLabel = getString(R.string.very_severely_underweight);
        } else if (Float.compare(bmi,15f) > 0 && Float.compare(bmi,16f) <= 0){
            bmiLabel = getString(R.string.severely_underweight);
        } else if (Float.compare(bmi,16f) > 0 && Float.compare(bmi,18.5f) <= 0){
            bmiLabel = getString(R.string.underweight);
        } else if (Float.compare(bmi,18.5f) > 0 && Float.compare(bmi, 25f) <= 0){
            bmiLabel = getString(R.string.normal);
        } else if (Float.compare(bmi,25f) > 0 && Float.compare(bmi,30f) <= 0){
            bmiLabel = getString(R.string.overweight);
        } else if (Float.compare(bmi,30f) > 0 && Float.compare(bmi,35f) <=0){
            bmiLabel = getString(R.string.obese_class_i);
        } else if (Float.compare(bmi,35f) > 0 && Float.compare(bmi,40f) <=0){
            bmiLabel = getString(R.string.obese_class_ii);
        } else {
            bmiLabel = getString(R.string.obese_class_iii);
        }

        bmiLabel = bmi + " :: " + bmiLabel;
        output.setText(bmiLabel);
    }
}