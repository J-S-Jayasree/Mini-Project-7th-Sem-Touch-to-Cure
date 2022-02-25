package com.example.myapplication1.ui.home;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.myapplication1.R;
public class OnlineYoga extends  AppCompatActivity {
    ViewFlipper viewFlipper;
    Button c1,c2,c3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.online_yoga);
        c1=(Button) findViewById(R.id.beg);
        c2=(Button) findViewById(R.id.inter);

        int images[]={R.drawable.oy1,R.drawable.oy2,R.drawable.oy3,R.drawable.oy4};
        viewFlipper=findViewById(R.id.v_flipper1);

        for(int i=0;i<images.length;i++){
            flipperImages(images[i]);
        }
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(view.getContext(),Beginner.class);
                startActivity(i1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(view.getContext(),Intermediate.class);
                startActivity(i1);
            }
        });
    }
    public void flipperImages(int images){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(images);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this, android.R.anim.fade_in);
        viewFlipper.setOutAnimation(this,android.R.anim.fade_out);

    }
}
