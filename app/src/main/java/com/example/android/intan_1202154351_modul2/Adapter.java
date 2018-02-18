package com.example.android.intan_1202154351_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Intan Gantira on 2/18/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView Nama,Harga,id;
        private ImageView Gambar;
        public ViewHolder(View item){
            super(item);
            id = (TextView)item.findViewById(R.id.id);
            Nama = (TextView)item.findViewById(R.id.Nama);
            Harga = (TextView)item.findViewById(R.id.Harga);
            Gambar = (ImageView)item.findViewById(R.id.Gambar);
        }
    }
    private ArrayList<Model> dataList;
    public Adapter(ArrayList<Model>list){
        this.dataList = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_rview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.Nama.setText(dataList.get(position).getNama());
        holder.id.setText(""+position);
        holder.Harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(dataList.get(position).getHarga()));
        holder.Gambar.setImageResource(dataList.get(position).getGambar());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String index = holder.id.getText().toString();
                Toast.makeText(v.getContext(),"Menu Yang Di Pilih "+dataList.get(Integer.parseInt(index)).getNama()+"",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext().getApplicationContext(),DetailMenu.class);
                intent.putExtra("MenuId",index);
                v.getContext().startActivity(intent);
                Log.d("Isi Index",""+index);
            }
        });
    }

    @Override
    public int getItemCount() {return (dataList != null) ? dataList.size() : 0;}
    }


