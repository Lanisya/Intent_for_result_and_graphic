package com.example.gt303_17.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    Button btnRegister1;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegister1 = findViewById(R.id.btnRegister1);
        btnRegister1.setOnClickListener(this);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        email = findViewById(R.id.UsernameLogin);
        password = findViewById(R.id.PasswordLogin);

        email.setText(getIntent().getStringExtra("DataNama"));
        password.setText(getIntent().getStringExtra("DataPassword"));
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnRegister1:
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.btnLogin:
                if (!email.getText().toString().equals("")&&(!password.getText().toString().equals(""))) {
                    intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
        }


    }
}