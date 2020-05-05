package com.test.volunteerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VolunteerLookout extends AppCompatActivity {


    public Button LoginBtn;

    public Button CreateAccBtn;


    public void init() {

        CreateAccBtn = (Button) findViewById(R.id.CreateAccBtn);

        CreateAccBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(VolunteerLookout.this,NewAccount.class);

                startActivity(toy);

            }
        });



}

    public void Login() {

        LoginBtn = (Button) findViewById(R.id.LoginBtn);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1 = new Intent(VolunteerLookout.this,HomePage.class);

                startActivity(toy1);

            }
        });



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_lookout);

        init();

        Login();

    }
}
