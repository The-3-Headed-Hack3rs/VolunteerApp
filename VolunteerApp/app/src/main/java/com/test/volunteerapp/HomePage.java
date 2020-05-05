package com.test.volunteerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    public Button SelectBTN;

    public Button selectBTN2;

    public Button LogoutBTN;

    public Button ProfileBTN;

    public void Logout() {

        LogoutBTN = findViewById(R.id.LogoutBTN);

        LogoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(HomePage.this, VolunteerLookout.class);

                startActivity(toy);

            }
        });


    }


    public void Profile() {

        ProfileBTN = findViewById(R.id.ProfileBTN);

        ProfileBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1 = new Intent(HomePage.this, UserProfile.class);

                startActivity(toy1);

            }
        });


    }


    public void Select1() {

        SelectBTN = findViewById(R.id.SelectBTN);

        SelectBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy2 = new Intent(HomePage.this, DetailsPage1.class);

                startActivity(toy2);

            }
        });


    }


    public void Select2() {

        selectBTN2 = findViewById(R.id.selectBTN2);

        selectBTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy3 = new Intent(HomePage.this, DetailsPage2.class);

                startActivity(toy3);

            }
        });


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Logout();

        Profile();

        Select1();

        Select2();


    }

}
