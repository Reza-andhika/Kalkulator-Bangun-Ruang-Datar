package com.example.user.kalkulator_rumus.Datar.Lingkaran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.kalkulator_rumus.R;

public class Lingkaran extends AppCompatActivity {
    private EditText ed_jari,ed_Diam,ed_Luas,ed_Keli;
    private Button Hitung,reset;
    private double jari,diameter,L,K,d,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        ///Inisalisasi
        ed_jari=(EditText)findViewById(R.id.jari);
        ed_Diam=(EditText)findViewById(R.id.diameter);
        ed_Luas=(EditText)findViewById(R.id.Luas);
        ed_Keli=(EditText)findViewById(R.id.Keliling);
        Hitung=(Button)findViewById(R.id.btn_hitung);
        reset=(Button)findViewById(R.id.btn_reset);

        ///aksi
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed_jari.setText("");
                ed_Diam.setText("");
                ed_Luas.setText("");
                ed_Keli.setText("");
            }
        });
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed_jari.getText().toString().length()==0 && ed_Diam.getText().toString().length()==0){
                    ed_jari.setError("Field Diperlukan");
                    ed_Diam.setError("Field Diperlukan");
                }
                else if(ed_jari.getText().toString().length()>0 && ed_Diam.getText().toString().length()==0){
                    ///L= phi.r^2, K=2.phi.r
                    jari=Double.parseDouble(ed_jari.getText().toString());
                    L=3.14*(jari*jari);
                    K=4*(3.14*jari);
                    d=2*jari;

                    ed_Luas.setText(String.format("%.2f",L));
                    ed_Keli.setText(String.format("%.2f",K));
                    ed_Diam.setText(String.format("%.2f",d));
                }
                else if(ed_jari.getText().toString().length()==0 && ed_Diam.getText().toString().length()>0){
                    ///L= phi.d^2/4, K=phi.d
                    diameter=Double.parseDouble(ed_Diam.getText().toString());
                    L=3.14*Math.pow(diameter,2)/4;
                    K=3.14*diameter;
                    r=diameter/2;

                    ed_Luas.setText(String.format("%.2f",L));
                    ed_Keli.setText(String.format("%.2f",K));
                    ed_jari.setText(String.format("%.2f",r));
                }
            }
        });
    }
}
