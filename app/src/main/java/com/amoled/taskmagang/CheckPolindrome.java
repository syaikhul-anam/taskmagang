package com.amoled.taskmagang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckPolindrome extends AppCompatActivity {

    EditText et_input;
    Button btn_cek_polindrome;
    TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_polindrome);

        et_input = findViewById(R.id.et_input_polindrome);
        tv_result = findViewById(R.id.tv_result_polindrome);
        btn_cek_polindrome = findViewById(R.id.btn_cek_polindrome);

        btn_cek_polindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = et_input.getText().toString();
                String temp = "";
                for (int i=input.length()-1; i>=0; i--){
                    char c = input.charAt(i);
                    temp += String.valueOf(c);
                }

                if (input.toLowerCase().equals(temp.toLowerCase())){
                    tv_result.setText("Text adalah polindrome");
                }else {
                    tv_result.setText("Text bukan polindrome");
                }
            }
        });
    }
}