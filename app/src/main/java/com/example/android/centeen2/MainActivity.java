/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.centeen2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
       Button button = (Button) findViewById(R.id.order);
        button.setOnClickListener(this);
    }

    int quantityVeg=0;
    public void incrementVeg(View view) {

        quantityVeg=quantityVeg+1;
        displayVeg(quantityVeg);
    } /**
     * This method is called when the minus button is clicked.*/
    public void decrementVeg(View view) {
        quantityVeg--;
        displayVeg(quantityVeg);
    }

    private void displayVeg(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_veg_fried_rice);
        quantityTextView.setText("" + number);
    }


    

    int quantityEgg=0;
    public void incrementEgg(View view) {
        quantityEgg=quantityEgg+1;
        displayEgg(quantityEgg);
    } /**
     * This method is called when the minus button is clicked.
     */
    public void decrementEgg(View view) {

        //    int numberOfCoffees=1;
        quantityEgg--;


        displayEgg(quantityEgg);


    }

    private void displayEgg(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_egg_fried_rice);
        quantityTextView.setText("" + number);
    }


       /* int price = calculatePrice();
        String priceMessage = createOrderSummary(name, price, isWhippedcream, ischocolate);*/


    public void onClick(View v) {


        //...............................................................

        //..............................................................

        Intent intent = new Intent(MainActivity.this, SummaryOrder.class);        //Create a bundle object
        Bundle b = new Bundle();


        //Inserts a String value into the mapping of this Bundle

        CheckBox checkBox = (CheckBox) findViewById(R.id.EFR);
        boolean isEgg=checkBox.isChecked();
        if(isEgg==true) {
            b.putString("egg", checkBox.getText().toString());
            b.putInt("eggQty",quantityEgg);


        }
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.VFR);
        boolean isVeg=checkBox1.isChecked();
        if(isVeg==true) {


            b.putString("veg", checkBox1.getText().toString());
            b.putInt("vegQty",quantityVeg);

        }
        //Add the bundle to the intent.
        intent.putExtras(b);

        //start the DisplayActivity
        startActivity(intent);





        }

    }

