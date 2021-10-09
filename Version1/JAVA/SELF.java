package com.example.bobobing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SELF extends AppCompatActivity {

    private Button mbtnSELFBACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);

        mbtnSELFBACK = findViewById(R.id.btn_selfback);

        mbtnSELFBACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(SELF.this,MainPage.class);
                startActivity(intent);
            }
        });
    }
}
