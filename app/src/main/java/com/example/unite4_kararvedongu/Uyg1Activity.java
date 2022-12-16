package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);
    }

    public void kontrolEt(View view) {
        Button button = findViewById(R.id.btnKontrolEt);
        EditText number = findViewById(R.id.editTextNumber);

        int sayi = Integer.parseInt(number.getText().toString());
        if (sayi > 100) {
            Toast.makeText(this, "100’den Büyük Not Olamaz", Toast.LENGTH_SHORT).show();
        }
    }
}
