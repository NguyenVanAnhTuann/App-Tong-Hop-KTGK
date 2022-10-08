package com.example.tuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Profile extends AppCompatActivity {
    ImageView imgBack;
    Button imgLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imgBack = (ImageView) findViewById(R.id.imageviewBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Profile.this, Listview.class);
                startActivity(back);
            }
        });
        imgLogout = (Button) findViewById(R.id.imageviewLogout);
        imgLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(Profile.this, Login.class );
                startActivity(logout);
            }
        });
    }

}
