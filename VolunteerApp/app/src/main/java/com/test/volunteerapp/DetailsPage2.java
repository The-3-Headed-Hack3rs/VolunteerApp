package com.test.volunteerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailsPage2 extends AppCompatActivity {


    public Button SelectBTN;

    public Button HomeBTN;

    public void Home() {

        HomeBTN = findViewById(R.id.HomeBTN);

        HomeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(DetailsPage2.this, HomePage.class);

                startActivity(toy);

            }
        });


    }


    public void Select() {

        SelectBTN = findViewById(R.id.SelectBTN);

        SelectBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1 = new Intent(DetailsPage2.this, ConfirmationPage2.class);

                startActivity(toy1);

            }
        });


    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page2);

        Home();

        Select();

    }
}
