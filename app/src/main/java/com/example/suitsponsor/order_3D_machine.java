package com.example.suitsponsor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class order_3D_machine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();   //隐藏标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_3_d_machine);

        findViewById(R.id.order_3d_machine_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(order_3D_machine.this,order_3d_passwd.class));
            }
        });
    }
}
