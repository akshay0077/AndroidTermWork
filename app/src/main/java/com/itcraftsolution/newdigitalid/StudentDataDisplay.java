package com.itcraftsolution.newdigitalid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDataDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_data_display);

        // Get a reference to the SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("StudentPrefs", Context.MODE_PRIVATE);

        // Retrieve student data from SharedPreferences for all fields
        String fullName = sharedPreferences.getString("fullName", "");
        String studentID = sharedPreferences.getString("studentID", "");
        String dateOfIssue = sharedPreferences.getString("dateOfIssue", "");
        String expirationDate = sharedPreferences.getString("expirationDate", "");
        String institutionName = sharedPreferences.getString("institutionName", "");
        String academicYear = sharedPreferences.getString("academicYear", "");
        String branch = sharedPreferences.getString("branch", "");
        String contactNumber = sharedPreferences.getString("contactNumber", "");

        // Display the student data in TextViews
        TextView textViewFullName = findViewById(R.id.textViewFullName);
        TextView textViewStudentID = findViewById(R.id.textViewStudentID);
        TextView textViewDateOfIssue = findViewById(R.id.textViewDateOfIssue);
        TextView textViewExpirationDate = findViewById(R.id.textViewExpirationDate);
        TextView textViewInstitutionName = findViewById(R.id.textViewInstitutionName);
        TextView textViewAcademicYear = findViewById(R.id.textViewAcademicYear);
        TextView textViewBranch = findViewById(R.id.textViewBranch);
        TextView textViewContactNumber = findViewById(R.id.textViewContactNumber);

        textViewFullName.setText("Full Name: " + fullName);
        textViewStudentID.setText("Student ID: " + studentID);
        textViewDateOfIssue.setText("Date of Issue: " + dateOfIssue);
        textViewExpirationDate.setText("Expiration Date: " + expirationDate);
        textViewInstitutionName.setText("Institution Name: " + institutionName);
        textViewAcademicYear.setText("Academic Year: " + academicYear);
        textViewBranch.setText("Branch: " + branch);
        textViewContactNumber.setText("Contact Number: " + contactNumber);
    }
}
