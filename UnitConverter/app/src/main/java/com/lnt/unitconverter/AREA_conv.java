package com.lnt.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AREA_conv extends AppCompatActivity {
    public ArrayAdapter<CharSequence> adapter;
    Spinner fromSpinner, toSpinner;
    Button button_convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_r_e_a_conv);
        //ArrayAdapter&lt;CharSequence&gt;
        adapter = ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fromSpinner = (Spinner) findViewById(R.id.spinner_from);
        toSpinner = (Spinner) findViewById(R.id.spinner_to);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);
        button_convert = (Button) findViewById(R.id.button_convert);
    }
    public void Convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText, toEditText;

        fromSpinner = (Spinner) findViewById(R.id.spinner_from);
        toSpinner = (Spinner) findViewById(R.id.spinner_to);
        fromEditText = (EditText) findViewById(R.id.editText_from);
        toEditText = (EditText) findViewById(R.id.editText_to);

        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());

        Area_enum.Unit fromUnit = Area_enum.Unit.fromString(fromString);
        Area_enum.Unit toUnit = Area_enum.Unit.fromString(toString);

        Area_enum area_enum = new Area_enum(fromUnit, toUnit);
        double result = area_enum.convert(input);
        toEditText.setText(String.valueOf(result));
    }
}