package com.example.android.newapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Hewan ayam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ayam = new Hewan(2);
        ayam.setJmlKaki(10);
        Log.d("LOG", "Jumlah kaki : " + ayam.getJmlKaki());
    }
}
