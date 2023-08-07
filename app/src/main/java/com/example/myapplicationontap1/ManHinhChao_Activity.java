package com.example.myapplicationontap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ManHinhChao_Activity extends AppCompatActivity {

    //thời gian chờ
    int thoiGianCho = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ManHinhChao_Activity.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        }, thoiGianCho);
    }
}