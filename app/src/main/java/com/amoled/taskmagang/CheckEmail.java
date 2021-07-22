package com.amoled.taskmagang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class CheckEmail extends AppCompatActivity {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^" +
                            "[a-z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                            "\\@" +
                            "[a-z0-9]{1,10}" +
                            "\\." +
                            "[?:!id|!co\\.id]{1,5}");
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
        } else if (!EMAIL_PATTERN.matcher(input).matches()) {
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