package com.example.tuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    TextView txtTen, txtNoidung;
    ImageView imgHinh,imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTen = (TextView) findViewById(R.id.textviewTen);
        txtNoidung = (TextView) findViewById(R.id.textviewNoidung);
        imgHinh = (ImageView) findViewById(R.id.imageviewHinh);


        Intent intent = getIntent();
        String Ten = intent.getStringExtra("ten");
        txtTen.setText(Ten);

        String Noidung = intent.getStringExtra("noidung");
        txtNoidung.setText(Noidung);

        int Hinh= intent.getIntExtra("hinh",1);
        imgHinh.setImageResource(Hinh);


        imgBack = (ImageView) findViewById(R.id.imageviewBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Detail.this, Listview.class);
                startActivity(back);
            }
        });

    }
}