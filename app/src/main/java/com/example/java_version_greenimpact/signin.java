package com.example.java_version_greenimpact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class signin extends AppCompatActivity {
    private static final int SIGNIN_CODE =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void sign_sign_onclick(View view) {


        EditText et_ID = findViewById(R.id.sign_id);
        EditText et_Password = findViewById(R.id.sign_password);
        Intent intent = new Intent(this,MainPage.class);
        startActivityForResult(intent,SIGNIN_CODE);
        intent.putExtra("id",et_ID.getText().toString());
        intent.putExtra("password",et_Password.getText().toString());

        int resultCode = 0;
        setResult(resultCode, intent);


    }

    public void sign_back_onclick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}