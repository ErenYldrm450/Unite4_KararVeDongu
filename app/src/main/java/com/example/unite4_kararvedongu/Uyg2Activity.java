package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);
    }
    public void kontrolEt2 (View view){
        Button button = findViewById(R.id.btnKontrolEt2);
        EditText edittext_sayi1 = findViewById(R.id.editTextNumber2);
        EditText edittext_sayi2 = findViewById(R.id.editTextNumber3);

        int sayi1 = Integer.parseInt(edittext_sayi1.getText().toString());
        int sayi2 = Integer.parseInt(edittext_sayi2.getText().toString());
        if(sayi1>sayi2){
            Toast.makeText(Uyg2Activity.this,"1. Sayı Daha Büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(sayi2>sayi1){
            Toast.makeText(Uyg2Activity.this,"2. Sayı Daha Büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(sayi1==sayi2){
            Toast.makeText(Uyg2Activity.this,"İki Sayı Birbirine Eşittir.",Toast.LENGTH_LONG).show();
        }
    }
}
