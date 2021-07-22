package com.amoled.taskmagang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckEmail extends AppCompatActivity {
    EditText email;
    Button btn_cek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_email);

        email = findViewById(R.id.email);
        btn_cek = findViewById(R.id.btn_cek);

        btn_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateEmail(email);
            }
        });
    }

    private boolean validateEmail(EditText toString) {
        String input = email.getText().toString();
        if (input.isEmpty()) {
            email.setError("Kolom tidak boleh kosong");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(input).matches()) {
            email.setError("Format email salah");
            Toast.makeText(CheckEmail.this, "Format email salah", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            email.setError(null);
            Toast.makeText(CheckEmail.this, "Format email benar", Toast.LENGTH_SHORT).show();
            return true;
        }
    }

}