package com.example.cardviewexample_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.cardviewexample_01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CardView cardView;
    Button anim1,anim2,anim3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        cardView=binding.card;
        anim1=binding.btnAnim1;
        anim2=binding.btnAnim2;
        anim3=binding.btnAnim3;

        Animation animation1= AnimationUtils.loadAnimation(this,R.anim.animation1);
        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.animation2);
        Animation animation3= AnimationUtils.loadAnimation(this,R.anim.animation3);

        anim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.startAnimation(animation1);
            }
        });

        anim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.startAnimation(animation2);
            }
        });

        anim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.startAnimation(animation3);
            }
        });

    }
}