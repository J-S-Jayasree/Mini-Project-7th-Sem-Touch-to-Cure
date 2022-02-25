package com.example.myapplication1.ui.home;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.R;



public class Activity2 extends AppCompatActivity {
    ImageButton imgbtn1,imgbtn2,imgbtn3,imgbtn4,imgbtn5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        imgbtn1=(ImageButton) findViewById(R.id.buymedicine);
        imgbtn2=(ImageButton)findViewById(R.id.myaccount);
        imgbtn3=(ImageButton)findViewById(R.id.appointment);
        imgbtn4=(ImageButton)findViewById(R.id.onlineyoga);
        imgbtn5=(ImageButton)findViewById(R.id.diet);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BuyMedicine.class);
                startActivity(intent);
            }
        });
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),MyAccount.class);
                startActivity(intent);
            }
        });
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),BookAppointment.class);
                startActivity(intent);
            }
        });
        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),OnlineYoga.class);
                startActivity(intent);
            }
        });
        imgbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),Diet.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().setTitle("Touch to Cure");

    }
}
