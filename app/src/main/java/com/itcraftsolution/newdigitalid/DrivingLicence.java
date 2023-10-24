package com.itcraftsolution.newdigitalid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DrivingLicence extends AppCompatActivity {

    private EditText editTextFullName;
    private EditText editTextDateOfBirth;
    private EditText editTextLicenseNumber;
    private EditText editTextDateOfIssue;
    private EditText editTextExpiryDate;
    private EditText editTextPermanentAddress;
    private EditText editTextVehicleRegistrationNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driving_licence);

        editTextFullName = findViewById(R.id.editTextFullName);
        editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);
        editTextLicenseNumber = findViewById(R.id.editTextLicenseNumber);
        editTextDateOfIssue = findViewById(R.id.editTextDateOfIssue);
        editTextExpiryDate = findViewById(R.id.editTextExpiryDate);
        editTextPermanentAddress = findViewById(R.id.editTextPermanentAddress);
        editTextVehicleRegistrationNumber = findViewById(R.id.editTextVehicleRegistrationNumber);

        Button buttonSave = findViewById(R.id.buttonSaveDrivingLicenceDetails);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = editTextFullName.getText().toString();
                String dateOfBirth = editTextDateOfBirth.getText().toString();
                String licenseNumber = editTextLicenseNumber.getText().toString();
                String dateOfIssue = editTextDateOfIssue.getText().toString();
                String expiryDate = editTextExpiryDate.getText().toString();
                String permanentAddress = editTextPermanentAddress.getText().toString();
                String vehicleRegistrationNumber = editTextVehicleRegistrationNumber.getText().toString();

                SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("fullName", fullName);
                editor.putString("dateOfBirth", dateOfBirth);
                editor.putString("licenseNumber", licenseNumber);
                editor.putString("dateOfIssue", dateOfIssue);
                editor.putString("expiryDate", expiryDate);
                editor.putString("permanentAddress", permanentAddress);
                editor.putString("vehicleRegistrationNumber", vehicleRegistrationNumber);

                editor.apply();

                Intent intent = new Intent(getApplicationContext(), DrivingDataDisplay.class);
                startActivity(intent);
            }
        });
    }
}
