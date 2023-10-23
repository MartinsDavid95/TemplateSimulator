package com.example.templatesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.templatesimulator.a01_layout.L01_LinearActivity;
import com.example.templatesimulator.a01_layout.L02_FrameActivity;
import com.example.templatesimulator.a01_layout.L03_RelativeActivity;

public class HomeActivity extends AppCompatActivity {
    /** Personal **/
    // 1 Variables globales
    Button btnLinearLayout, btnFrameLayout, btnRelativeLayout; // au lieu de faire button btnframelayout sur 3 lignes

    // 2 Méthode init pour  l'initialisation des widgets
    public void initUI(){
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
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

    /** Life Cycles **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI(); // 3 appel de la methode
        setBtnLinearLayout(); // 5 appel de la methode
        setBtnFrameLayout();
        setBtnRelativeLayout();
    }
}