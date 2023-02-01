package com.demo.vendomachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    CheckBox cbLipton, cbMtDew, cbPepsi, cbWater;
    EditText amount;
    Button btnCalc;
    ImageView ivLipton, ivMtDew, ivPepsi, ivWater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbLipton = (CheckBox) findViewById(R.id.cbLipton);
        cbMtDew = (CheckBox) findViewById(R.id.cbMtDew);
        cbPepsi = (CheckBox) findViewById(R.id.cbPepsi);
        cbWater = (CheckBox) findViewById(R.id.cbWater);

        btnCalc = (Button) findViewById(R.id.btnCalc);

        amount = findViewById(R.id.etAmount);

        ivLipton = findViewById(R.id.ivLipton);
        ivMtDew = findViewById(R.id.ivMtdew);
        ivPepsi = findViewById(R.id.ivPepsi);
        ivWater = findViewById(R.id.ivWater);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input = Integer.parseInt(amount.getText().toString());

                int lipton = input - 69;
                int mtdew = input - 65;
                int pepsi = input - 55;
                int water = input - 35;

                if (input >= 69) {
                    cbLipton.setBackgroundColor(Color.GREEN);
                    cbMtDew.setBackgroundColor(Color.GREEN);
                    cbPepsi.setBackgroundColor(Color.GREEN);
                    cbWater.setBackgroundColor(Color.GREEN);

                    ivLipton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, Lipton.class);
                            i.putExtra("Change", lipton);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });

                    ivMtDew.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, MtDew.class);
                            i.putExtra("Change", mtdew);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });

                    ivPepsi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, Pepsi.class);
                            i.putExtra("Change", pepsi);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });

                    ivWater.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, Water.class);
                            i.putExtra("Change", water);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });
                }
                else if (input >= 65){
                    cbMtDew.setBackgroundColor(Color.GREEN);
                    cbPepsi.setBackgroundColor(Color.GREEN);
                    cbWater.setBackgroundColor(Color.GREEN);

                    ivMtDew.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, MtDew.class);
                            i.putExtra("Change", mtdew);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });

                    ivPepsi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, Pepsi.class);
                            i.putExtra("Change", pepsi);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });

                    ivWater.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, Water.class);
                            i.putExtra("Change", water);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });
                }
                else if (input >= 55){
                    cbPepsi.setBackgroundColor(Color.GREEN);
                    cbWater.setBackgroundColor(Color.GREEN);

                    ivPepsi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, Pepsi.class);
                            i.putExtra("Change", pepsi);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });

                    ivWater.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, Water.class);
                            i.putExtra("Change", water);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });
                }
                else if (input >= 35){
                    cbWater.setBackgroundColor(Color.GREEN);

                    ivWater.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(MainActivity.this, Water.class);
                            i.putExtra("Change", water);
                            i.putExtra("Amount", input);
                            startActivity(i);
                        }
                    });
                }
            }
        });
    }
}