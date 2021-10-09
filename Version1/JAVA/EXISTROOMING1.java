package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EXISTROOMING1 extends AppCompatActivity {

    private Button mbtnEXISTROOM1STOP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existrooming1);

        ImageView touzi1_gif = (ImageView)findViewById(R.id.img_existroom1touzi1);
        Glide.with(this).load(R.drawable.touzi).into(touzi1_gif);
        ImageView touzi2_gif = (ImageView)findViewById(R.id.img_existroom1touzi2);
        Glide.with(this).load(R.drawable.touzi).into(touzi2_gif);
        ImageView touzi3_gif = (ImageView)findViewById(R.id.img_existroom1touzi3);
        Glide.with(this).load(R.drawable.touzi).into(touzi3_gif);
        ImageView touzi4_gif = (ImageView)findViewById(R.id.img_existroom1touzi4);
        Glide.with(this).load(R.drawable.touzi).into(touzi4_gif);
        ImageView touzi5_gif = (ImageView)findViewById(R.id.img_existroom1touzi5);
        Glide.with(this).load(R.drawable.touzi).into(touzi5_gif);
        ImageView touzi6_gif = (ImageView)findViewById(R.id.img_existroom1touzi6);
        Glide.with(this).load(R.drawable.touzi).into(touzi6_gif);

        mbtnEXISTROOM1STOP = findViewById(R.id.btn_existroom1stop);

        mbtnEXISTROOM1STOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(EXISTROOMING1.this,EXISTROOM1RESULT.class);
                startActivity(intent);
            }
        });
    }
}
