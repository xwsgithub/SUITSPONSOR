package com.example.suitsponsor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ai_styles_recommand_Activity extends AppCompatActivity {


    static boolean flag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();   //隐藏标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_styles_recommand);



        findViewById(R.id.ai_styles_recommand_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.ai_styles_recommand_yes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 2019/5/29 满意之后的跳转

            }
        });

        findViewById(R.id.ai_styles_recommand_no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flag){
                    flag=false;
                    startActivity(new Intent(ai_styles_recommand_Activity.this,ai_styles_recommand_no_Activity.class));
                }else {
                    flag=true;
                    startActivity(new Intent(ai_styles_recommand_Activity.this,ai_styles_recommend_double_no.class));
                }

            }
        });



    }
}
