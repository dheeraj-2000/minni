package com.brandmore.minni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Passengersmap extends AppCompatActivity {

    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passengersmap);
        logout = (Button)findViewById(R.id.logout);
        logout.setOnClickListener((v) -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(Passengersmap.this, versionselect.class));
            finish();

        });
    }
}
