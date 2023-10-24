package com.itcraftsolution.newdigitalid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class AddharCard extends AppCompatActivity {

    private EditText editTextAadharNumber;
    private EditText editTextName;
    private EditText editTextBirthdate;
    private RadioButton radioButtonMale;
    private RadioButton radioButtonFemale;
    private EditText editTextAddress;
    private EditText editTextTown;
    private EditText editTextTaluka;
    private EditText editTextDistrict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addhar_card);

        editTextAadharNumber = findViewById(R.id.editTextAadharNumber);
        editTextName = findViewById(R.id.editTextName);
        editTextBirthdate = findViewById(R.id.editTextBirthdate);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextTown = findViewById(R.id.editTextTown);
        editTextTaluka = findViewById(R.id.editTextTaluka);
        editTextDistrict = findViewById(R.id.editTextDistrict);

        Button buttonSave = findViewById(R.id.buttonSaveAadharDetails);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered data
                String aadharNumber = editTextAadharNumber.getText().toString();
                String name = editTextName.getText().toString();
                String birthdate = editTextBirthdate.getText().toString();
                String gender = radioButtonMale.isChecked() ? "Male" : "Female";
                String address = editTextAddress.getText().toString();
                String town = editTextTown.getText().toString();
                String taluka = editTextTaluka.getText().toString();
                String district = editTextDistrict.getText().toString();

                // Get a reference to the SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

                // Get an editor to modify the SharedPreferences
                SharedPreferences.Editor editor = sharedPreferences.edit();

                // Store all the data in SharedPreferences
                editor.putString("aadharNumber", aadharNumber);
                editor.putString("name", name);
                editor.putString("birthdate", birthdate);
                editor.putString("gender", gender);
                editor.putString("address", address);
                editor.putString("town", town);
                editor.putString("taluka", taluka);
                editor.putString("district", district);

                // Apply the changes
                editor.apply();

                // Continue to the second activity
                Intent intent = new Intent(getApplicationContext(), AddharDataDisplay.class);
                startActivity(intent);
            }
        });
    }
}
