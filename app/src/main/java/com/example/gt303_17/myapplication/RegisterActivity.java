package com.example.gt303_17.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRegister2;
    EditText reqName,reqPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reqName = findViewById(R.id.Username);
        reqPass = findViewById(R.id.Password);

        btnRegister2 = findViewById(R.id.btnRegister2);
        btnRegister2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        intent.putExtra("DataNama", reqName.getText().toString());
        intent.putExtra("DataPassword", reqPass.getText().toString());
        startActivity(intent);
    }
}