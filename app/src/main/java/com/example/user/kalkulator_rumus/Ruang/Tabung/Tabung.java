package com.example.user.kalkulator_rumus.Ruang.Tabung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.kalkulator_rumus.R;

public class Tabung extends AppCompatActivity {
    private EditText tinggi,jari,diameter,volume,L_permukaan,L_alas,L_selimut;
    private Button btnHitung,btnReset;
    private double t,r,d,Vol,L,Luas_alas,Luas_selimut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        ///Inisialisasi
        tinggi=(EditText)findViewById(R.id.tinggi);
        jari=(EditText)findViewById(R.id.jari);
        diameter=(EditText)findViewById(R.id.diameter);
        volume=(EditText)findViewById(R.id.Volum);
        L_permukaan=(EditText)findViewById(R.id.Luas);
        L_alas=(EditText)findViewById(R.id.Luas_alas);
        L_selimut=(EditText)findViewById(R.id.Luas_selimut);
        btnReset=(Button)findViewById(R.id.btn_reset);
        btnHitung=(Button)findViewById(R.id.btn_hitung);
        ///aksi
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinggi.setText("");
                jari.setText("");
                diameter.setText("");
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tinggi.getText().toString().length()==0&&jari.getText().toString().length()==0
                        &&diameter.getText().toString().length()==0){
                    tinggi.setError("Field Diperlukan");
                    jari.setError("Field Diperlukan");
                    diameter.setError("Field Diperlukan");
                }
                else if(tinggi.getText().toString().length()>0&&jari.getText().toString().length()==0
                        &&diameter.getText().toString().length()==0){
                    //tinggi.setError("Field Diperlukan");
                    jari.setError("Field Diperlukan");
                    diameter.setError("Field Diperlukan");
                }
                else if(tinggi.getText().toString().length()==0&&jari.getText().toString().length()>0
                        &&diameter.getText().toString().length()==0){
                    tinggi.setError("Field Diperlukan");
                    //jari.setError("Field Diperlukan");
                    //diameter.setError("Field Diperlukan");
                }
                else if(tinggi.getText().toString().length()==0&&jari.getText().toString().length()==0
                        &&diameter.getText().toString().length()>0){
                    tinggi.setError("Field Diperlukan");
                    //jari.setError("Field Diperlukan");
                    //diameter.setError("Field Diperlukan");
                }
                else if(tinggi.getText().toString().length()>0&&jari.getText().toString().length()>0
                        &&diameter.getText().toString().length()==0){
                    t=Double.parseDouble(tinggi.getText().toString());
                    r=Double.parseDouble(jari.getText().toString());

                    d=2*r;
                    Luas_alas=3.14*Math.pow(r,2);
                    Luas_selimut=2*(3.14*r*t);
                    L=2*Luas_alas+Luas_selimut;
                    Vol=3.14*Math.pow(2,r)*t;

                    diameter.setText(String.format("%.2f",d));
                    L_alas.setText(String.format("%.2f",Luas_alas));
                    L_selimut.setText(String.format("%.2f",L_selimut));
                    volume.setText(String.format("%.2f",Vol));
                    L_permukaan.setText(String.format("%.2f",L));
                }
                else if(tinggi.getText().toString().length()>0&&jari.getText().toString().length()==0
                        &&diameter.getText().toString().length()>0){
                    t=Double.parseDouble(tinggi.getText().toString());
                    d=Double.parseDouble(diameter.getText().toString());

                    r=d/2;
                    Luas_alas=3.14*Math.pow(r,2);
                    Luas_selimut=2*(3.14*r*t);
                    L=2*Luas_alas+Luas_selimut;
                    Vol=3.14*Math.pow(2,r)*t;

                    jari.setText(String.format("%.2f",r));
                    L_alas.setText(String.format("%.2f",Luas_alas));
                    L_selimut.setText(String.format("%.2f",L_selimut));
                    volume.setText(String.format("%.2f",Vol));
                    L_permukaan.setText(String.format("%.2f",L));
                }
            }
        });
    }
}
