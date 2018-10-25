package com.example.user.kalkulator_rumus.Ruang.Bola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.kalkulator_rumus.R;

public class Bola extends AppCompatActivity {
    private EditText jari,diagonal,volume,L_alas;
    private Button btnHitung,btnReset;
    private double diag,r,Vol,L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);
        jari=(EditText)findViewById(R.id.jari);
        diagonal=(EditText)findViewById(R.id.diagon);
        volume=(EditText)findViewById(R.id.Volum);
        L_alas=(EditText)findViewById(R.id.Luas);
        btnHitung=(Button)findViewById(R.id.btn_hitung);
        btnReset=(Button)findViewById(R.id.btn_reset);
        //aksi
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jari.setText("");
                diagonal.setText("");
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jari.getText().toString().length()==0&&diagonal.getText().toString().length()==0){
                    jari.setError("Field Diperlukan");
                    diagonal.setError("Field Diperlukan");
                }
                else if(jari.getText().toString().length()>0&&diagonal.getText().toString().length()==0){
                    r=Double.parseDouble(jari.getText().toString());

                    Vol=4/3*(3.14*Math.pow(r,3));
                    L=4*(3.14*Math.pow(r,2));
                    diag=2*r;

                    volume.setText(String.format("%.2f",Vol));
                    L_alas.setText(String.format("%.2f",L));
                    diagonal.setText(String.format("%.2f",diag));
                }
                else if(jari.getText().toString().length()==0&&diagonal.getText().toString().length()>0){
                    diag=Double.parseDouble(diagonal.getText().toString());

                    r=diag/2;
                    Vol=4/3*(3.14*Math.pow(r,3));
                    L=4*(3.14*Math.pow(r,2));

                    volume.setText(String.format("%.2f",Vol));
                    L_alas.setText(String.format("%.2f",L));
                    jari.setText(String.format("%.2f",r));
                }
            }
        });
    }
}
