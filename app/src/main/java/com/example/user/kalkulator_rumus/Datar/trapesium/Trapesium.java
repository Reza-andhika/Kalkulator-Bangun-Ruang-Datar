package com.example.user.kalkulator_rumus.Datar.trapesium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.kalkulator_rumus.Datar.Belahkeupat.BelahKetupat;
import com.example.user.kalkulator_rumus.R;

public class Trapesium extends AppCompatActivity {
    private EditText field_a, field_b,field_c,field_d;
    private TextView txtHasil, txtView1, txtView2, txtView3, txtView4;
    private Button btnHitung;
    private Double a, b, c, d, t, L, K;
    private RadioGroup Pil_hit;
    private RadioButton Luas,Keliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        ///Inisialisasi
        field_a = (EditText) findViewById(R.id.a);
        field_b = (EditText) findViewById(R.id.b);
        field_c = (EditText) findViewById(R.id.c);
        field_d = (EditText) findViewById(R.id.d);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtView4 = (TextView) findViewById(R.id.text_view_4);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        Pil_hit = (RadioGroup)findViewById(R.id.Pilih_hitung);
        Luas = (RadioButton)findViewById(R.id.Hitung_luas);
        Keliling = (RadioButton)findViewById(R.id.Hitung_keliling);
        ///Set Invisible
        field_a.setVisibility(View.INVISIBLE);
        field_b.setVisibility(View.INVISIBLE);
        field_c.setVisibility(View.INVISIBLE);
        field_d.setVisibility(View.INVISIBLE);

        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);

        getSupportActionBar().setTitle("Trapesium");

        ///aksi
        Pil_hit.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.Hitung_luas){
                    txtView1.setText("a");
                    txtView2.setText("c");
                    txtView3.setText("t");
                    field_a.setText("");
                    field_b.setText("");
                    field_c.setText("");
                    btnHitung.setText("Hitung Luas");

                    field_a.setVisibility(View.VISIBLE);
                    field_b.setVisibility(View.VISIBLE);
                    field_c.setVisibility(View.VISIBLE);
                    field_d.setVisibility(View.INVISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);
                    txtView4.setVisibility(View.INVISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText("Hasil");

                    btnHitung.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ///L=(a+c).t/2
                            try {
                                a=Double.parseDouble(field_a.getText().toString());
                                c=Double.parseDouble(field_b.getText().toString());
                                t=Double.parseDouble(field_c.getText().toString());

                                L = ((a+c)*t)/2;
                                txtHasil.setText(String.format("%.2f",L));
                            }
                            catch (Exception e) {
                                Toast toast = Toast.makeText(Trapesium.this, "Masukan Semua Field Yang Tersedia", Toast.LENGTH_SHORT);
                                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                                if (t != null) t.setGravity(Gravity.CENTER);
                                toast.show();
                            }
                        }
                    });
                }
                if(checkedId==R.id.Hitung_keliling){
                    txtView1.setText("a");
                    txtView2.setText("b");
                    txtView3.setText("c");
                    txtView4.setText("d");
                    field_a.setText("");
                    field_b.setText("");
                    field_c.setText("");
                    field_d.setText("");
                    btnHitung.setText("Hitung Keliling");

                    field_a.setVisibility(View.VISIBLE);
                    field_b.setVisibility(View.VISIBLE);
                    field_c.setVisibility(View.VISIBLE);
                    field_d.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);
                    txtView4.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText("Hasil");

                    btnHitung.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ///K=a+b+c+d
                            try {
                                a=Double.parseDouble(field_a.getText().toString());
                                b=Double.parseDouble(field_b.getText().toString());
                                c=Double.parseDouble(field_c.getText().toString());
                                d=Double.parseDouble(field_d.getText().toString());

                                K = a+b+c+d;
                                txtHasil.setText(String.format("%.2f",L));
                            }
                            catch (Exception e) {
                                Toast toast = Toast.makeText(Trapesium.this, "Masukan Semua Field Yang Tersedia", Toast.LENGTH_SHORT);
                                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                                if (t != null) t.setGravity(Gravity.CENTER);
                                toast.show();
                            }
                        }
                    });
                }
            }
        });
    }
}
