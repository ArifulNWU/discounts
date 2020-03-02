package com.arifulislam.restro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText user,pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.emailedittest);
        pass = findViewById(R.id.passwordedittext);
        login = findViewById(R.id.loginbtn);

        user.setText("ariful@gmail.com");
        pass.setText("12345");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("ariful@gmail.com") && pass.getText().toString().equals("12345")){
                    startActivity(new Intent(Login.this,Dashboard.class));
                    finish();
                }
            }
        });
    }
}
