package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SETTING extends AppCompatActivity {

    private Button mbtnSETTINGBACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mbtnSETTINGBACK = findViewById(R.id.btn_settingback);

        mbtnSETTINGBACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(SETTING.this,MainPage.class);
                startActivity(intent);
            }
        });
    }
}
