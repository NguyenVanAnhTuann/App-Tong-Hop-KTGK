package com.example.tuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {
    Button bDangky ;
    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        bDangky = (Button) findViewById(R.id.imagebuttonSignup);

     bDangky.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view  ) {
            Intent ok = new Intent(Signup.this, Login.class);
            startActivity(ok);
        }
    });
     imgBack = (ImageView) findViewById(R.id.imageviewBack);
     imgBack.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent back = new Intent(Signup.this, Login.class);
             startActivity(back);
         }
     });
    }

}



