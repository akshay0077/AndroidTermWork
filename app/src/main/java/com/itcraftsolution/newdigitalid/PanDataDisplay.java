package com.itcraftsolution.newdigitalid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PanDataDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan_data_display);

        // Get a reference to the SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("PanPrefs", Context.MODE_PRIVATE);

        // Retrieve data from SharedPreferences for all fields
        String panNumber = sharedPreferences.getString("panNumber", "");
        String name = sharedPreferences.getString("name", "");
        String birthdate = sharedPreferences.getString("birthdate", "");
        String gender = sharedPreferences.getString("gender", "");
        String fatherName = sharedPreferences.getString("fatherName", "");
        String address = sharedPreferences.getString("address", "");
        String town = sharedPreferences.getString("town", "");
        String taluka = sharedPreferences.getString("taluka", "");
        String district = sharedPreferences.getString("district", "");

        // Display the data in TextViews
        TextView textViewPanNumber = findViewById(R.id.textViewPanNumber);
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewBirthdate = findViewById(R.id.textViewBirthdate);
        TextView textViewGender = findViewById(R.id.textViewGender);
        TextView textViewFatherName = findViewById(R.id.textViewFatherName);
        TextView textViewAddress = findViewById(R.id.textViewAddress);
        TextView textViewTown = findViewById(R.id.textViewTown);
        TextView textViewTaluka = findViewById(R.id.textViewTaluka);
        TextView textViewDistrict = findViewById(R.id.textViewDistrict);

        textViewPanNumber.setText("PAN Number: " + panNumber);
        textViewName.setText("Full Name: " + name);
        textViewBirthdate.setText("Birthdate: " + birthdate);
        textViewGender.setText("Gender: " + gender);
        textViewFatherName.setText("Father's Name: " + fatherName);
        textViewAddress.setText("Address: " + address);
        textViewTown.setText("Town: " + town);
        textViewTaluka.setText("Taluka: " + taluka);
        textViewDistrict.setText("District: " + district);
    }
}
