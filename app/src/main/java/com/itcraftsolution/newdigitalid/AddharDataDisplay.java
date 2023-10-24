package com.itcraftsolution.newdigitalid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class AddharDataDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addhar_data_display);

        // Get a reference to the SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        // Retrieve data from SharedPreferences for all fields
        String aadharNumber = sharedPreferences.getString("aadharNumber", "");
        String name = sharedPreferences.getString("name", "");
        String birthdate = sharedPreferences.getString("birthdate", "");
        String gender = sharedPreferences.getString("gender", "");
        String address = sharedPreferences.getString("address", "");
        String town = sharedPreferences.getString("town", "");
        String taluka = sharedPreferences.getString("taluka", "");
        String district = sharedPreferences.getString("district", "");

        // Display the data in TextViews
        TextView textViewAadharNumber = findViewById(R.id.textViewAadharNumber);
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewBirthdate = findViewById(R.id.textViewBirthdate);
        TextView textViewGender = findViewById(R.id.textViewGender);
        TextView textViewAddress = findViewById(R.id.textViewAddress);
        TextView textViewTown = findViewById(R.id.textViewTown);
        TextView textViewTaluka = findViewById(R.id.textViewTaluka);
        TextView textViewDistrict = findViewById(R.id.textViewDistrict);

        textViewAadharNumber.setText("Aadhar number: " + aadharNumber);
        textViewName.setText("Full Name: " + name);
        textViewBirthdate.setText("Birthdate: " + birthdate);
        textViewGender.setText("Gender: " + gender);
        textViewAddress.setText("Address: " + address);
        textViewTown.setText("Town: " + town);
        textViewTaluka.setText("Taluka: " + taluka);
        textViewDistrict.setText("District: " + district);
    }
}
