package com.example.user.kalkulator_rumus.Datar.Persegipanjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.kalkulator_rumus.R;

public class PersegiPanjang extends AppCompatActivity {
    private EditText ed_sisia,ed_sisib,ed_diagonal,ed_Luas,ed_Keli;
    private Button Hitung,reset;
    private double sisi_a,sisi_b,diagonal,L,K,D,S_a,S_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        ///Inisialisasi
        ed_sisia=(EditText)findViewById(R.id.sisi_a);
        ed_sisib=(EditText)findViewById(R.id.sisi_b);
        ed_diagonal=(EditText)findViewById(R.id.diagonal);
        ed_Luas=(EditText)findViewById(R.id.Luas);
        ed_Keli=(EditText)findViewById(R.id.Keliling);
        Hitung=(Button)findViewById(R.id.btn_hitung);
        reset=(Button)findViewById(R.id.btn_reset);

        ///aksi
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed_sisia.setText("");
                ed_sisib.setText("");
                ed_diagonal.setText("");
                ed_Luas.setText("");
                ed_Keli.setText("");
            }
        });
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed_sisia.getText().toString().length()==0 && ed_sisib.getText().toString().length()==0 &&
                        ed_diagonal.getText().toString().length()==0){
                    ed_sisia.setError("Field Diperlukan");
                    ed_sisib.setError("Field Diperlukan");
                    ed_diagonal.setError("Field Diperlukan");
                }
                else if(ed_sisia.getText().toString().length()>0 && ed_sisib.getText().toString().length()==0 &&
                        ed_diagonal.getText().toString().length()==0){
                    ed_sisib.setError("Field Diperlukan");
                    ed_diagonal.setError("Field Diperlukan");
                }
                else if(ed_sisia.getText().toString().length()==0 && ed_sisib.getText().toString().length()>0 &&
                        ed_diagonal.getText().toString().length()==0){
                    ed_sisia.setError("Field Diperlukan");
                    ed_diagonal.setError("Field Diperlukan");
                }
                else if(ed_sisia.getText().toString().length()==0 && ed_sisib.getText().toString().length()==0 &&
                        ed_diagonal.getText().toString().length()>0){
                    ed_sisia.setError("Field Diperlukan");
                    ed_sisib.setError("Field Diperlukan");
                }
                else if(ed_sisia.getText().toString().length()==0 && ed_sisib.getText().toString().length()==0 &&
                        ed_diagonal.getText().toString().length()==0){
                    ed_sisia.setError("Field Diperlukan");
                    ed_diagonal.setError("Field Diperlukan");
                    ed_sisib.setError("Field Diperlukan");
                }
                else if(ed_sisia.getText().toString().length()==0 && ed_sisib.getText().toString().length()>0 &&
                        ed_diagonal.getText().toString().length()==0){
                    ed_sisia.setError("Field Diperlukan");
                    ed_diagonal.setError("Field Diperlukan");
                    ed_sisib.setError("Field Diperlukan");
                }
                else if(ed_sisia.getText().toString().length()>0 && ed_sisib.getText().toString().length()>0 &&
                        ed_diagonal.getText().toString().length()==0){
                    //L=ab K=2.(a+b) d^=a^+b^
                    sisi_a=Double.parseDouble(ed_sisia.getText().toString());
                    sisi_b=Double.parseDouble(ed_sisib.getText().toString());

                    L=sisi_a*sisi_b;
                    K=2*(sisi_a+sisi_b);
                    diagonal=Math.sqrt(Math.pow(sisi_a,2)+Math.pow(sisi_b,2));

                    ed_Luas.setText(String.format("%.2f",L));
                    ed_Keli.setText(String.format("%.2f",K));
                    ed_diagonal.setText(String.format("%.2f",diagonal));
                }
                else if(ed_sisia.getText().toString().length()>0 && ed_sisib.getText().toString().length()==0 &&
                        ed_diagonal.getText().toString().length()>0){
                    sisi_a=Double.parseDouble(ed_sisia.getText().toString());
                    diagonal=Double.parseDouble(ed_diagonal.getText().toString());
                    if(sisi_a>diagonal){
                        ed_sisia.setError("Error : a > diagonal");
                    }
                    else {
                        S_b=Math.sqrt(Math.pow(diagonal,2)-Math.pow(sisi_a,2));
                        L=sisi_a*S_b;
                        K=2*(sisi_a+S_b);

                        ed_Luas.setText(String.format("%.2f",L));
                        ed_Keli.setText(String.format("%.2f",K));
                        ed_sisib.setText(String.format("%.2f",S_b));
                    }
                }
                else if(ed_sisia.getText().toString().length()==0 && ed_sisib.getText().toString().length()>0 &&
                        ed_diagonal.getText().toString().length()>0){
                    sisi_b=Double.parseDouble(ed_sisib.getText().toString());
                    diagonal=Double.parseDouble(ed_diagonal.getText().toString());
                    if(sisi_b>diagonal){
                        ed_sisib.setError("Error : b > diagonal");
                    }
                    else {
                        S_a=Math.sqrt(Math.pow(diagonal,2)-Math.pow(sisi_b,2));
                        L=S_a*sisi_b;
                        K=2*(S_a+sisi_b);


                        ed_Luas.setText(String.format("%.2f",L));
                        ed_Keli.setText(String.format("%.2f",K));
                        ed_sisia.setText(String.format("%.2f",S_a));
                    }
                }
            }
        });
    }
}
