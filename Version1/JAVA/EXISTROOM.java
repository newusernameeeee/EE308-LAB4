package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EXISTROOM extends AppCompatActivity {

    private Button mbtnEXISTROOMBACK;
    private Button mbtnEXISTROOMRULE;
    private Button mbtnEXISTROOMREADY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existroom);

        mbtnEXISTROOMBACK = findViewById(R.id.btn_existroomback);
        mbtnEXISTROOMRULE = findViewById(R.id.btn_existroomrule);
        mbtnEXISTROOMREADY = findViewById(R.id.btn_existroomready);

        ImageView bobing_gif = (ImageView) findViewById(R.id.img_existroombobing);
        Glide.with(this).load(R.drawable.bobing).into(bobing_gif);

        ImageView person_png = (ImageView) findViewById(R.id.img_existroommenber);
        Glide.with(this).load(R.drawable.personnumber3unr).into(person_png);

        setListener();
    }

    private void setListener(){
        Onclick onclick = new Onclick();
        mbtnEXISTROOMBACK.setOnClickListener(onclick);
        mbtnEXISTROOMRULE.setOnClickListener(onclick);
        mbtnEXISTROOMREADY.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_existroomback:
                    intent = new Intent(EXISTROOM.this,GROUP.class);
                    break;
                case R.id.btn_existroomrule:
                    intent = new Intent(EXISTROOM.this,RULE.class);
                    break;
                case R.id.btn_existroomready:
                    intent = new Intent(EXISTROOM.this,EXISTROOM1.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
