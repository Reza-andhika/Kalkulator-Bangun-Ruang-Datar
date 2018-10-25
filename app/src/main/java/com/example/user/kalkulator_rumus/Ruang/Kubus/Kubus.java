package com.example.user.kalkulator_rumus.Ruang.Kubus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.kalkulator_rumus.R;

public class Kubus extends AppCompatActivity {
    private EditText sisi_a,diag_ruang,diag_bidang,volume,L_alas;
    private Button btnHitung,btnReset;
    private double a,D_ruang,D_bidang,Vol,L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        ///Inisialisasi
        sisi_a=(EditText)findViewById(R.id.sisi_a);
        diag_ruang=(EditText)findViewById(R.id.diagonal_ruang);
        diag_bidang=(EditText)findViewById(R.id.diagonal_bidang);
        volume=(EditText)findViewById(R.id.Volum);
        L_alas=(EditText)findViewById(R.id.Luas);
        btnHitung=(Button)findViewById(R.id.btn_hitung);
        btnReset=(Button)findViewById(R.id.btn_reset);
        //aksi
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sisi_a.setText("");
                diag_bidang.setText("");
                diag_ruang.setText("");
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sisi_a.getText().toString().length()==0 && diag_ruang.getText().toString().length()==0
                        &&diag_bidang.getText().toString().length()==0){
                    sisi_a.setError("Field Diperlukan");
                    diag_ruang.setError("Field Diperlukan");
                    diag_bidang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()>0 && diag_ruang.getText().toString().length()==0
                        &&diag_bidang.getText().toString().length()==0){
                    a=Double.parseDouble(sisi_a.getText().toString());

                    Vol=Math.pow(a,3);
                    L=6*Math.pow(a,2);
                    D_ruang=a*Math.sqrt(3);
                    D_bidang=a*Math.sqrt(2);

                    diag_ruang.setText(String.format("%.2f",D_ruang));
                    diag_bidang.setText(String.format("%.2f",D_bidang));
                    volume.setText(String.format("%.2f",Vol));
                    L_alas.setText(String.format("%.2f",L));
                }
                else if(sisi_a.getText().toString().length()==0 && diag_ruang.getText().toString().length()>0
                        &&diag_bidang.getText().toString().length()==0){
                    D_ruang=Double.parseDouble(diag_ruang.getText().toString());

                    a=D_ruang/Math.sqrt(3);
                    Vol=Math.pow(a,3);
                    L=6*Math.pow(a,2);
                    D_bidang=a*Math.sqrt(2);

                    sisi_a.setText(String.format("%.2f",a));
                    diag_bidang.setText(String.format("%.2f",D_bidang));
                    volume.setText(String.format("%.2f",Vol));
                    L_alas.setText(String.format("%.2f",L));
                }
                else if(sisi_a.getText().toString().length()==0 && diag_ruang.getText().toString().length()==0
                        &&diag_bidang.getText().toString().length()>0){
                    D_bidang=Double.parseDouble(diag_bidang.getText().toString());

                    a=D_bidang/Math.sqrt(2);
                    Vol=Math.pow(a,3);
                    L=6*Math.pow(a,2);
                    D_ruang=a*Math.sqrt(3);

                    diag_ruang.setText(String.format("%.2f",D_ruang));
                    sisi_a.setText(String.format("%.2f",a));
                    volume.setText(String.format("%.2f",Vol));
                    L_alas.setText(String.format("%.2f",L));
                }
            }
        });
    }
}
