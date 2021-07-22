package com.amoled.taskmagang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelloWorld extends AppCompatActivity {

    EditText et_input;
    TextView tv_result;
    Button btn_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        et_input = findViewById(R.id.et_input_hw);
        tv_result = findViewById(R.id.tv_result_hw);
        btn_show = findViewById(R.id.btn_show_hw);

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_input.length()==0){
                    et_input.setError("Enter Value");
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }
                else {
                    String input = et_input.getText().toString();

                    int i = Integer.parseInt(input);
                    if (i % 5 == 0 && i % 3 == 0){
                          tv_result.setText("Hello World");
                          Toast.makeText(HelloWorld.this, "Inserted", Toast.LENGTH_LONG).show();
                    }else if(i % 3 == 0){
                        tv_result.setText("Hello");
                        Toast.makeText(HelloWorld.this, "Inserted", Toast.LENGTH_LONG).show();
                    }else if (i % 5 == 0){
                        tv_result.setText("World");
                        Toast.makeText(HelloWorld.this, "Inserted", Toast.LENGTH_LONG).show();
                    }else {
                        tv_result.setText(String.valueOf(i));
                        Toast.makeText(getApplicationContext(),"Angka tidak habis dibagi 3 atau 5",Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}