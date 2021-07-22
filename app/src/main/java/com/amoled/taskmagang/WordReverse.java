package com.amoled.taskmagang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class WordReverse extends AppCompatActivity {
    EditText text;
    HashMap<Character, Integer> charCountMap;
    TextView result;
    Button btn_reverse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_reverse);

        text = findViewById(R.id.et_input_reverse);
        result = findViewById(R.id.tv_result_reverse);
        charCountMap = new HashMap<>();
        btn_reverse = findViewById(R.id.btn_show_reverse);

        btn_reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!text.getText().toString().isEmpty()) {
                    StringBuffer c = new StringBuffer(text.getText().toString());
                    result.setText(c.reverse());
                    Toast.makeText(WordReverse.this, "Inserted", Toast.LENGTH_LONG).show();
                } else {
                    text.setError("Enter NAME");
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}