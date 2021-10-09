package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EXISTROOM2 extends AppCompatActivity {

    private Button mbtnEXISTROOM2BACK;
    private Button mbtnEXISTROOM2RULE;
    private Button mbtnEXISTROOM2BEGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existroom2);

        mbtnEXISTROOM2BACK = findViewById(R.id.btn_existroom2back);
        mbtnEXISTROOM2RULE = findViewById(R.id.btn_existroom2rule);
        mbtnEXISTROOM2BEGIN = findViewById(R.id.btn_existroom2begin);

        ImageView bobing_gif = (ImageView) findViewById(R.id.img_existroom2bobing);
        Glide.with(this).load(R.drawable.bobing).into(bobing_gif);

        ImageView person_png = (ImageView) findViewById(R.id.img_existroom2member);
        Glide.with(this).load(R.drawable.personnumber3r).into(person_png);

        setListener();
    }

    private void setListener(){
        Onclick onclick = new Onclick();
        mbtnEXISTROOM2BACK.setOnClickListener(onclick);
        mbtnEXISTROOM2RULE.setOnClickListener(onclick);
        mbtnEXISTROOM2BEGIN.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_existroom2back:
                    intent = new Intent(EXISTROOM2.this,GROUP.class);
                    break;
                case R.id.btn_existroom2rule:
                    intent = new Intent(EXISTROOM2.this,RULE.class);
                    break;
                case R.id.btn_existroom2begin:
                    intent = new Intent(EXISTROOM2.this,EXISTROOMING2.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
