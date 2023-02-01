package com.demo.vendomachine;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MtDew extends AppCompatActivity {
    Button btnBack;
    TextView tvChange, tvAmountEntered;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mt_dew);

        btnBack = findViewById(R.id.btnBack);
        tvChange = findViewById(R.id.tvChange);
        tvAmountEntered = findViewById(R.id.tvAmountEntered);
        i = getIntent();

        tvAmountEntered.setText("Amount Entered: "+ i.getIntExtra("Amount", 0));
        tvChange.setText("Change: " + i.getIntExtra("Change",0));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MtDew.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}