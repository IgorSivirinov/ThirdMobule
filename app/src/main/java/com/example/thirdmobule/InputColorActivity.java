package com.example.thirdmobule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class InputColorActivity extends AppCompatActivity {
    private Button ds;
    private CheckBox up, down;
    private RadioButton bred, bgreen, bblue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_color);

        up = (CheckBox)findViewById(R.id.up);
        down = (CheckBox)findViewById(R.id.down);
        bred = (RadioButton) findViewById(R.id.bred);
        bgreen = (RadioButton) findViewById(R.id.bgrean);
        bblue = (RadioButton) findViewById(R.id.bblue);

            ds = (Button) findViewById(R.id.ds);
            ds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    boolean dr = bred.isChecked();
                    boolean dg = bgreen.isChecked();
                    boolean db = bblue.isChecked();
                    boolean du = up.isChecked();
                    boolean dd = down.isChecked();

                    Intent  icm = new Intent (InputColorActivity.this,MainActivity.class);

                    icm.putExtra("dr",dr);
                    icm.putExtra("dg",dg);
                    icm.putExtra("db",db);
                    icm.putExtra("du",du);
                    icm.putExtra("dd",dd);

                    startActivity(icm);
                }
            });

    }

}
