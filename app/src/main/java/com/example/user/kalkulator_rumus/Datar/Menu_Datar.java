package com.example.user.kalkulator_rumus.Datar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.kalkulator_rumus.Datar.Belahkeupat.BelahKetupat;
import com.example.user.kalkulator_rumus.Datar.Jajargenjang.Jajargenjang;
import com.example.user.kalkulator_rumus.Datar.Lingkaran.Lingkaran;
import com.example.user.kalkulator_rumus.Datar.Persegipanjang.PersegiPanjang;
import com.example.user.kalkulator_rumus.Datar.Segitiga.Segitiga;
import com.example.user.kalkulator_rumus.Datar.dalil_pytagoras.Dalil_pytagoras;
import com.example.user.kalkulator_rumus.Datar.persegi.persegi;
import com.example.user.kalkulator_rumus.Datar.sama_siku.Segitiga_siku;
import com.example.user.kalkulator_rumus.Datar.trapesium.Trapesium;
import com.example.user.kalkulator_rumus.R;

public class Menu_Datar extends AppCompatActivity {

    private Button belah_ketupat,pers,lingkaran,pers_panjang,trapesium,pytagoras,siku,genjang,segitiga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__datar);

        belah_ketupat=(Button)findViewById(R.id.belah_ketupat);
        siku=(Button)findViewById(R.id.segitiga_siku);
        pers=(Button)findViewById(R.id.Persegi);
        genjang=(Button)findViewById(R.id.jajar_genjang);
        segitiga=(Button)findViewById(R.id.segitiga);
        lingkaran=(Button)findViewById(R.id.linkaran);
        pers_panjang=(Button)findViewById(R.id.persegi_panjang);
        trapesium=(Button)findViewById(R.id.trapesium);
        pytagoras=(Button)findViewById(R.id.pytagoras);
        belah_ketupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,BelahKetupat.class);
                startActivity(in);
            }
        });
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,Segitiga.class);
                startActivity(in);
            }
        });
        genjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,Jajargenjang.class);
                startActivity(in);
            }
        });
        siku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,Segitiga_siku.class);
                startActivity(in);
            }
        });
        pers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,persegi.class);
                startActivity(in);
            }
        });
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,Lingkaran.class);
                startActivity(in);
            }
        });
        pers_panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,PersegiPanjang.class);
                startActivity(in);
            }
        });
        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,Trapesium.class);
                startActivity(in);
            }
        });
        pytagoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu_Datar.this,Dalil_pytagoras.class);
                startActivity(in);
            }
        });
    }
}
