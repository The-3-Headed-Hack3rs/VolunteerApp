package com.test.volunteerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ConfirmationPage2 extends AppCompatActivity {


    public Button HomeBTN;

    public void Home() {

        HomeBTN = findViewById(R.id.HomeBTN);

        HomeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(ConfirmationPage2.this, HomePage.class);

                startActivity(toy);

            }
        });


    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_page2);

        Home();
    }
}
