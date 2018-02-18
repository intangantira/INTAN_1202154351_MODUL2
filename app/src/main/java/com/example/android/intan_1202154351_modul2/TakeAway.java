package com.example.android.intan_1202154351_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Intan Gantira on 2/18/2018.
 */

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void away(View view) {
        startActivity(new Intent(this,ListMenu.class));
    }
}
