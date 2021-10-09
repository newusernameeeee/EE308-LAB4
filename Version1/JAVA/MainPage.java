package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    private Button mbtnSELF;
    private Button mbtnRULE;
    private Button mbtnSETTING;
    private Button mbtnGROUP;
    private Button mbtnSOLO;
    private Button mbtnEXIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);//这个一定要在前面！！！！！

        mbtnSELF = findViewById(R.id.btn_self);
        mbtnRULE = findViewById(R.id.btn_rule);
        mbtnSETTING = findViewById(R.id.btn_setting);
        mbtnGROUP = findViewById(R.id.btn_group);
        mbtnSOLO = findViewById(R.id.btn_solo);
        mbtnEXIT = findViewById(R.id.btn_exit);

        setListener();
    }
    private void setListener(){
        Onclick onclick = new Onclick();
        mbtnSELF.setOnClickListener(onclick);
        mbtnRULE.setOnClickListener(onclick);
        mbtnSETTING.setOnClickListener(onclick);
        mbtnEXIT.setOnClickListener(onclick);
        mbtnSOLO.setOnClickListener(onclick);
        mbtnGROUP.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_self:
                    intent = new Intent(MainPage.this,SELF.class);
                    break;
                case R.id.btn_rule:
                    intent = new Intent(MainPage.this,RULE.class);
                    break;
                case R.id.btn_setting:
                    intent = new Intent(MainPage.this,SETTING.class);
                    break;
                case R.id.btn_solo:
                    intent = new Intent(MainPage.this,SOLO.class);
                    break;
                case R.id.btn_group:
                    intent = new Intent(MainPage.this,GROUP.class);
                    break;
                case R.id.btn_exit:
                    intent = new Intent(MainPage.this,MainActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}
