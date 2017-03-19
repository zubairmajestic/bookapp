package com.example.ctadmin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main4Activity extends AppCompatActivity {
    private ImageButton btn,btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageButton btn = (ImageButton)findViewById(R.id.imageButton5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, Main9Activity.class));
            }
        });

        ImageButton btn1 = (ImageButton)findViewById(R.id.imageButton6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, Main10Activity.class));
            }
        });
        ImageButton btn2 = (ImageButton)findViewById(R.id.imageButton7);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, Main11Activity.class));
            }
        });
        ImageButton btn3 = (ImageButton)findViewById(R.id.imageButton8);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, Main12Activity.class));
            }
        });


    }
}
