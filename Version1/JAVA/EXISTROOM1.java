package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EXISTROOM1 extends AppCompatActivity {

    private Button mbtnEXISTROOM1BACK;
    private Button mbtnEXISTROOM1RULE;
    private Button mbtnEXISTROOM1BEGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existroom1);

        mbtnEXISTROOM1BACK = findViewById(R.id.btn_existroom1back);
        mbtnEXISTROOM1RULE = findViewById(R.id.btn_existroom1rule);
        mbtnEXISTROOM1BEGIN = findViewById(R.id.btn_existroom1begin);

        ImageView bobing_gif = (ImageView) findViewById(R.id.img_existroom1bobing);
        Glide.with(this).load(R.drawable.bobing).into(bobing_gif);

        ImageView person_png = (ImageView) findViewById(R.id.img_existroom1member);
        Glide.with(this).load(R.drawable.personnumber3r).into(person_png);

        setListener();
    }

    private void setListener(){
        Onclick onclick = new Onclick();
        mbtnEXISTROOM1BACK.setOnClickListener(onclick);
        mbtnEXISTROOM1RULE.setOnClickListener(onclick);
        mbtnEXISTROOM1BEGIN.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_existroom1back:
                    intent = new Intent(EXISTROOM1.this,GROUP.class);
                    break;
                case R.id.btn_existroom1rule:
                    intent = new Intent(EXISTROOM1.this,RULE.class);
                    break;
                case R.id.btn_existroom1begin:
                    intent = new Intent(EXISTROOM1.this,EXISTROOMING1.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
