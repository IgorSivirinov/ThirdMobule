package com.example.thirdmobule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ic=(Button)findViewById(R.id.ic);
        ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InCo = new Intent(MainActivity.this,InputColorActivity.class);
                startActivity(InCo);
            }
        });
            }
}
