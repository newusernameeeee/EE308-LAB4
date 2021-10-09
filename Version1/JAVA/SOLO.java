package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SOLO extends AppCompatActivity {

    private Button mbtnSOLOBACK;
    private Button mbtnSOLORULE;
    private Button mbtnSOLOBEGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);

        ImageView bobing_gif = (ImageView) findViewById(R.id.img_bobing);
        Glide.with(this).load(R.drawable.bobing).into(bobing_gif);

        mbtnSOLOBACK = findViewById(R.id.btn_soloback);
        mbtnSOLORULE = findViewById(R.id.btn_solorule);
        mbtnSOLOBEGIN = findViewById(R.id.btn_solobegin);
        setListener();
    }

    private void setListener(){
        Onclick onclick = new Onclick();
        mbtnSOLOBACK.setOnClickListener(onclick);
        mbtnSOLORULE.setOnClickListener(onclick);
        mbtnSOLOBEGIN.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_soloback:
                    intent = new Intent(SOLO.this,MainPage.class);
                    break;
                case R.id.btn_solorule:
                    intent = new Intent(SOLO.this,RULE.class);
                    break;
                case R.id.btn_solobegin:
                    intent = new Intent(SOLO.this,ING.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
