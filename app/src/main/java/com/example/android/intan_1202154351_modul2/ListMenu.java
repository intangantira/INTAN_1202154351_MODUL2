package com.example.android.intan_1202154351_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Intan Gantira on 2/18/2018.
 */

public class ListMenu extends AppCompatActivity {
    private RecyclerView rc;
    private Adapter a_menu;

    public static ArrayList<Model>listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        listMenu = isimenu();
        rc = (RecyclerView) findViewById(R.id.recyclerView);
        a_menu = new Adapter(listMenu);
        rc.setAdapter(a_menu);
        rc.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<Model> isimenu() {
        ArrayList<Model> dalam = new ArrayList<>();
        dalam.add(new Model("Bibimbap",30000,R.drawable.bibimbap,"Nasi putih dengan lauk di atasnya berupa sayur-sayuran, daging sapi, telur, dan saus pedas gochujang"));
        dalam.add(new Model("Bulgogi",40000,R.drawable.bulgogi,"Daging khas Korea yang populer, terbuat dari irisan tipis daging premium"));
        dalam.add(new Model("Dasik",15000,R.drawable.dasik,"Kue tradisional Korea"));
        dalam.add(new Model("Jajangmyeon",25000,R.drawable.jajangmyeon,"Mie dengan saus pasta kacang kedelai hitam"));
        dalam.add(new Model("Kimbap",28000,R.drawable.kimbap,"Nasi yang dibungkus dengan rumput laut"));
        dalam.add(new Model("Kimchi",15000,R.drawable.kimchi,"Asinan sayur hasil fermentasi yang diberi bumbu pedas"));
        dalam.add(new Model("Tteokbokki",25000,R.drawable.tteokbokki,"Tepung beras yang dimasak dalam bumbu pedas dan manis"));
        return dalam;
    }
}
