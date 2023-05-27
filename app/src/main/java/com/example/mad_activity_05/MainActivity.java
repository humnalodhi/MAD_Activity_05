package com.example.mad_activity_05;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to the RadioGroup
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        // Set a listener on the RadioGroup
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Get the selected RadioButton
                RadioButton radioButton = findViewById(checkedId);
                if (radioButton != null) {
                    // Display a toast message with the selected item text
                    String selectedText = radioButton.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected radio button: " + selectedText, Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Get references to the CheckBoxes
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

        // Set listeners on the CheckBoxes
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Display a toast message with the selected item text
                    String selectedText = checkBox1.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected checkbox: " + selectedText, Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Display a toast message with the selected item text
                    String selectedText = checkBox2.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected checkbox: " + selectedText, Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Display a toast message with the selected item text
                    String selectedText = checkBox3.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected checkbox: " + selectedText, Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Display a toast message with the selected item text
                    String selectedText = checkBox4.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected checkbox: " + selectedText, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
