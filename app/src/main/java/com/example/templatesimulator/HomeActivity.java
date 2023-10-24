package com.example.templatesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.templatesimulator.a01_layout.L01_LinearActivity;
import com.example.templatesimulator.a01_layout.L02_FrameActivity;
import com.example.templatesimulator.a01_layout.L03_RelativeActivity;
import com.example.templatesimulator.a03_layout.a01_LoadingActivity;
import com.example.templatesimulator.a03_layout.a02_SimpsonActivity;
import com.example.templatesimulator.a04_list.S01_ListeViewActivity;
import com.example.templatesimulator.a04_list.S02_SpinnerActivity;

public class HomeActivity extends AppCompatActivity {
     /** Personal **/
    /* // 1 Variables globales
    Button btnLinearLayout, btnFrameLayout, btnRelativeLayout, btnAnimationsLoading, btnAnimationsSimpson,btnListView, btnSpinner; // au lieu de faire button btnframelayout sur 3 lignes

    // 2 Méthode init pour  l'initialisation des widgets
    public void initUI(){
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
        btnAnimationsLoading = findViewById(R.id.btn_animations_loading);
        btnAnimationsSimpson = findViewById(R.id.btn_animations_simpson);
        btnListView = findViewById(R.id.btn_list_view);
        btnSpinner = findViewById(R.id.btn_spinner);
    }

    // 4 Méthode pour la gestion du bouton LinearLayout
    private void setBtnLinearLayout(){
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L01_LinearActivity.class));
            }
        });
    }

    private void setBtnFrameLayout(){
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L02_FrameActivity.class));
            }
        });
    }
    private void setBtnRelativeLayout(){
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L03_RelativeActivity.class));
            }
        });
    }
    private void setBtnAnimationsLoading(){
        btnAnimationsLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, a01_LoadingActivity.class));
            }
        });
    }
    private void setBtnAnimationsSimpson(){
        btnAnimationsSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, a02_SimpsonActivity.class));
            }
        });
    }
    private void setBtnListView(){
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, S01_ListeViewActivity.class));
            }
        });
    }
    private void setBtnSpinner(){
        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, S02_SpinnerActivity.class));
            }
        });
    }*/
     private static final String TAG = "HomeActivity";
    public void pushedButton(View view) throws ClassNotFoundException {
        Button button = (Button) view;
        String buttonTitle = button.getText().toString();
        Log.i(TAG, "pushedButton: "+ buttonTitle);
        String buttonTag = button.getTag().toString();
        String destinationActivity = "com.example.templatesimulator."+buttonTag;
        Class destination = Class.forName(destinationActivity);
        Intent intent = new Intent(HomeActivity.this, destination);

        startActivity(intent);


    }

    /** Life Cycles **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /* initUI(); // 3 appel de la methode
        setBtnLinearLayout(); // 5 appel de la methode
        setBtnFrameLayout();
        setBtnRelativeLayout();
        setBtnAnimationsLoading();
        setBtnAnimationsSimpson();
        setBtnListView();
        setBtnSpinner();*/
    }
}