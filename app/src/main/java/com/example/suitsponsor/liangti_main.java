package com.example.suitsponsor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class liangti_main extends AppCompatActivity {

    private TextView back;
    private TextView xianxia;
    private TextView shangmen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();   //隐藏标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liangti_main);

        initView();

        setListner();

    }

    private void setListner() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        xianxia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(liangti_main.this,baidumap.class));
            }
        });
        shangmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(liangti_main.this,order_liangti.class));
            }
        });

    }

    private void initView() {
        back = findViewById(R.id.liangti_main_back);
        xianxia=findViewById(R.id.liangti_main_xianxia);
        shangmen = findViewById(R.id.liangti_main_shangmen);
    }
}
