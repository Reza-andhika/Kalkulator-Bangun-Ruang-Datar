package com.example.user.kalkulator_rumus.Datar.Belahkeupat;

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

import com.example.user.kalkulator_rumus.MainActivity;
import com.example.user.kalkulator_rumus.R;

public class BelahKetupat extends AppCompatActivity {
    private EditText edtText1, edtText2;
    private TextView txtHasil, txtView1, txtView2;
    private Button btnHitung;
    private Double d1, d2, s1;
    private RadioGroup Pil_hit;
    private RadioButton Luas,Keliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);
        ///Inisialisasi
        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        Pil_hit = (RadioGroup)findViewById(R.id.Pilih_hitung);
        Luas = (RadioButton)findViewById(R.id.Hitung_luas);
        Keliling = (RadioButton)findViewById(R.id.Hitung_keliling);
        ///Set Invisible
        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);

        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);

        getSupportActionBar().setTitle("Belah Ketupat");
        ///Radio Grup case
        Pil_hit.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.Hitung_luas){
                    txtView1.setText("Diagonal Horisontal (d1)");
                    txtView2.setText("Diagonal Vertikal (d2)");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText("Hitung Luas");

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText("Hasil");

                    ///aksi Hitung
                    btnHitung.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ///(d1*d2)/2;
                            try {
                                d1 = Double.parseDouble(edtText1.getText().toString());
                                d2 = Double.parseDouble(edtText2.getText().toString());

                                double hasil = (d1*d2)/2;
                                txtHasil.setText(String.valueOf(hasil));
                            }
                            catch (Exception e) {
                                Toast toast = Toast.makeText(BelahKetupat.this, "Masukan Semua Field Yang Tersedia", Toast.LENGTH_SHORT);
                                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                                if (t != null) t.setGravity(Gravity.CENTER);
                                toast.show();
                            }
                        }
                    });
                }
                if (checkedId==R.id.Hitung_keliling){
                    txtView1.setText("Sisi");
                    txtView2.setText("");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText("Hitung Keliling");

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.INVISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.INVISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText("Hasil");

                    ///aksi Hitung
                    btnHitung.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ///4*s1;
                            try {
                                s1 = Double.parseDouble(edtText1.getText().toString());

                                double hasil = 4*s1;
                                txtHasil.setText(String.valueOf(hasil));
                            }
                            catch (Exception e) {
                                Toast toast = Toast.makeText(BelahKetupat.this, "Masukan Semua Field Yang Tersedia", Toast.LENGTH_SHORT);
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
