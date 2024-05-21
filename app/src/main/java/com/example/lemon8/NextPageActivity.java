package com.example.lemon8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class NextPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page); // Mengatur layout sesuai dengan NextPageActivity

        ImageButton btnSkip = findViewById(R.id.btnSkip); // Menggunakan ID yang sesuai dengan layout XML

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMainActivity();
            }
        });
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(NextPageActivity.this, MainActivity.class);
        startActivity(intent);
        finish(); // Menutup NextPageActivity agar tidak kembali saat menekan tombol back
    }
}
