package com.example.android.centeen2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Home on 3/31/2017.
 */

public class SummaryOrder extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summaryorder2);

        Bundle b = getIntent().getExtras();
      //TextView textView = (TextView) findViewById(R.id.TextviewAfterListview);
      //  TextView veg = (TextView) findViewById(R.id.VFRos);

       // TextView eggQty = (TextView) findViewById(R.id.EFRQty);
       // TextView vegQty = (TextView) findViewById(R.id.VFRQty);



       ArrayList<Food> foodie = new ArrayList<>();

        if(b.getInt("check1")==1) {
            foodie.add(new Food(b.getString("egg").toString(),b.getInt("eggQty")));
        }
        if(b.getInt("check2")==1)
            foodie.add(new Food(b.getString("veg").toString(),b.getInt("vegQty")));
       // egg.setText(b.getCharSequence("egg"));
      // foodie.add(egg.getText().toString());
      //
        // veg.setText(b.getCharSequence("veg"));
       //foodie.add(veg.getText().toString());
        FoodAdapter ootaAdapter = new FoodAdapter(this, foodie);

        // Get
        // reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list1);

        listView.setAdapter(ootaAdapter);

       // textView.setText(b.getInt("price")+"");

        
        /*

if(b.getInt("eggQty")!=0)
        eggQty.setText(b.getInt("eggQty")+"");
        if(b.getInt("vegQty")!=0)
        vegQty.setText(b.getInt("vegQty")+"");*/
    }}


// add listview and adapter here