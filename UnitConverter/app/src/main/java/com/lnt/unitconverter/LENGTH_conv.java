package com.lnt.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class LENGTH_conv extends AppCompatActivity {
    public ArrayAdapter<CharSequence> adapter;
    Spinner fromSpinner, toSpinner;
    Button button_convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_e_n_g_t_h_conv);
        adapter = ArrayAdapter.createFromResource(this, R.array.units_2, android.R.layout.simple_spinner_item);
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

        LENGTH_enum.Unit_2 fromUnit_2 = LENGTH_enum.Unit_2.fromString(fromString);
        LENGTH_enum.Unit_2 toUnit_2 = LENGTH_enum.Unit_2.fromString(toString);

        LENGTH_enum length_enum = new LENGTH_enum(fromUnit_2, toUnit_2);
        double result = length_enum.convert(input);
        toEditText.setText(String.valueOf(result));
    }
}