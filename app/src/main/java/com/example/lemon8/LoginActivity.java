package com.example.lemon8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Pastikan nama file XML sesuai dengan activity_login

        ImageButton btnSkip = findViewById(R.id.btnSkip);

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNextActivity();
            }
        });
    }

    private void navigateToNextActivity() {
        Intent intent = new Intent(LoginActivity.this, NextActivity.class); // Ganti dengan activity tujuan
        startActivity(intent);
        finish(); // Menutup LoginActivity agar tidak kembali saat menekan tombol back
    }
}
