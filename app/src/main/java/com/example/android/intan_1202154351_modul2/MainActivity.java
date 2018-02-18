package com.example.android.intan_1202154351_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);

        Button btn = (Button) findViewById(R.id.btnPesan);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int R_rg = rg.getCheckedRadioButtonId();
                switch (R_rg){
                    case R.id.radioDine:
                        startActivity(new Intent(MainActivity.this,DineIn.class));
                        break;
                    case R.id.radioTakeAway:
                        startActivity(new Intent(MainActivity.this,TakeAway.class));
                        break;
                }
            }
        });
    }
}
