package com.example.suitsponsor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ai_styles_recommend_double_no extends AppCompatActivity {


    private TextView next;
    private TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();   //隐藏标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_styles_recommend_double_no);

        initView();

        setListener();

    }

    private void initView() {
        next = findViewById(R.id.activity_ai_styles_recommend_double_no_next);
        back=findViewById(R.id.ai_styles_recommand_double_no_back);
    }

    private void setListener() {

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ai_styles_recommend_double_no.this,mianliao_choose_Activity.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
