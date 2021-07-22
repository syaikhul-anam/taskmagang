package com.amoled.taskmagang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertTime extends AppCompatActivity {

    TextView tv_time,tv_result_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_time);

        tv_time = findViewById(R.id.tv_time);
        tv_result_time = findViewById(R.id.tv_result_time);

        Date timestamp = new Date();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
        String strDate = dateFormat.format(timestamp);
        tv_result_time.setText(strDate);
    }

}