package com.example.myapplication1.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



import com.example.myapplication1.R;
public class Register extends AppCompatActivity{
    Button b1;
    EditText t1,t2;
    TextView t3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        b1=findViewById(R.id.button6);
        t1=findViewById(R.id.email);
        t2=findViewById(R.id.pass);
        t3=findViewById(R.id.textView16);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
         R.anim.clockwise);
        t3.startAnimation(animation);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUser(view);
                //viewdata(view);

                Intent i1=new Intent(view.getContext(),Activity2.class);
                startActivity(i1);
            }

            private void addUser(View view) {
                myDbAdapter helper = new myDbAdapter(view.getContext());
                String Email = t1.getText().toString();
                String pass = t2.getText().toString();
                helper.insertData(Email,pass);
                Message.message1(view.getContext(),"Successfully inserted");
            }

            private void viewdata(View view) {


                myDbAdapter helper =new myDbAdapter(view.getContext());
                String data = helper.getData();

                Message.message1(view.getContext(),data);
            }
        });
        /*public void viewdata(View view)
        {

        }
        public void addUser(View view)
        {


        }*/
    }
}
