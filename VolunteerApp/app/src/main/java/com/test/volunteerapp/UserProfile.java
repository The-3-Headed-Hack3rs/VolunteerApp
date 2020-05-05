package com.test.volunteerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserProfile extends AppCompatActivity {

    public Button HomeBTN;
    public Button LogoutBTN;

    public void Logout() {

        LogoutBTN = (Button) findViewById(R.id.LogoutBTN);

        LogoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(UserProfile.this,VolunteerLookout.class);

                startActivity(toy);

            }
        });



    }


    public void Home() {

        HomeBTN = (Button) findViewById(R.id.HomeBTN);

        HomeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1 = new Intent(UserProfile.this,HomePage.class);

                startActivity(toy1);

            }
        });



    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Logout();

        Home();
    }
}
