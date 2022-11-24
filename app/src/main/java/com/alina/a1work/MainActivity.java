package com.alina.a1work;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText gmail = findViewById(R.id.edit2);
        TextView regLog = findViewById(R.id.text1);

        EditText password = findViewById(R.id.edit2);
        Button button = findViewById(R.id.button1);
        button.setOnClickListener(v -> {
            if (!gmail.getText().toString().equals("admin") && !gmail.getText().toString().equals("admin")) {
                Toast.makeText(this, "Пароль неверный", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show();
                gmail.setVisibility(View.INVISIBLE);
                password.setVisibility(View.INVISIBLE);
                button.setVisibility(View.INVISIBLE);
                regLog.setVisibility(View.INVISIBLE);
            }
        });
        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!s.toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(Color.parseColor("#FF5722"));
                } else {
                    button.setBackgroundColor(Color.parseColor("#9F9F9F"));

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!s.toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(Color.parseColor("#FF5722"));
                } else {
                    button.setBackgroundColor(Color.parseColor("#9F9F9F"));

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
    }
