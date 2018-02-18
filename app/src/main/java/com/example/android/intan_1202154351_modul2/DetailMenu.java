package com.example.android.intan_1202154351_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Intan Gantira on 2/18/2018.
 */

public class DetailMenu extends AppCompatActivity {
    private ArrayList<Model> Menu;
    private String idMenu;
    private TextView Nama,Harga,Keterangan;
    private ImageView Gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmenu);

        Nama =(TextView)findViewById(R.id.lblDetailNama);
        Harga = (TextView)findViewById(R.id.lblDetailHarga);
        Keterangan = (TextView)findViewById(R.id.lblDetailKeterangan);
        Gambar = (ImageView)findViewById(R.id.lblDetailGambar);

        Menu = ListMenu.listMenu;
        Intent intent = getIntent();
        idMenu = intent.getStringExtra("MenuId");
        Model makanan = Menu.get(Integer.parseInt(idMenu));
        Nama.setText(makanan.getNama());
        setTitle(makanan.getNama());
        Harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(makanan.getHarga()));
        Keterangan.setText(makanan.getKeterangan());
        Gambar.setImageResource(makanan.getGambar());

    }
}
