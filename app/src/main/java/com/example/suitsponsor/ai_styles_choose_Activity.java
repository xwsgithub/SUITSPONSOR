package com.example.suitsponsor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ai_styles_choose_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();   //隐藏标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_styles_choose_);

        Button button=findViewById(R.id.ai_styles_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ai_styles_choose_Activity.this,ai_styles_recommand_Activity.class));
            }
        });

        findViewById(R.id.ai_styles_choose_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
