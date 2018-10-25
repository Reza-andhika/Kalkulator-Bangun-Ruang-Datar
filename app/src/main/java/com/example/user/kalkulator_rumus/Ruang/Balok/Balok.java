package com.example.user.kalkulator_rumus.Ruang.Balok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.kalkulator_rumus.R;

public class Balok extends AppCompatActivity {
    private EditText sisi_a,sisi_b,sisi_c,diag_ruang,volume,L_alas;
    private Button btnHitung,btnReset;
    private double a,b,c,D_ruang,Vol,L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        ///Inisialisasi
        sisi_a=(EditText)findViewById(R.id.sisi_a);
        sisi_b=(EditText)findViewById(R.id.sisi_b);
        sisi_c=(EditText)findViewById(R.id.sisi_c);
        diag_ruang=(EditText)findViewById(R.id.diagonal_ruang);
        volume=(EditText)findViewById(R.id.Volum);
        L_alas=(EditText)findViewById(R.id.Luas);
        btnHitung=(Button)findViewById(R.id.btn_hitung);
        btnReset=(Button)findViewById(R.id.btn_reset);
        //aksi
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sisi_a.setText("");
                sisi_b.setText("");
                sisi_c.setText("");
                diag_ruang.setText("");
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sisi_a.getText().toString().length()==0 && sisi_b.getText().toString().length()==0
                        && sisi_c.getText().toString().length()==0 && diag_ruang.getText().toString().length()==0){
                    sisi_a.setError("Field Diperlukan");
                    sisi_b.setError("Field Diperlukan");
                    sisi_c.setError("Field Diperlukan");
                    diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()>0 && sisi_b.getText().toString().length()==0
                        && sisi_c.getText().toString().length()==0 && diag_ruang.getText().toString().length()==0){
                    ///sisi_a.setError("Field Diperlukan");
                    sisi_b.setError("Field Diperlukan");
                    sisi_c.setError("Field Diperlukan");
                    diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()==0 && sisi_b.getText().toString().length()>0
                        && sisi_c.getText().toString().length()==0 && diag_ruang.getText().toString().length()==0){
                    sisi_a.setError("Field Diperlukan");
                    ///sisi_b.setError("Field Diperlukan");
                    sisi_c.setError("Field Diperlukan");
                    diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()==0 && sisi_b.getText().toString().length()==0
                        && sisi_c.getText().toString().length()>0 && diag_ruang.getText().toString().length()==0){
                    sisi_a.setError("Field Diperlukan");
                    sisi_b.setError("Field Diperlukan");
                    ///sisi_c.setError("Field Diperlukan");
                    diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()>0 && sisi_b.getText().toString().length()==0
                        && sisi_c.getText().toString().length()==0 && diag_ruang.getText().toString().length()>0){
                    sisi_a.setError("Field Diperlukan");
                    sisi_b.setError("Field Diperlukan");
                    sisi_c.setError("Field Diperlukan");
                   /// diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()>0 && sisi_b.getText().toString().length()>0
                        && sisi_c.getText().toString().length()==0 && diag_ruang.getText().toString().length()==0){
                    ///sisi_a.setError("Field Diperlukan");
                    ///sisi_b.setError("Field Diperlukan");
                    sisi_c.setError("Field Diperlukan");
                    diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()>0 && sisi_b.getText().toString().length()==0
                        && sisi_c.getText().toString().length()>0 && diag_ruang.getText().toString().length()==0){
                    ///sisi_a.setError("Field Diperlukan");
                    sisi_b.setError("Field Diperlukan");
                    ///sisi_c.setError("Field Diperlukan");
                    diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()>0 && sisi_b.getText().toString().length()==0
                        && sisi_c.getText().toString().length()==0 && diag_ruang.getText().toString().length()>0){
                    ///sisi_a.setError("Field Diperlukan");
                    sisi_b.setError("Field Diperlukan");
                    sisi_c.setError("Field Diperlukan");
                    ///diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()==0 && sisi_b.getText().toString().length()>0
                        && sisi_c.getText().toString().length()>0 && diag_ruang.getText().toString().length()==0){
                    sisi_a.setError("Field Diperlukan");
                    ///sisi_b.setError("Field Diperlukan");
                    ///sisi_c.setError("Field Diperlukan");
                    diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()==0 && sisi_b.getText().toString().length()>0
                        && sisi_c.getText().toString().length()==0 && diag_ruang.getText().toString().length()>0){
                    sisi_a.setError("Field Diperlukan");
                    ///sisi_b.setError("Field Diperlukan");
                    sisi_c.setError("Field Diperlukan");
                    ///diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()==0 && sisi_b.getText().toString().length()==0
                        && sisi_c.getText().toString().length()>0 && diag_ruang.getText().toString().length()>0){
                    sisi_a.setError("Field Diperlukan");
                    sisi_b.setError("Field Diperlukan");
                    ///sisi_c.setError("Field Diperlukan");
                    ///diag_ruang.setError("Field Diperlukan");
                }
                else if(sisi_a.getText().toString().length()>0 && sisi_b.getText().toString().length()>0
                        && sisi_c.getText().toString().length()>0 && diag_ruang.getText().toString().length()==0){
                    a=Double.parseDouble(sisi_a.getText().toString());
                    b=Double.parseDouble(sisi_b.getText().toString());
                    c=Double.parseDouble(sisi_c.getText().toString());

                    ///Hitung
                    Vol=a*b*c;
                    L=2*((a*b)+(a*c)+(b*c));
                    D_ruang=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));

                    volume.setText(String.format("%.2f",Vol));
                    L_alas.setText(String.format("%.2f",L));
                    diag_ruang.setText(String.format("%.2f",D_ruang));
                }
                else if(sisi_a.getText().toString().length()==0 && sisi_b.getText().toString().length()>0
                        && sisi_c.getText().toString().length()>0 && diag_ruang.getText().toString().length()>0){
                    D_ruang=Double.parseDouble(diag_ruang.getText().toString());
                    b=Double.parseDouble(sisi_b.getText().toString());
                    c=Double.parseDouble(sisi_c.getText().toString());

                    ///Hitung
                    a=Math.sqrt((Math.pow(b,2)+Math.pow(c,2)-Math.pow(D_ruang,2)));
                    Vol=a*b*c;
                    L=2*((a*b)+(a*c)+(b*c));

                    ///D_ruang=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
                    if(D_ruang<b){
                        sisi_b.setError("Error b > Diagonal");
                    }
                    else if(D_ruang<c){
                        sisi_c.setError("Error c > Diagonal");
                    }
                    else {
                        volume.setText(String.format("%.2f",Vol));
                        L_alas.setText(String.format("%.2f",L));
                        sisi_a.setText(String.format("%.2f",a));
                    }
                }
                else if(sisi_a.getText().toString().length()>0 && sisi_b.getText().toString().length()==0
                        && sisi_c.getText().toString().length()>0 && diag_ruang.getText().toString().length()>0){
                    D_ruang=Double.parseDouble(diag_ruang.getText().toString());
                    a=Double.parseDouble(sisi_a.getText().toString());
                    c=Double.parseDouble(sisi_c.getText().toString());

                    ///Hitung
                    b=Math.sqrt((Math.pow(a,2)+Math.pow(c,2)-Math.pow(D_ruang,2)));
                    Vol=a*b*c;
                    L=2*((a*b)+(a*c)+(b*c));

                    ///D_ruang=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
                    if(D_ruang<a){
                        sisi_a.setError("Error a > Diagonal");
                    }
                    else if(D_ruang<c){
                        sisi_c.setError("Error c > Diagonal");
                    }
                    else {
                        volume.setText(String.format("%.2f",Vol));
                        L_alas.setText(String.format("%.2f",L));
                        sisi_b.setText(String.format("%.2f",b));
                    }
                }
                else if(sisi_a.getText().toString().length()>0 && sisi_b.getText().toString().length()>0
                        && sisi_c.getText().toString().length()==0 && diag_ruang.getText().toString().length()>0){
                    D_ruang=Double.parseDouble(diag_ruang.getText().toString());
                    a=Double.parseDouble(sisi_a.getText().toString());
                    b=Double.parseDouble(sisi_b.getText().toString());

                    ///Hitung
                    c=Math.sqrt((Math.pow(a,2)+Math.pow(b,2)-Math.pow(D_ruang,2)));
                    Vol=a*b*c;
                    L=2*((a*b)+(a*c)+(b*c));

                    ///D_ruang=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
                    if(D_ruang<a){
                        sisi_a.setError("Error a > Diagonal");
                    }
                    else if(D_ruang<b){
                        sisi_c.setError("Error b > Diagonal");
                    }
                    else {
                        volume.setText(String.format("%.2f",Vol));
                        L_alas.setText(String.format("%.2f",L));
                        sisi_c.setText(String.format("%.2f",c));
                    }
                }
            }
        });
    }
}
