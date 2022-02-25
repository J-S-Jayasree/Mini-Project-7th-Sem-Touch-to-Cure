package com.example.myapplication1.ui.home;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.myapplication1.R;
public class Beginner extends AppCompatActivity {

    Button cv1,cv2,cv3,cv4;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner);

        cv1= findViewById(R.id.beg1);
        cv1.setOnClickListener(view -> {
            Intent i1=new Intent(view.getContext(),Pose1.class);
            startActivity(i1);
        });
        cv2= findViewById(R.id.beg2);
        cv2.setOnClickListener(view -> {
            Intent i1=new Intent(view.getContext(),Pose2.class);
            startActivity(i1);
        });
        cv3= findViewById(R.id.beg3);
        cv3.setOnClickListener(view -> {
            Intent i1=new Intent(view.getContext(),Pose3.class);
            startActivity(i1);
        });
        cv4= findViewById(R.id.beg4);
        cv4.setOnClickListener(view -> {
            Intent i1=new Intent(view.getContext(),Pose4.class);
            startActivity(i1);
        });

    }
}
