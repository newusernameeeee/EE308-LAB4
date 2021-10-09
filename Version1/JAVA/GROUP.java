package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GROUP extends AppCompatActivity {

    private Button mbtnGROUPBACK;
    private Button mbtnCREATGROUP;
    private Button mbtnJOINGROUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        mbtnGROUPBACK = findViewById(R.id.btn_groupback);
        mbtnCREATGROUP = findViewById(R.id.btn_creatroom);
        mbtnJOINGROUP = findViewById(R.id.btn_joinroom);

        setListener();
    }

    private void setListener(){
        Onclick onclick = new Onclick();
        mbtnGROUPBACK.setOnClickListener(onclick);
        mbtnCREATGROUP.setOnClickListener(onclick);
        mbtnJOINGROUP.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_groupback:
                    intent = new Intent(GROUP.this,MainPage.class);
                    break;
                case R.id.btn_creatroom:
                    intent = new Intent(GROUP.this,CREATGROUP.class);
                    break;
                case R.id.btn_joinroom:
                    intent = new Intent(GROUP.this,JOINGROUP.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
