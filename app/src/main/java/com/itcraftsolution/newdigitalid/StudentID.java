package com.itcraftsolution.newdigitalid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentID extends AppCompatActivity {

    private EditText editTextFullName;
    private EditText editTextStudentID;
    private EditText editTextDateOfIssue;
    private EditText editTextExpirationDate;
    private EditText editTextInstitutionName;
    private EditText editTextAcademicYear;
    private EditText editTextBranch;
    private EditText editTextContactNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_id);

        editTextFullName = findViewById(R.id.editTextFullName);
        editTextStudentID = findViewById(R.id.editTextStudentID);
        editTextDateOfIssue = findViewById(R.id.editTextDateOfIssue);
        editTextExpirationDate = findViewById(R.id.editTextExpirationDate);
        editTextInstitutionName = findViewById(R.id.editTextInstitutionName);
        editTextAcademicYear = findViewById(R.id.editTextAcademicYear);
        editTextBranch = findViewById(R.id.editTextBranch);
        editTextContactNumber = findViewById(R.id.editTextContactNumber);

        Button buttonSave = findViewById(R.id.buttonSaveStudentIDDetails);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered student data
                String fullName = editTextFullName.getText().toString();
                String studentID = editTextStudentID.getText().toString();
                String dateOfIssue = editTextDateOfIssue.getText().toString();
                String expirationDate = editTextExpirationDate.getText().toString();
                String institutionName = editTextInstitutionName.getText().toString();
                String academicYear = editTextAcademicYear.getText().toString();
                String branch = editTextBranch.getText().toString();
                String contactNumber = editTextContactNumber.getText().toString();

                // Get a reference to the SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("StudentPrefs", Context.MODE_PRIVATE);

                // Get an editor to modify the SharedPreferences
                SharedPreferences.Editor editor = sharedPreferences.edit();

                // Store all the student data in SharedPreferences
                editor.putString("fullName", fullName);
                editor.putString("studentID", studentID);
                editor.putString("dateOfIssue", dateOfIssue);
                editor.putString("expirationDate", expirationDate);
                editor.putString("institutionName", institutionName);
                editor.putString("academicYear", academicYear);
                editor.putString("branch", branch);
                editor.putString("contactNumber", contactNumber);

                // Apply the changes
                editor.apply();

                // Continue to the Student Data Display activity
                Intent intent = new Intent(getApplicationContext(), StudentDataDisplay.class);
                startActivity(intent);
            }
        });
    }
}
