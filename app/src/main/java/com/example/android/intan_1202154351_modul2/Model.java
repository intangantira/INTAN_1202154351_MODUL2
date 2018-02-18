package com.example.android.intan_1202154351_modul2;


/**
 * Created by Intan Gantira on 2/18/2018.
 */

public class Model {
    private String Nama;
    private int Harga;
    private int Gambar;
    private String Keterangan;

    public Model(String Nama, int Harga, int Gambar, String Keterangan) {
        this.Nama = Nama;
        this.Harga = Harga;
        this.Gambar = Gambar;
        this.Keterangan = Keterangan;
    }

    public String getNama() {return Nama;}
    public int getHarga() {return Harga;}
    public int getGambar() {return Gambar;}
    public String getKeterangan() {return Keterangan;}
    public void setNama(String Nama) {this.Nama = Nama;}
    public void setHarga(int Harga) {this.Harga = Harga;}
    public void setGambar (int Gambar) {this.Gambar = Gambar;}
    public void setKeterangan (String Keterangan) {this.Keterangan = Keterangan;}
}

