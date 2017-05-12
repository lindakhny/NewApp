package com.example.android.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SerializableClass user;
    String text = "SIGN IN";
    String message = "Berhasil login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        final EditText uname = (EditText) findViewById(R.id.uname);
        final TextView show = (TextView) findViewById(R.id.show);
        final EditText pass = (EditText) findViewById(R.id.pass);
        final TextView showp = (TextView) findViewById(R.id.showp);
        btn.setText(text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                show.setText(uname.getText());
//                showp.setText(pass.getText());
//                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//                startActivity(intent);
                //Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                SerializableClass orang = new SerializableClass(uname.getText().toString(), "");
//                SerializableClass orang = new SerializableClass();
//                orang.setFirstName("Saya");
//                orang.getFirstName();
                Bundle bundle = new Bundle();
                bundle.putSerializable("user", orang);
                i.putExtras(bundle);

//                i.putExtra("name", uname.getText().toString());
//                i.putExtra("password", pass.getText().toString());
                startActivity(i);
            }
        });
    }
}
