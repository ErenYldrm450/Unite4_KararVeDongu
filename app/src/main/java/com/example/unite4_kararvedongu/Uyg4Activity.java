package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    Switch konumServisleri,konumGonder,konumAl;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);

        konumServisleri = findViewById(R.id.konumServisleri);
        konumAl = findViewById(R.id.konumAl);
        konumGonder = findViewById(R.id.konumGonder);


    if (konumServisleri.isChecked()){
        konumAl.setVisibility(View.VISIBLE);
        konumGonder.setVisibility(View.VISIBLE);
    }
    else {
        konumAl.setVisibility(View.GONE);
        konumGonder.setVisibility(View.GONE);
    }
    }

    protected void onResume() {
        super.onResume();
        konumServisleri.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (konumServisleri.isChecked()) {
                    konumAl.setVisibility(View.VISIBLE);
                    konumGonder.setVisibility(View.VISIBLE);

                } else {
                    konumAl.setVisibility(View.GONE);
                    konumGonder.setVisibility(View.GONE);
                }
            }
        });
    }
    protected void onayla(View view){
        if (!konumServisleri.isChecked())
        {
            Toast.makeText(this,"konum servisleri kapalı",Toast.LENGTH_LONG).show();
        }else {
            if (konumAl.isChecked()== true && konumGonder.isChecked()==true){
                Toast.makeText(this,"konum al ve gonder konum acık",Toast.LENGTH_LONG).show();
            }
            if(konumAl.isChecked()== true && konumGonder.isChecked()==false){
                Toast.makeText(this,"konum al acık konum godner kapalı",Toast.LENGTH_LONG).show();
            }
            if (konumAl.isChecked()== true && konumGonder.isChecked()==true){
                Toast.makeText(this,"konum al kapalı konum gonder acık",Toast.LENGTH_LONG).show();
            }
            if (konumAl.isChecked()==true && konumGonder.isChecked()==false){
                Toast.makeText(this,"konum al ve konum gonderme kapalı",Toast.LENGTH_LONG).show();
            }
        }
    }
    }