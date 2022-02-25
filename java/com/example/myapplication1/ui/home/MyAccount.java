package com.example.myapplication1.ui.home;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.R;
public class MyAccount extends AppCompatActivity {
        @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_account);
            getSupportActionBar().setTitle("Touch to Cure");

    }
}
