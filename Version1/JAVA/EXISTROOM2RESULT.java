package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EXISTROOM2RESULT extends AppCompatActivity {

    int array[] = {0,0,0,0,0,0};
    int number[] = {0,0,0,0,0,0};
    private Button mbtnEXISTROOM2NEXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existroom2_result);

        mbtnEXISTROOM2NEXT = findViewById(R.id.btn_existroom2next);
        mbtnEXISTROOM2NEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(EXISTROOM2RESULT.this,EXISTROOM3.class);
                startActivity(intent);
            }
        });

        array = random(array);

        ImageView resulttouzi1_png = (ImageView) findViewById(R.id.img_existroom2resulttouzi1);
        switch(array[0]) {
            case 1:
                Glide.with(this).load(R.drawable.one).into(resulttouzi1_png);
                break;
            case 2:
                Glide.with(this).load(R.drawable.two).into(resulttouzi1_png);
                break;
            case 3:
                Glide.with(this).load(R.drawable.three).into(resulttouzi1_png);
                break;
            case 4:
                Glide.with(this).load(R.drawable.four).into(resulttouzi1_png);
                break;
            case 5:
                Glide.with(this).load(R.drawable.five).into(resulttouzi1_png);
                break;
            case 6:
                Glide.with(this).load(R.drawable.six).into(resulttouzi1_png);
                break;
        }

        ImageView resulttouzi2_png = (ImageView) findViewById(R.id.img_existroom2resulttouzi2);
        switch(array[1]) {
            case 1:
                Glide.with(this).load(R.drawable.one).into(resulttouzi2_png);
                break;
            case 2:
                Glide.with(this).load(R.drawable.two).into(resulttouzi2_png);
                break;
            case 3:
                Glide.with(this).load(R.drawable.three).into(resulttouzi2_png);
                break;
            case 4:
                Glide.with(this).load(R.drawable.four).into(resulttouzi2_png);
                break;
            case 5:
                Glide.with(this).load(R.drawable.five).into(resulttouzi2_png);
                break;
            case 6:
                Glide.with(this).load(R.drawable.six).into(resulttouzi2_png);
                break;
        }

        ImageView resulttouzi3_png = (ImageView) findViewById(R.id.img_existroom2resulttouzi3);
        switch(array[2]) {
            case 1:
                Glide.with(this).load(R.drawable.one).into(resulttouzi3_png);
                break;
            case 2:
                Glide.with(this).load(R.drawable.two).into(resulttouzi3_png);
                break;
            case 3:
                Glide.with(this).load(R.drawable.three).into(resulttouzi3_png);
                break;
            case 4:
                Glide.with(this).load(R.drawable.four).into(resulttouzi3_png);
                break;
            case 5:
                Glide.with(this).load(R.drawable.five).into(resulttouzi3_png);
                break;
            case 6:
                Glide.with(this).load(R.drawable.six).into(resulttouzi3_png);
                break;
        }

        ImageView resulttouzi4_png = (ImageView) findViewById(R.id.img_existroom2resulttouzi4);
        switch(array[3]) {
            case 1:
                Glide.with(this).load(R.drawable.one).into(resulttouzi4_png);
                break;
            case 2:
                Glide.with(this).load(R.drawable.two).into(resulttouzi4_png);
                break;
            case 3:
                Glide.with(this).load(R.drawable.three).into(resulttouzi4_png);
                break;
            case 4:
                Glide.with(this).load(R.drawable.four).into(resulttouzi4_png);
                break;
            case 5:
                Glide.with(this).load(R.drawable.five).into(resulttouzi4_png);
                break;
            case 6:
                Glide.with(this).load(R.drawable.six).into(resulttouzi4_png);
                break;
        }

        ImageView resulttouzi5_png = (ImageView) findViewById(R.id.img_existroom2resulttouzi5);
        switch(array[4]) {
            case 1:
                Glide.with(this).load(R.drawable.one).into(resulttouzi5_png);
                break;
            case 2:
                Glide.with(this).load(R.drawable.two).into(resulttouzi5_png);
                break;
            case 3:
                Glide.with(this).load(R.drawable.three).into(resulttouzi5_png);
                break;
            case 4:
                Glide.with(this).load(R.drawable.four).into(resulttouzi5_png);
                break;
            case 5:
                Glide.with(this).load(R.drawable.five).into(resulttouzi5_png);
                break;
            case 6:
                Glide.with(this).load(R.drawable.six).into(resulttouzi5_png);
                break;
        }

        ImageView resulttouzi6_png = (ImageView) findViewById(R.id.img_existroom2resulttouzi6);
        switch(array[5]) {
            case 1:
                Glide.with(this).load(R.drawable.one).into(resulttouzi6_png);
                break;
            case 2:
                Glide.with(this).load(R.drawable.two).into(resulttouzi6_png);
                break;
            case 3:
                Glide.with(this).load(R.drawable.three).into(resulttouzi6_png);
                break;
            case 4:
                Glide.with(this).load(R.drawable.four).into(resulttouzi6_png);
                break;
            case 5:
                Glide.with(this).load(R.drawable.five).into(resulttouzi6_png);
                break;
            case 6:
                Glide.with(this).load(R.drawable.six).into(resulttouzi6_png);
                break;
        }

        //Result
        for(int j = 0;j < 6;j++){
            if(array[j] == 1){
                number[0]++;
            }
            else if(array[j] == 2){
                number[1]++;
            }
            else if(array[j] == 3){
                number[2]++;
            }
            else if(array[j] == 4){
                number[3]++;
            }
            else if(array[j] == 5){
                number[4]++;
            }
            else{
                number[5]++;
            }
        }
        ImageView soloresult_jpg = (ImageView)findViewById(R.id.img_existroom2result);
        if(number[3] == 4 && number[0] == 2){
            Glide.with(this).load(R.drawable.p1).into(soloresult_jpg);
        }
        else if(number[3] == 6){
            Glide.with(this).load(R.drawable.p2).into(soloresult_jpg);
        }
        else if(number[0] == 6){
            Glide.with(this).load(R.drawable.p3).into(soloresult_jpg);
        }
        else if(number[1] == 6){
            Glide.with(this).load(R.drawable.p4).into(soloresult_jpg);
        }
        else if(number[3] == 5){
            Glide.with(this).load(R.drawable.p5).into(soloresult_jpg);
        }
        else if(number[1] == 5){
            Glide.with(this).load(R.drawable.p6).into(soloresult_jpg);
        }
        else if(number[3] == 4){
            Glide.with(this).load(R.drawable.p7).into(soloresult_jpg);
        }
        else if(number[0]==1&&number[1]==1&&number[2]==1&&number[3]==1&&number[4]==1&&number[5]==1){
            Glide.with(this).load(R.drawable.p8).into(soloresult_jpg);
        }
        else if(number[3] == 3){
            Glide.with(this).load(R.drawable.p9).into(soloresult_jpg);
        }
        else if(number[1] == 4){
            Glide.with(this).load(R.drawable.p10).into(soloresult_jpg);
        }
        else if(number[3] == 2){
            Glide.with(this).load(R.drawable.p11).into(soloresult_jpg);
        }
        else if(number[3] == 1){
            Glide.with(this).load(R.drawable.p12).into(soloresult_jpg);
        }
        else{
            Glide.with(this).load(R.drawable.p0).into(soloresult_jpg);
        }

    }
    public int[] random(int[] array){
        for(int i = 0;i < 6;i++){
            int ran = (int)(Math.random()*6+1);
            array[i] = ran;
        }
        return array;
    }

}
