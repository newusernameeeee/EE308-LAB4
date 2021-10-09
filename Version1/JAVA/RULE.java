package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RULE extends AppCompatActivity {

    private Button mbtnRULEBACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);

        mbtnRULEBACK = findViewById(R.id.btn_ruleback);

        mbtnRULEBACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(RULE.this,MainPage.class);
                startActivity(intent);
            }
        });
    }
}
