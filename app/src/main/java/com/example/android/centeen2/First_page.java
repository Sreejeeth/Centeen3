package com.example.android.centeen2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Home on 4/7/2017.
 */

public class First_page extends AppCompatActivity implements View.OnClickListener {
    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        button = (ImageButton) findViewById(R.id.button1);

        button.setOnClickListener(this);
    }

    public void onClick(View v) {


        Intent intent = new Intent(First_page.this, LoginPage.class);        //Create a bundle object
        startActivity(intent);

    }
}
