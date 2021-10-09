package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JOINGROUP extends AppCompatActivity {

    private Button mbtnJOINEXIT;
    private Button mbtnJOINENTER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joingroup);

        mbtnJOINENTER = findViewById(R.id.btn_joinenter);
        mbtnJOINEXIT = findViewById(R.id.btn_joinexit);

        setListener();
    }

    private void setListener(){
        Onclick onclick = new Onclick();
        mbtnJOINENTER.setOnClickListener(onclick);
        mbtnJOINEXIT.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_joinenter:
                    intent = new Intent(JOINGROUP.this,EXISTROOM.class);
                    break;
                case R.id.btn_joinexit:
                    intent = new Intent(JOINGROUP.this,GROUP.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
