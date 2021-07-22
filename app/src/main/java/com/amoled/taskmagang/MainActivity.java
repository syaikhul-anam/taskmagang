package com.amoled.taskmagang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_hw,btn_cek_email,btn_reverse_word,btn_cek_polin,btn_convert_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_hw = findViewById(R.id.btn_hw);
        btn_cek_email = findViewById(R.id.btn_cek_email);
        btn_reverse_word = findViewById(R.id.btn_reverse_word);
        btn_cek_polin = findViewById(R.id.btn_cek_polindrome);
        btn_convert_time = findViewById(R.id.btn_convert_time);

        btn_hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,HelloWorld.class);
                startActivity(i);
            }
        });

        btn_cek_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,CheckEmail.class);
                startActivity(i);
            }
        });

        btn_reverse_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,WordReverse.class);
                startActivity(i);
            }
        });

        btn_cek_polin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,CheckPolindrome.class);
                startActivity(i);
            }
        });

        btn_convert_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ConvertTime.class);
                startActivity(i);
            }
        });
    }
}