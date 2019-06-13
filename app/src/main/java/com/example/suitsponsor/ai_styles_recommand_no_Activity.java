package com.example.suitsponsor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ai_styles_recommand_no_Activity extends AppCompatActivity {


    private int[] count={0,0,0,0,0,0,0,0,0};
    private int[]  ids={
            R.id.lkzx,
            R.id.mjkd,
            R.id.kkxt,
            R.id.ckwz,
            R.id.btkz,
            R.id.xbxz,
            R.id.xdsj,
            R.id.ydsj,
            R.id.kcsj
    };
    private TextView next;
    private TextView back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();   //隐藏标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_styles_recommand_no);

        initView();
        setOnclick();


    }

    private void setOnclick() {

        for (int i = 0; i <count.length ; i++) {
            final TextView textView=findViewById(ids[i]);
            final int finalI = i;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(count[finalI]%2==0){
                        textView.setBackgroundResource(R.color.gray);
                        textView.setTextColor(getResources().getColor(R.color.white));
                        count[finalI]++;
                    }else {
                        textView.setBackgroundResource(R.color.white);
                        textView.setTextColor(getResources().getColor(R.color.black));
                        count[finalI]++;
                    }
                }
            });

        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ai_styles_recommand_no_Activity.this,ai_styles_recommand_Activity.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

    private void initView() {

        next = findViewById(R.id.ai_styles_recommand_no_next);
        back=findViewById(R.id.ai_styles_recommand_no_back);
    }


}
