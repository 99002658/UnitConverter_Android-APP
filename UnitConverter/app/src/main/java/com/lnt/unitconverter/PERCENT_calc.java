package com.lnt.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PERCENT_calc extends AppCompatActivity {
    Button calculate;
    TextView result;
    EditText percentage, total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_e_r_c_e_n_t_calc);
        calculate = (Button) findViewById(R.id.calculate);
        percentage = (EditText) findViewById(R.id.percentage);
        total = (EditText) findViewById(R.id.total);
        result = (TextView) findViewById(R.id.result);
    }

    public void calculatePERCENT(View view){
        String percentStr = percentage.getText().toString();
        String totalStr = total.getText().toString();

        if (percentStr != null && !"".equals(percentStr) && totalStr != null && !"".equals(totalStr)){
            float percentValue = Float.parseFloat(percentStr);
            float totalValue = Float.parseFloat(totalStr);

            float output = (percentValue/100)*totalValue;
            displayPERCENTAGE(output);
        }
    }

    private void displayPERCENTAGE(Float output){
        String percentLabel = "";
        percentLabel = "Result:: " + output;
        result.setText(percentLabel);
    }
}