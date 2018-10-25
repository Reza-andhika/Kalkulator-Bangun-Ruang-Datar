package com.example.user.kalkulator_rumus.Datar.dalil_pytagoras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.user.kalkulator_rumus.R;

public class Dalil_pytagoras extends AppCompatActivity {

    private EditText nilai_a, nilai_b,nilai_c;
    private Button btnHitung,btnreset;
    private Double a, b, c, nil_a, nil_b, nil_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalil_pytagoras);

        ///Inisialisasi
        nilai_a=(EditText)findViewById(R.id.nilai_a);
        nilai_b=(EditText)findViewById(R.id.nilai_b);
        nilai_c=(EditText)findViewById(R.id.nilai_c);
        btnHitung=(Button)findViewById(R.id.btn_hitung);
        btnreset=(Button)findViewById(R.id.btn_reset);
        ///aksi
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai_a.setText("");
                nilai_b.setText("");
                nilai_c.setText("");
            }
        });
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nilai_a.getText().toString().length()==0 && nilai_b.getText().toString().length()==0 &&
                        nilai_c.getText().toString().length()==0){
                    nilai_a.setError("field diperlukan");
                    nilai_b.setError("field diperlukan");
                    nilai_c.setError("field diperlukan");
                }
                else if(nilai_a.getText().toString().length()>0 && nilai_b.getText().toString().length()==0 &&
                        nilai_c.getText().toString().length()==0){
                    nilai_b.setError("field diperlukan");
                    nilai_c.setError("field diperlukan");
                }
                else if(nilai_a.getText().toString().length()==0 && nilai_b.getText().toString().length()>0 &&
                        nilai_c.getText().toString().length()==0){
                    nilai_a.setError("field diperlukan");
                    nilai_c.setError("field diperlukan");
                }
                else if(nilai_a.getText().toString().length()==0 && nilai_b.getText().toString().length()==0 &&
                        nilai_c.getText().toString().length()>0){
                    nilai_b.setError("field diperlukan");
                    nilai_a.setError("field diperlukan");
                }
                else if(nilai_a.getText().toString().length()>0 && nilai_b.getText().toString().length()>0 &&
                        nilai_c.getText().toString().length()==0){
                    nil_a=Double.parseDouble(nilai_a.getText().toString());
                    nil_b=Double.parseDouble(nilai_b.getText().toString());

                    ///c^=a^+b^
                    c=Math.sqrt(Math.pow(nil_a,2)+Math.pow(nil_b,2));
                    nilai_c.setText(String.format("%.2f",c));
                }
                else if(nilai_a.getText().toString().length()>0 && nilai_b.getText().toString().length()==0 &&
                        nilai_c.getText().toString().length()>0){
                    nil_a=Double.parseDouble(nilai_a.getText().toString());
                    nil_c=Double.parseDouble(nilai_c.getText().toString());
                        if(nil_a>nil_c){
                            nilai_a.setError("Error a>c");
                        }
                        else{
                            ///b^=c^-a^
                            b=Math.sqrt(Math.pow(nil_c,2)-Math.pow(nil_a,2));
                            nilai_b.setText(String.format("%.2f",b));
                        }
                }
                else if(nilai_a.getText().toString().length()==0 && nilai_b.getText().toString().length()>0 &&
                        nilai_c.getText().toString().length()>0){
                    nil_b=Double.parseDouble(nilai_b.getText().toString());
                    nil_c=Double.parseDouble(nilai_c.getText().toString());
                    if(nil_b>nil_c){
                        nilai_a.setError("Error a>c");
                    }
                    else {
                        ///a^=c^-b^
                        a=Math.sqrt(Math.pow(nil_c,2)-Math.pow(nil_b,2));
                        nilai_a.setText(String.format("%.2f",a));
                    }
                }
            }
        });
    }
}
