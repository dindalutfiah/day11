package com.example.lemon8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        private ImageView window5_1;
        private ImageView window5_2;
        private ImageView window5_3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main); // Mengatur layout sesuai dengan MainActivity

            // Menghubungkan ImageView
            window5_1 = findViewById(R.id.window5_1);
            window5_2 = findViewById(R.id.window5_2);
            window5_3 = findViewById(R.id.window5_3);

            // Memastikan gambar ditampilkan sesuai dengan layout XML
            window5_1.setImageResource(R.drawable.window5_1);
            window5_2.setImageResource(R.drawable.window5_2);
            window5_3.setImageResource(R.drawable.window5_3);
        }
    }

