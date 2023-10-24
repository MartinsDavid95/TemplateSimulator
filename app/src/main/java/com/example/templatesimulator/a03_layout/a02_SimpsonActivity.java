package com.example.templatesimulator.a03_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.templatesimulator.HomeActivity;
import com.example.templatesimulator.R;

public class a02_SimpsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02_simpson);

        ImageView imageLesSimpson = findViewById(R.id.image_les_simpson);
        ImageView imageHomer = findViewById(R.id.image_simpson_homer);
        ImageView imageBart = findViewById(R.id.image_simpson_bart);

        imageLesSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            imageLesSimpson.animate().rotation(2900).setDuration(2000).alpha(0);
            imageHomer.animate().setStartDelay(2200).translationX(-1100).setDuration(3000);
            imageBart.animate().setStartDelay(2000).translationX(-1000).setDuration(3000);
            handler.postDelayed(runnable, 6000);
            }

            // Handler + Runnable pour faire recommencer les animations sans devoir restart
            Handler handler = new Handler();
            public final Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            };
        });

    }
}