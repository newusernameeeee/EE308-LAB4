package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EXISTROOMING3 extends AppCompatActivity {

    private Button mbtnEXISTROOM3STOP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existrooming3);

        ImageView touzi1_gif = (ImageView)findViewById(R.id.img_existroom3touzi1);
        Glide.with(this).load(R.drawable.touzi).into(touzi1_gif);
        ImageView touzi2_gif = (ImageView)findViewById(R.id.img_existroom3touzi2);
        Glide.with(this).load(R.drawable.touzi).into(touzi2_gif);
        ImageView touzi3_gif = (ImageView)findViewById(R.id.img_existroom3touzi3);
        Glide.with(this).load(R.drawable.touzi).into(touzi3_gif);
        ImageView touzi4_gif = (ImageView)findViewById(R.id.img_existroom3touzi4);
        Glide.with(this).load(R.drawable.touzi).into(touzi4_gif);
        ImageView touzi5_gif = (ImageView)findViewById(R.id.img_existroom3touzi5);
        Glide.with(this).load(R.drawable.touzi).into(touzi5_gif);
        ImageView touzi6_gif = (ImageView)findViewById(R.id.img_existroom3touzi6);
        Glide.with(this).load(R.drawable.touzi).into(touzi6_gif);

        mbtnEXISTROOM3STOP = findViewById(R.id.btn_existroom3stop);

        mbtnEXISTROOM3STOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(EXISTROOMING3.this,EXISTROOM3RESULT.class);
                startActivity(intent);
            }
        });
    }
}
