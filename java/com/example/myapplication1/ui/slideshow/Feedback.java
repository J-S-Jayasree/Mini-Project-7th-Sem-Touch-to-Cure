package com.example.myapplication1.ui.slideshow;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import com.example.myapplication1.R;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Feedback extends AppCompatActivity {
    private RatingBar ratingBar;

    private TextView tvRateCount, tvRateMessage;

    private float ratedValue;

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.feedback);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        tvRateCount = (TextView) findViewById(R.id.tvRateCount);

        tvRateMessage = (TextView) findViewById(R.id.tvRateMessage);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override

            public void onRatingChanged(RatingBar ratingBar, float rating,

                                        boolean fromUser) {

                ratedValue = ratingBar.getRating();

                tvRateCount.setText("Your Rating : "

                        + ratedValue + "/5.");

                if (ratedValue < 1) {

                    tvRateMessage.setText("Ohh No...We are sorry for your inconvenience");

                } else if (ratedValue < 2) {

                    tvRateMessage.setText("Okay.We are working on");

                } else if (ratedValue < 3) {

                    tvRateMessage.setText("Not bad.");

                } else if (ratedValue < 4) {

                    tvRateMessage.setText("Nice");

                } else if (ratedValue < 5) {

                    tvRateMessage.setText("Very Nice");

                } else if (ratedValue == 5) {

                    tvRateMessage.setText("Thank you..!!!");

                }

            }

        });

    }
}
