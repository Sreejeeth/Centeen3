package com.example.android.centeen2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Home on 3/31/2017.
 */

public class SummaryOrder extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordersummary);

        Bundle b = getIntent().getExtras();
        TextView egg = (TextView) findViewById(R.id.EFRos);
        TextView veg = (TextView) findViewById(R.id.VFRos);
        TextView eggQty = (TextView) findViewById(R.id.EFRQty);
        TextView vegQty = (TextView) findViewById(R.id.VFRQty);






        egg.setText(b.getCharSequence("egg"));
        veg.setText(b.getCharSequence("veg"));

        eggQty.setInputType(b.getInt("eggQty"));
        vegQty.setInputType(b.getInt("vegQty"));
    }}
