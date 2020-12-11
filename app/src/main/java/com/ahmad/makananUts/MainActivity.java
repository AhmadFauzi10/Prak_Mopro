package com.ahmad.makananUts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button but_makanan, but_minuman, but_makan_penutup ;

    private void initBinding() {
        but_makanan = findViewById(R.id.btn_makanan);
        but_minuman = findViewById(R.id.btn_minuman);
        but_makan_penutup = findViewById(R.id.btn_desert);

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();

        but_makanan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuMakanan.class);
                startActivity(intent);
            }
        });

        but_minuman.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuMinuman.class);
                startActivity(intent);
            }
        });

        but_makan_penutup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuDesert.class);
                startActivity(intent);
            }
        });

    }
}