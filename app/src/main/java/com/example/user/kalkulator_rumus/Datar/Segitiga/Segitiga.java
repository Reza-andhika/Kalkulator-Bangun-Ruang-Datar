package com.example.user.kalkulator_rumus.Datar.Segitiga;

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

import com.example.user.kalkulator_rumus.Datar.Jajargenjang.Jajargenjang;
import com.example.user.kalkulator_rumus.R;

public class Segitiga extends AppCompatActivity {
    private EditText edtText1, edtText2, edtText3;
    private TextView txtHasil, txtView1, txtView2, txtView3;
    private Button btnHitung;
    private Double a, b, t, c,hasil;
    private RadioGroup Pil_hit;
    private RadioButton Luas,Keliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        ///Inisialisasi
        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        edtText3 = (EditText) findViewById(R.id.edt_text_view_3);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        Pil_hit = (RadioGroup)findViewById(R.id.Pilih_hitung);
        Luas = (RadioButton)findViewById(R.id.Hitung_luas);
        Keliling = (RadioButton)findViewById(R.id.Hitung_keliling);
        ///Set Invisible
        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        edtText3.setVisibility(View.INVISIBLE);

        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);

        getSupportActionBar().setTitle("Jajar Genjang");
        Pil_hit.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.Hitung_luas){
                    txtView1.setText("Sisi a");
                    txtView2.setText("Tinggi");
                    txtView3.setText("");
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    btnHitung.setText("Hitung Luas");

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.INVISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.INVISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText("Hasil");

                    ///aksi Hitung
                    btnHitung.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                a = Double.parseDouble(edtText1.getText().toString());
                                t = Double.parseDouble(edtText2.getText().toString());

                                hasil = 0.5*(a*t);
                                txtHasil.setText(String.valueOf(hasil));
                            }
                            catch (Exception e) {
                                Toast toast = Toast.makeText(Segitiga.this, "Masukan Semua Field Yang Tersedia", Toast.LENGTH_SHORT);
                                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                                if (t != null) t.setGravity(Gravity.CENTER);
                                toast.show();
                            }
                        }
                    });
                }
                if (checkedId==R.id.Hitung_keliling){
                    txtView1.setText("Sisi a");
                    txtView2.setText("Sisi b");
                    txtView3.setText("Sisi c");
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    btnHitung.setText("Hitung Keliling");

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText("Hasil");

                    ///aksi Hitung
                    btnHitung.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ///4*s1;
                            try {
                                a = Double.parseDouble(edtText1.getText().toString());
                                b = Double.parseDouble(edtText2.getText().toString());
                                c = Double.parseDouble(edtText3.getText().toString());

                                double hasil = a+b+c;
                                txtHasil.setText(String.valueOf(hasil));
                            }
                            catch (Exception e) {
                                Toast toast = Toast.makeText(Segitiga.this, "Masukan Semua Field Yang Tersedia", Toast.LENGTH_SHORT);
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
