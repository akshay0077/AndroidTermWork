package com.itcraftsolution.fitfrenzygymfitnessapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private CartAdapter adapter;
    private ArrayList<FitnessItem> list;
    private RecyclerView rvFitnessItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        list = new ArrayList<>();

//        list.add(new FitnessItem(R.drawable.first, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Hand Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
//        list.add(new FitnessItem(R.drawable.splashdemo, "Body Building", 2300));
        list = new ArrayList<>();

        list.add(new FitnessItem(R.drawable.first, "JUMPING JACKS", 1800, "https://i.pinimg.com/originals/18/27/be/1827be178c019b1dc6f8a8d8b4a7b0b8.gif"));
        list.add(new FitnessItem(R.drawable.second, "CHEST STRETCH", 1300, "https://www.vissco.com/wp-content/uploads/animation/sub/double-knee-to-chest-stretch.gif"));
        list.add(new FitnessItem(R.drawable.third, "COBRA STRETCH", 2200, "https://www.yogajournal.com/wp-content/uploads/2021/12/Cobra.gif?width=730"));
        list.add(new FitnessItem(R.drawable.forth, "HEEL TOUCH", 1800, "https://i.pinimg.com/originals/f4/b0/f3/f4b0f3093fcadd64968e4c46d1767b50.gif"));
        list.add(new FitnessItem(R.drawable.fifth, "PLANK", 1200, "https://i.pinimg.com/originals/cf/b5/67/cfb5677a755fe7288b608a4fec6f09a0.gif"));
        list.add(new FitnessItem(R.drawable.sixth, "LEG RAISES", 2300, "https://www.gymguider.com/wp-content/uploads/2017/10/straight-leg-raise.gif"));
        list.add(new FitnessItem(R.drawable.seven, "PUSH-UPS", 1600, "https://c.tenor.com/gI-8qCUEko8AAAAC/pushup.gif"));
        list.add(new FitnessItem(R.drawable.eight, "DUMBELL CURL", 1500, "https://i.pinimg.com/originals/8c/53/27/8c532774e4e1c524576bf1fb829ad895.gif"));
        list.add(new FitnessItem(R.drawable.nine, "INCH WORMS", 1900, "https://www.vissco.com/wp-content/uploads/animation/sub/inch-worm.gif"));
        list.add(new FitnessItem(R.drawable.tenth, "TRICEP LIFT", 2240, "https://c.tenor.com/jqwaOmRs-7gAAAAC/tricep-kick-back-tricep.gif"));

        adapter = new CartAdapter(this, list);

        rvFitnessItem = findViewById(R.id.rvFitnessItems);
        rvFitnessItem.setAdapter(adapter);
        rvFitnessItem.setLayoutManager(new LinearLayoutManager(this ));

    }
}
