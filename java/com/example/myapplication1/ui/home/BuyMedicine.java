package com.example.myapplication1.ui.home;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.R;
public class BuyMedicine extends AppCompatActivity{
    Button button;
    ViewFlipper viewFlipper;
    CheckBox cart1,cart2,cart3,cart4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_medicine);
        button=(Button) findViewById(R.id.button4);
        cart1=findViewById(R.id.cart1);
        cart2=findViewById(R.id.cart2);
        cart3=findViewById(R.id.cart3);
        cart4=findViewById(R.id.cart4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(view.getContext(),Cart.class);
                i1.putExtra("Item1",cart1.isChecked());
                //i1.putExtra("Item2",cart2.isChecked());
                //i1.putExtra("Item3",cart3.isChecked());
                //i1.putExtra("Item4",cart4.isChecked());
                startActivity(i1);
            }
        });
        int images[]={R.drawable.ayur,R.drawable.carousel_1,R.drawable.carousel_2,R.drawable.carusel,R.drawable.ayurveda,R.drawable.carousel_3};
        viewFlipper=findViewById(R.id.v_flipper);

        for(int i=0;i<images.length;i++){
            flipperImages(images[i]);
        }
        getSupportActionBar().setTitle("Touch to Cure");

    }
    public void flipperImages(int images){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(images);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
