package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity<ort> extends AppCompatActivity {
    EditText editText1, editText2, editText3;
    Button buttonOnayla;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);

        editText1 = findViewById(R.id.txtnumber1);
        editText2 = findViewById(R.id.txtnumber2);
        editText3 = findViewById(R.id.txtnumber3);
    }

    public void onayla(View view) {
        int not1 = Integer.parseInt(editText1.getText().toString());
        int not2 = Integer.parseInt(editText2.getText().toString());
        int not3 = Integer.parseInt(editText3.getText().toString());
        float ort = (not1 + not2 + not3 ) / 3;
        if (not1 <=100 && not2 <=100 && not3 <=100) {
            if (ort > 0 && ort <= 25)
            {
                Toast.makeText(this,"0 ile kaldınız",Toast.LENGTH_LONG).show();
            }
            else if (ort>=25 && ort<=50){
                Toast.makeText(this,"1 ile kaldınız",Toast.LENGTH_LONG).show();
            }
            else if (ort>=50 && ort<=60){
                Toast.makeText(this,"2 ile gectiniz",Toast.LENGTH_LONG).show();
            }
            else if (ort>=60 && ort<=70){
                Toast.makeText(this,"3 ile gectiniz",Toast.LENGTH_LONG).show();
            }
            else if (ort>=70 && ort<=85){
                Toast.makeText(this,"4 ile gectiniz",Toast.LENGTH_LONG).show();
            }
            else if (ort>=85 && ort<=100){
                Toast.makeText(this,"5 ile gectiniz",Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this,"Girilen Not hatalalıdır",Toast.LENGTH_LONG).show();
            }
        }
    }
}


