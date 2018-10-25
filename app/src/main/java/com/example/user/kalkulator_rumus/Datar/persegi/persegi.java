package com.example.user.kalkulator_rumus.Datar.persegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.kalkulator_rumus.R;

public class persegi extends AppCompatActivity {
    private EditText ed_Sisi,ed_Diag,ed_Luas,ed_Keli;
    private Button Hitung,reset;
    private double sisi,diagonal,L,K,D,S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        ///Inisialisasi
        ed_Sisi=(EditText)findViewById(R.id.sisi);
        ed_Diag=(EditText)findViewById(R.id.diagonal);
        ed_Luas=(EditText)findViewById(R.id.Luas);
        ed_Keli=(EditText)findViewById(R.id.Keliling);
        Hitung=(Button)findViewById(R.id.btn_hitung);
        reset=(Button)findViewById(R.id.btn_reset);

        ///aksi
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed_Sisi.setText("");
                ed_Diag.setText("");
                ed_Luas.setText("");
                ed_Keli.setText("");
            }
        });
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed_Sisi.getText().toString().length()==0 && ed_Diag.getText().toString().length()==0){
                    ed_Sisi.setError("Field Diperlukan");
                    ed_Diag.setError("Field Diperlukan");
                }
                else if(ed_Sisi.getText().toString().length()>0 && ed_Diag.getText().toString().length()==0){
                    ///L= SxS, K=4xS
                    sisi=Double.parseDouble(ed_Sisi.getText().toString());
                    L=sisi*sisi;
                    K=4*sisi;
                    D=Math.sqrt(Math.pow(sisi,2) + Math.pow(sisi,2));

                    ed_Luas.setText(String.format("%.2f",L));
                    ed_Keli.setText(String.format("%.2f",K));
                    ed_Diag.setText(String.format("%.2f",D));
                }
                else if(ed_Sisi.getText().toString().length()==0 && ed_Diag.getText().toString().length()>0){
                    diagonal=Double.parseDouble(ed_Diag.getText().toString());
                    S=Math.sqrt(0.5*Math.pow(diagonal,2));
                    L=0.5*Math.pow(diagonal,2);
                    K=4*Math.sqrt(0.5*Math.pow(diagonal,2));

                    ed_Luas.setText(String.format("%.2f",L));
                    ed_Keli.setText(String.format("%.2f",K));
                    ed_Sisi.setText(String.format("%.2f",S));
                }
            }
        });
    }
}
