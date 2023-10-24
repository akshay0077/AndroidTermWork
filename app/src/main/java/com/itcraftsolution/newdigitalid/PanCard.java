package com.itcraftsolution.newdigitalid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PanCard extends AppCompatActivity {

    private EditText editTextPanNumber;
    private EditText editTextPanName;
    private EditText editTextPanBirthdate;
    private RadioButton radioButtonPanMale;
    private RadioButton radioButtonPanFemale;
    private EditText editTextPanFatherName;
    private EditText editTextPanAddress;
    private EditText editTextPanTown;
    private EditText editTextPanTaluka;
    private EditText editTextPanDistrict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan_card);

        // Initialize UI elements
        editTextPanNumber = findViewById(R.id.editTextPanNumber);
        editTextPanName = findViewById(R.id.editTextPanName);
        editTextPanBirthdate = findViewById(R.id.editTextPanBirthdate);
        radioButtonPanMale = findViewById(R.id.radioButtonPanMale);
        radioButtonPanFemale = findViewById(R.id.radioButtonPanFemale);
        editTextPanFatherName = findViewById(R.id.editTextPanFatherName);
        editTextPanAddress = findViewById(R.id.editTextPanAddress);
        editTextPanTown = findViewById(R.id.editTextPanTown);
        editTextPanTaluka = findViewById(R.id.editTextPanTaluka);
        editTextPanDistrict = findViewById(R.id.editTextPanDistrict);

        Button buttonSave = findViewById(R.id.buttonSavePanDetails);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered data
                String panNumber = editTextPanNumber.getText().toString();
                String name = editTextPanName.getText().toString();
                String birthdate = editTextPanBirthdate.getText().toString();
                String gender = radioButtonPanMale.isChecked() ? "Male" : "Female";
                String fatherName = editTextPanFatherName.getText().toString();
                String address = editTextPanAddress.getText().toString();
                String town = editTextPanTown.getText().toString();
                String taluka = editTextPanTaluka.getText().toString();
                String district = editTextPanDistrict.getText().toString();

                // Get a reference to the SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("PanPrefs", Context.MODE_PRIVATE);

                // Get an editor to modify the SharedPreferences
                SharedPreferences.Editor editor = sharedPreferences.edit();

                // Store all the data in SharedPreferences
                editor.putString("panNumber", panNumber);
                editor.putString("name", name);
                editor.putString("birthdate", birthdate);
                editor.putString("gender", gender);
                editor.putString("fatherName", fatherName);
                editor.putString("address", address);
                editor.putString("town", town);
                editor.putString("taluka", taluka);
                editor.putString("district", district);

                // Apply the changes
                editor.apply();

                // Continue to the data display activity
                Intent intent = new Intent(getApplicationContext(), PanDataDisplay.class);
                startActivity(intent);
            }
        });
    }
}
