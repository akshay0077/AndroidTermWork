package com.itcraftsolution.newdigitalid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    ImageView AadharCard,PanCard,StudentId,DrivingLicence;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AadharCard=findViewById(R.id.AadharCard);
        PanCard=findViewById(R.id.PanCard);
        DrivingLicence=findViewById(R.id.DrivingLicence);
        StudentId=findViewById(R.id.StudentId);


        AadharCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),AddharCard.class);
                startActivity(i1);
            }
        });

        PanCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(getApplicationContext(),PanCard.class);
                startActivity(i2);
            }
        });

        DrivingLicence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(getApplicationContext(),DrivingLicence.class);
                startActivity(i3);
            }
        });

        StudentId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(getApplicationContext(),StudentID.class);
                startActivity(i4);
            }
        });
    }
}