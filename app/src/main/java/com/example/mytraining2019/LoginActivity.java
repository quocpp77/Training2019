package com.example.mytraining2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EMAIL = "EMAIL";
    public static final String PASS = "PASS";

    Button btnLogin, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnLogin: onLoginClick(); break;
            case R.id.btn2: on2Click(); break;
            case R.id.btn3: on3Click(); break;
        }

    }

    private void onLoginClick() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EMAIL, "quocpp@pcdongnai.vn");
        intent.putExtra(PASS, "123456");
        startActivity(intent);
    }

    private void on2Click() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    private void on3Click() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }


}
