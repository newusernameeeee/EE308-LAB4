package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EXISTROOM3 extends AppCompatActivity {

    private Button mbtnEXISTROOM3BACK;
    private Button mbtnEXISTROOM3RULE;
    private Button mbtnEXISTROOM3BEGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existroom3);

        mbtnEXISTROOM3BACK = findViewById(R.id.btn_existroom3back);
        mbtnEXISTROOM3RULE = findViewById(R.id.btn_existroom3rule);
        mbtnEXISTROOM3BEGIN = findViewById(R.id.btn_existroom3begin);

        ImageView bobing_gif = (ImageView) findViewById(R.id.img_existroom3bobing);
        Glide.with(this).load(R.drawable.bobing).into(bobing_gif);

        ImageView person_png = (ImageView) findViewById(R.id.img_existroom3member);
        Glide.with(this).load(R.drawable.personnumber3r).into(person_png);

        setListener();
    }

    private void setListener(){
        Onclick onclick = new Onclick();
        mbtnEXISTROOM3BACK.setOnClickListener(onclick);
        mbtnEXISTROOM3RULE.setOnClickListener(onclick);
        mbtnEXISTROOM3BEGIN.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_existroom3back:
                    intent = new Intent(EXISTROOM3.this,GROUP.class);
                    break;
                case R.id.btn_existroom3rule:
                    intent = new Intent(EXISTROOM3.this,RULE.class);
                    break;
                case R.id.btn_existroom3begin:
                    intent = new Intent(EXISTROOM3.this,EXISTROOMING3.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
