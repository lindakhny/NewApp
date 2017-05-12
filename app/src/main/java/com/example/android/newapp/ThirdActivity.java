package com.example.android.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
//        Intent i = getIntent();
//
//        String uname = i.getStringExtra("name");
//        String pass = i.getStringExtra("pass");
//
//        Toast.makeText(getApplicationContext(), uname, Toast.LENGTH_SHORT).show();
        Intent i = getIntent();
        Bundle bundle = i.getExtras();

        SerializableClass people = (SerializableClass) bundle.getSerializable("user");
        Toast.makeText(getApplicationContext(), people.getFirstName(), Toast.LENGTH_SHORT).show();
    }
}
