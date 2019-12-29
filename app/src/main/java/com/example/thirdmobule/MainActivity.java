package com.example.thirdmobule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button ic, bch, bcl;
    private LinearLayout ll1, ll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll1 = (LinearLayout)findViewById(R.id. ll1);
        ll2 = (LinearLayout)findViewById(R.id. ll2);
        ic  = (Button)findViewById(R.id.ic);
        bch = (Button)findViewById(R.id.bch);
        bcl = (Button)findViewById(R.id.bcl);

        ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InCo = new Intent(MainActivity.this,InputColorActivity.class);
                startActivity(InCo);
            }
        });

        bch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean dr = getIntent().getExtras().getBoolean("dr");
                boolean dg = getIntent().getExtras().getBoolean("dg");
                boolean db = getIntent().getExtras().getBoolean("db");
                boolean du = getIntent().getExtras().getBoolean("du");
                boolean dd = getIntent().getExtras().getBoolean("dd");

                if (dr) {
                    if (du) ll1.setBackgroundColor(getColor(R.color.cored));
                    if (dd) ll2.setBackgroundColor(getColor(R.color.cored));
                }
                if (dg) {
                    if (du) ll1.setBackgroundColor(getColor(R.color.cogreen));
                    if (dd) ll2.setBackgroundColor(getColor(R.color.cogreen));
                }
                if (db) {

                    if (du) ll1.setBackgroundColor(getColor(R.color.coblue));
                    if (dd) ll2.setBackgroundColor(getColor(R.color.coblue));
                }
            }
        });

        bcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll1.setBackgroundColor(getColor(R.color.conorm));
                ll2.setBackgroundColor(getColor(R.color.conorm));
            }
        });

    }
}
