package com.example.myapplication1.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.R;
public class BookSlot extends AppCompatActivity {

Button btn1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        CheckBox c1,c2,c3,c4;
        c1=findViewById(R.id.ch1);
        c2=findViewById(R.id.ch2);
        c3=findViewById(R.id.ch3);
        c4=findViewById(R.id.ch4);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_slot);
        getSupportActionBar().setTitle("Touch to Cure");
        btn1=(Button)findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), ChooseSlot.class);
                    startActivity(intent);





            }
        });
        getSupportActionBar().setTitle("Touch to Cure");
    }
}
