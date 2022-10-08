package com.example.tuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText eUser,ePassword;
    Button btnSignup;
    Button btnLogin;
    String ten , mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Anhxa();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eUser.getText().length() != 0 && ePassword.getText().length() !=0){
                    if (eUser.getText().toString().equals(ten) && ePassword.getText().toString().equals(mk)){
                        Toast.makeText(Login.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,Listview.class);
                        startActivity(intent);
                    }else if (eUser.getText().toString().equals("anhtuan") && ePassword.getText().toString().equals("1")){
                        Toast.makeText(Login.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,Listview.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Login.this,"Sai tên người dùng hoặc sai mật khẩu",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(Login.this,"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view  ) {
                Intent ok = new Intent(Login.this, Signup.class);
                startActivity(ok);
            }
        });

    }
    private void Anhxa(){
        eUser = (EditText) findViewById(R.id.editUser);
        ePassword = (EditText) findViewById(R.id.editPassword);
        btnLogin = (Button) findViewById(R.id.buttonSignin);
        btnSignup =(Button) findViewById(R.id.buttonSignup);
    }
}