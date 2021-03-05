package com.iamyeong.apiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_main;
    private TextView tv_main;
    private AirInfoExproler exproler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_main = findViewById(R.id.btn_main);
        tv_main = findViewById(R.id.tv_main);

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        exproler = new AirInfoExproler();


                    }
                });

            }
        });


    }
}
