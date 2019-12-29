package com.example.thirdmobule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InputColorActivity extends AppCompatActivity {
    private Boolean ic;
    private Button ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_color);
        ds = (Button)findViewById(R.id.ds);
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DoSa = new Intent(InputColorActivity.this,DowSavActivity.class);
                startActivity(DoSa);
            }
        });
    }
}
