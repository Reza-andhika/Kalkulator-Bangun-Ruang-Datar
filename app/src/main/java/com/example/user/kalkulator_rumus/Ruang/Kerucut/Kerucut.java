package com.example.user.kalkulator_rumus.Ruang.Kerucut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.kalkulator_rumus.R;

public class Kerucut extends AppCompatActivity {
    private EditText jari,tinggi,garis,diameter,Ls,La,volume,Luas;
    private Button btnHitung,btnReset;
    private double r,t,s,d,Vol,L_alas,L_selimut,L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);
        ///Inisialisasi
        jari=(EditText)findViewById(R.id.jari);
        tinggi=(EditText)findViewById(R.id.tinggi);
        garis=(EditText)findViewById(R.id.garis);
        diameter=(EditText)findViewById(R.id.diagonal);
        Ls=(EditText)findViewById(R.id.Luas_selimut);
        La=(EditText)findViewById(R.id.Luas_alas);
        Luas=(EditText)findViewById(R.id.Luas);
        volume=(EditText)findViewById(R.id.Volum);
        btnHitung=(Button)findViewById(R.id.btn_hitung);
        btnReset=(Button)findViewById(R.id.btn_reset);
        //aksi
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jari.setText("");
                tinggi.setText("");
                garis.setText("");
                diameter.setText("");
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jari.getText().toString().length()==0&&tinggi.getText().toString().length()==0&&garis.getText().toString().length()==0
                        && diameter.getText().toString().length()==0){
                    jari.setError("Field Diperlukan");
                    tinggi.setError("Field Diperlukan");
                    garis.setError("Field Diperlukan");
                    diameter.setError("Field Diperlukan");
                }
               else if(jari.getText().toString().length()>0&&tinggi.getText().toString().length()==0&&garis.getText().toString().length()==0
                        && diameter.getText().toString().length()==0){
                   // jari.setError("Field Diperlukan");
                    tinggi.setError("Field Diperlukan");
                    garis.setError("Field Diperlukan");
                    diameter.setError("Field Diperlukan");
                }
                else if(jari.getText().toString().length()==0&&tinggi.getText().toString().length()>0&&garis.getText().toString().length()==0
                        && diameter.getText().toString().length()==0){
                     jari.setError("Field Diperlukan");
                    //tinggi.setError("Field Diperlukan");
                    garis.setError("Field Diperlukan");
                    diameter.setError("Field Diperlukan");
                }
                else if(jari.getText().toString().length()==0&&tinggi.getText().toString().length()==0&&garis.getText().toString().length()>0
                        && diameter.getText().toString().length()==0){
                    jari.setError("Field Diperlukan");
                    tinggi.setError("Field Diperlukan");
                    //garis.setError("Field Diperlukan");
                    diameter.setError("Field Diperlukan");
                }
                else if(jari.getText().toString().length()==0&&tinggi.getText().toString().length()==0&&garis.getText().toString().length()==0
                        && diameter.getText().toString().length()>0){
                    jari.setError("Field Diperlukan");
                    tinggi.setError("Field Diperlukan");
                    garis.setError("Field Diperlukan");
                    ///diameter.setError("Field Diperlukan");
                }
                else if(jari.getText().toString().length()>0&&tinggi.getText().toString().length()==0&&garis.getText().toString().length()==0
                        && diameter.getText().toString().length()>0){
                    //jari.setError("Field Diperlukan");
                    tinggi.setError("Masukan Nilai");
                    garis.setError("Masukan Nilai");
                    ///diameter.setError("Field Diperlukan");
                }
                else if(jari.getText().toString().length()>0&&tinggi.getText().toString().length()>0&&garis.getText().toString().length()==0
                        && diameter.getText().toString().length()==0){
                    r=Double.parseDouble(jari.getText().toString());
                    t=Double.parseDouble(tinggi.getText().toString());

                    Vol=1/3*(3.14*Math.pow(r,2)*t);
                    L_alas=3.14*Math.pow(r,2);
                    s=Math.sqrt(Math.pow(r,2)+Math.pow(t,2));
                    L_selimut=3.14*r*s;
                    d=2*r;

                    volume.setText(String.format("%.2f",Vol));
                    garis.setText(String.format("%.2f",s));
                    La.setText(String.format("%.2f",L_alas));
                    Ls.setText(String.format("%.2f",L_selimut));
                    diameter.setText(String.format("%.2f",d));
                }
                else if(jari.getText().toString().length()>0&&tinggi.getText().toString().length()==0&&garis.getText().toString().length()>0
                        && diameter.getText().toString().length()==0){
                    r=Double.parseDouble(jari.getText().toString());
                    s=Double.parseDouble(garis.getText().toString());

                    t=Math.sqrt(Math.pow(s,2)-Math.pow(r,2));
                    Vol=1/3*(3.14*Math.pow(r,2)*t);
                    L_alas=3.14*Math.pow(r,2);
                    L_selimut=3.14*r*s;
                    d=2*r;

                    if(r>s){
                        jari.setError("Error r > s");
                    }
                    else{
                        volume.setText(String.format("%.2f",Vol));
                        tinggi.setText(String.format("%.2f",t));
                        La.setText(String.format("%.2f",L_alas));
                        Ls.setText(String.format("%.2f",L_selimut));
                        diameter.setText(String.format("%.2f",d));
                    }
                }
                else if(jari.getText().toString().length()==0&&tinggi.getText().toString().length()>0&&garis.getText().toString().length()>0
                        && diameter.getText().toString().length()==0){
                    t=Double.parseDouble(tinggi.getText().toString());
                    s=Double.parseDouble(garis.getText().toString());

                    r=Math.sqrt(Math.pow(s,2)-Math.pow(t,2));
                    Vol=1/3*(3.14*Math.pow(r,2)*t);
                    L_alas=3.14*Math.pow(r,2);
                    L_selimut=3.14*r*s;
                    d=2*r;

                    if (s>t){
                        tinggi.setError("Error t > s");
                    }
                    else{
                        volume.setText(String.format("%.2f",Vol));
                        tinggi.setText(String.format("%.2f",t));
                        La.setText(String.format("%.2f",L_alas));
                        Ls.setText(String.format("%.2f",L_selimut));
                        diameter.setText(String.format("%.2f",d));
                    }
                }
                else if(jari.getText().toString().length()==0&&tinggi.getText().toString().length()>0&&garis.getText().toString().length()==0
                        && diameter.getText().toString().length()>0){
                    d=Double.parseDouble(diameter.getText().toString());
                    t=Double.parseDouble(tinggi.getText().toString());

                    r=d/2;
                    s=Math.sqrt(Math.pow(t,2)+Math.pow(r,2));
                    Vol=1/3*(3.14*Math.pow(r,2)*t);
                    L_alas=3.14*Math.pow(r,2);
                    L_selimut=3.14*r*s;

                    if (r>s){
                        jari.setText(String.format("%.2f",r));
                        jari.setError("Error r > s");
                    }
                    else{
                        volume.setText(String.format("%.2f",Vol));
                        garis.setText(String.format("%.2f",s));
                        La.setText(String.format("%.2f",L_alas));
                        Ls.setText(String.format("%.2f",L_selimut));
                        jari.setText(String.format("%.2f",r));
                    }
                }
                else if(jari.getText().toString().length()==0&&tinggi.getText().toString().length()==0&&garis.getText().toString().length()>0
                        && diameter.getText().toString().length()>0){
                    d=Double.parseDouble(diameter.getText().toString());
                    s=Double.parseDouble(garis.getText().toString());

                    r=d/2;
                    t=Math.sqrt(Math.pow(s,2)-Math.pow(r,2));
                    Vol=1/3*(3.14*Math.pow(r,2)*t);
                    L_alas=3.14*Math.pow(r,2);
                    L_selimut=3.14*r*s;

                    if (r>s){
                        jari.setText(String.format("%.2f",r));
                        jari.setError("Error r > s");
                    }
                    else{
                        volume.setText(String.format("%.2f",Vol));
                        tinggi.setText(String.format("%.2f",t));
                        La.setText(String.format("%.2f",L_alas));
                        Ls.setText(String.format("%.2f",L_selimut));
                        jari.setText(String.format("%.2f",r));
                    }
                }
            }
        });
    }
}
