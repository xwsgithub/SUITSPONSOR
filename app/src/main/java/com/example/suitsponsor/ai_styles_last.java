package com.example.suitsponsor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ai_styles_last extends AppCompatActivity {

    private TextView next;
    private TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();   //隐藏标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_styles_last);

        initview();

        setListener();


    }

    private void setListener() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ai_styles_last.this, liangti_main.class));

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initview() {
        next = findViewById(R.id.ai_styles_last_next);
        back = findViewById(R.id.ai_styles_last_back);
    }
}
