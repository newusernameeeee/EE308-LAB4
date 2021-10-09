package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ING extends AppCompatActivity {

    private Button mbtnSTOP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ing);

        ImageView touzi1_gif = (ImageView)findViewById(R.id.img_touzi1);
        Glide.with(this).load(R.drawable.touzi).into(touzi1_gif);
        ImageView touzi2_gif = (ImageView)findViewById(R.id.img_touzi2);
        Glide.with(this).load(R.drawable.touzi).into(touzi2_gif);
        ImageView touzi3_gif = (ImageView)findViewById(R.id.img_touzi3);
        Glide.with(this).load(R.drawable.touzi).into(touzi3_gif);
        ImageView touzi4_gif = (ImageView)findViewById(R.id.img_touzi4);
        Glide.with(this).load(R.drawable.touzi).into(touzi4_gif);
        ImageView touzi5_gif = (ImageView)findViewById(R.id.img_touzi5);
        Glide.with(this).load(R.drawable.touzi).into(touzi5_gif);
        ImageView touzi6_gif = (ImageView)findViewById(R.id.img_touzi6);
        Glide.with(this).load(R.drawable.touzi).into(touzi6_gif);

        mbtnSTOP = findViewById(R.id.btn_stop);

        mbtnSTOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(ING.this,RESULT.class);
                startActivity(intent);
            }
        });
    }
}
