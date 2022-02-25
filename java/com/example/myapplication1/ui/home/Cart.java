package com.example.myapplication1.ui.home;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.R;
public class Cart extends AppCompatActivity{
    CheckBox c1,c2,c3,c4;
    ImageView i1,i2,i3,i4;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);
        /*c1=(CheckBox) findViewById(R.id.cart1);
        c2=(CheckBox) findViewById(R.id.cart2);
        c3=(CheckBox) findViewById(R.id.cart3);
        c4=(CheckBox) findViewById(R.id.cart4);
        textView=(TextView) findViewById(R.id.textView14);

        Bundle bundle=getIntent().getExtras();

            Boolean value1= Boolean.valueOf(bundle.getString("Item1"));
            //String value2=bundle.getString("Item2");
            //String value3=bundle.getString("Item3");
            //String value4=bundle.getString("Item4");
            //textView.setText(value1);
            if(value1)
            {
                i1=(ImageView) findViewById(R.id.imageView8);
                i1.setImageResource(R.drawable.cart1);
                textView.setText("Rs 100");
            }*/
            /*
            else if(value2.equals("true"))
            {
                i1=(ImageView) findViewById(R.id.imageView8);
                i1.setImageResource(R.drawable.cart2);
                textView.setText("Rs 100");
            }
            else if(value3.equals("true"))
            {
                i1=(ImageView) findViewById(R.id.imageView8);
                i1.setImageResource(R.drawable.cart3);
                textView.setText("Rs 100");
            }
            else if(value4.equals("true"))
            {
                i1=(ImageView) findViewById(R.id.imageView8);
                i1.setImageResource(R.drawable.cart4);
                textView.setText("Rs 100");
            }
            else
            {
                textView.setText("No items");
            }*/




    }
}
