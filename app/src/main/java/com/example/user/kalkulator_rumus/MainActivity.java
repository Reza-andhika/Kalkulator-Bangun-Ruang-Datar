package com.example.user.kalkulator_rumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.kalkulator_rumus.Datar.Menu_Datar;
import com.example.user.kalkulator_rumus.Ruang.Menu_ruang;

public class MainActivity extends AppCompatActivity {

    private Button Bg_datar,Bg_ruang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///Inisialisasi
        Bg_datar=(Button)findViewById(R.id.bangun_datar);
        Bg_ruang=(Button)findViewById(R.id.bangun_ruang);
        ///aksi
        Bg_datar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,Menu_Datar.class);
                startActivity(in);
            }
        });
        Bg_ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,Menu_ruang.class);
                startActivity(in);
            }
        });
    }
}
