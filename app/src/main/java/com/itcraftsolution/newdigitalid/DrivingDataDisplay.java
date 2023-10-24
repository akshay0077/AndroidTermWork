package com.itcraftsolution.newdigitalid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DrivingDataDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driving_data_display);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        String fullName = sharedPreferences.getString("fullName", "");
        String dateOfBirth = sharedPreferences.getString("dateOfBirth", "");
        String licenseNumber = sharedPreferences.getString("licenseNumber", "");
        String dateOfIssue = sharedPreferences.getString("dateOfIssue", "");
        String expiryDate = sharedPreferences.getString("expiryDate", "");
        String permanentAddress = sharedPreferences.getString("permanentAddress", "");
        String vehicleRegistrationNumber = sharedPreferences.getString("vehicleRegistrationNumber", "");

        TextView textViewFullName = findViewById(R.id.textViewFullName);
        TextView textViewDateOfBirth = findViewById(R.id.textViewDateOfBirth);
        TextView textViewLicenseNumber = findViewById(R.id.textViewLicenseNumber);
        TextView textViewDateOfIssue = findViewById(R.id.textViewDateOfIssue);
        TextView textViewExpiryDate = findViewById(R.id.textViewExpiryDate);
        TextView textViewPermanentAddress = findViewById(R.id.textViewPermanentAddress);
        TextView textViewVehicleRegistrationNumber = findViewById(R.id.textViewVehicleRegistrationNumber);

        textViewFullName.setText("Full Name: " + fullName);
        textViewDateOfBirth.setText("Date of Birth: " + dateOfBirth);
        textViewLicenseNumber.setText("License Number: " + licenseNumber);
        textViewDateOfIssue.setText("Date of Issue: " + dateOfIssue);
        textViewExpiryDate.setText("Expiry Date: " + expiryDate);
        textViewPermanentAddress.setText("Permanent Address: " + permanentAddress);
        textViewVehicleRegistrationNumber.setText("Vehicle Reg. Number: " + vehicleRegistrationNumber);
    }
}
