package com.example.suitsponsor;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mianliao_choose_Activity extends AppCompatActivity {



    int []ids1={
            R.id.mianliao_choose_blue,
            R.id.mianliao_choose_black,
            R.id.mianliao_choose_gray
    };

    boolean []flags1={false,false,false};   //记录选择了哪种颜色


    int []ids2={
            R.id.mianliao_choose_cunti,
            R.id.mianliao_choose_banmao,
            R.id.mianliao_choose_quanmao
    };


    int []ids3={
            R.id.mianliao_choose_boxing,
            R.id.mianliao_choose_shizhong,
            R.id.mianliao_choose_houxing
    };

    int []ids4={
            R.id.mianliao_choose_boxing2,
            R.id.mianliao_choose_shizhong2,
            R.id.mianliao_choose_houxing2
    };

    int []ids5={
            R.id.mianliao_choose_boxing3,
            R.id.mianliao_choose_shizhong3,
            R.id.mianliao_choose_houxing3
    };



    boolean []flags2={false,false,false};   //记录选择了哪种成分

    boolean []flags3={false,false,false};   //记录选择了哪种厚度

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();   //隐藏标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mianliao_choose_);


        setListner();


    }

    private void setListner() {


        for (int i = 0; i <ids1.length ; i++) {

            final int finalI = i;
            findViewById(ids1[i]).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    findViewById(ids1[0]).setBackgroundResource(0);
                    findViewById(ids1[1]).setBackgroundResource(0);
                    findViewById(ids1[2]).setBackgroundResource(0);
                    v.setBackgroundResource(R.mipmap.mianliao_choosen1);
                    flags1[0]=false;
                    flags1[1]=false;
                    flags1[2]=false;
                    flags1[finalI]=true;

                }
            });
        }

        for (int i = 0; i <ids2.length ; i++) {

            final int finalI = i;
            findViewById(ids2[i]).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    findViewById(ids2[0]).setBackgroundResource(0);
                    findViewById(ids2[1]).setBackgroundResource(0);
                    findViewById(ids2[2]).setBackgroundResource(0);
                    v.setBackgroundResource(R.mipmap.mianliao_choosen2);
                    flags2[0]=false;
                    flags2[1]=false;
                    flags2[2]=false;
                    flags2[finalI]=true;
                }
            });

        }


        for (int i = 0; i <ids3.length ; i++) {

            final int finalI = i;
            findViewById(ids3[i]).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    flags3[0]=false;
                    flags3[1]=false;
                    flags3[2]=false;

                    findViewById(ids3[0]).setBackgroundResource(R.mipmap.mianliao_choose_bg1);
                    findViewById(ids3[1]).setBackgroundResource(R.mipmap.mianliao_choose_bg1);
                    findViewById(ids3[2]).setBackgroundResource(R.mipmap.mianliao_choose_bg1);

                    for (int j = 0; j <ids4.length ; j++) {
                        TextView textView=findViewById(ids4[j]);
                        textView.setTextColor(getResources().getColor(R.color.black));

                    }


                    for (int j = 0; j <ids5.length ; j++) {
                        TextView textView=findViewById(ids5[j]);
                        textView.setTextColor(getResources().getColor(R.color.gray));

                    }
                    flags3[finalI]=true;

                    v.setBackgroundResource(R.mipmap.mianliao_choose_bg2);
                    TextView textView=findViewById(ids4[finalI]);
                    textView.setTextColor(getResources().getColor(R.color.white));
                    textView=findViewById(ids5[finalI]);
                    textView.setTextColor(getResources().getColor(R.color.white));
                }
            });

        }

        findViewById(R.id.mianliao_choose_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mianliao_choose_Activity.this,ai_styles_last.class));
            }
        });

        findViewById(R.id.mianliao_choose_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}
