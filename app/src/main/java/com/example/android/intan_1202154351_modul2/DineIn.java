package com.example.android.intan_1202154351_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Intan Gantira on 2/18/2018.
 */

public class DineIn extends AppCompatActivity {
    private Spinner table;
    private TextView nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        table = (Spinner)findViewById(R.id.spinner3);
        ArrayList<String> list = tabledata();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        table.setAdapter(adapter);

        Button submit = (Button)findViewById(R.id.buttonPilihPesan);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mejaa=String.valueOf(table.getSelectedItem());
                TextView name = (TextView)findViewById(R.id.editTextNama);
                Toast.makeText(getApplicationContext(),mejaa+" "+"Dengan Nama"
                        +name.getText().toString(), Toast.LENGTH_LONG).show();
                startActivity(new Intent(DineIn.this,ListMenu.class));
            }
        });
    }
    public ArrayList<String> tabledata() {
        ArrayList<String>isi=new ArrayList<>();
        for(int i=1;i<=10;i++){
            isi.add("Meja "+i);
        }
        return  isi;
    }

}

