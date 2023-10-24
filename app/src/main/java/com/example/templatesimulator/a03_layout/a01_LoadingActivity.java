package com.example.templatesimulator.a03_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.templatesimulator.R;

public class a01_LoadingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_loading);


        // un obj de type ImageView qui est lié avec FindViewById au design
        ImageView imageLoading = findViewById(R.id.image_loading);

        // utiliser cette obj avec animate en découvrant les attributs
        imageLoading.animate().rotation(35);
        // .animate = on anime l'image fade pour la faire aparaitre et .rotation pour la faire tourner
        imageLoading.animate().alpha(1).rotation(3600).setDuration(6000); // setduration plus c'est gros plus ca met du temps
    }
}