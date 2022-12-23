package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    EditText EditTextTextMultiline,editText_Sayilar;
    Button   button_TekSayi_,button_CiftSayilar,button_TumListe;
    int uzunluk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_layout);
        editText_Sayilar = findViewById(R.id.editTextTextMultiline_Sayilar);
        button_CiftSayilar = findViewById(R.id.button12);
        button_TekSayi_ = findViewById(R.id.button13);
        button_TumListe = findViewById(R.id.button14);
    }
    public void CiftSayilar(View view){
        editText_Sayilar.setText("");
        uzunluk = Integer.parseInt(editText_Sayilar.getText().toString());
        for (int i = 0; i<= uzunluk ; i++ ){
            if(i % 2 == 0)
                EditTextTextMultiline.setText(EditTextTextMultiline.getText()+"\n"+i);
        }
    }
    public void TekSayi(View view){
        editText_Sayilar.setText("");
        uzunluk = Integer.parseInt(editText_Sayilar.getText().toString());
        for (int i=0;i<=uzunluk;i++){
            if (i%2!=0){
                EditTextTextMultiline.setText(EditTextTextMultiline.getText()+"\n"+i);
            }
        }
    }
    public void TumListe(View view){
        editText_Sayilar.setText("");
        uzunluk = Integer.parseInt(editText_Sayilar.getText().toString());
        for(int i=0;i<=uzunluk;i++){
            EditTextTextMultiline.setText(EditTextTextMultiline.getText()+"\n"+i);
            }
        }
    }