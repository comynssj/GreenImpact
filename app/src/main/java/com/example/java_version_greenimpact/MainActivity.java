package com.example.java_version_greenimpact;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView show_Status;
    private TextView show_ID;
    private TextView show_Email;

    private static final int REGISTER_CODE = 1;
    private static final int SIGNIN_CODE =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_Status = findViewById(R.id.main_status);
        show_ID = findViewById(R.id.main_id);
        show_Email = findViewById(R.id.main_email);
    }

    public void main_register_onclick(View view) {
        Intent intent = new Intent(this,register.class);
        startActivityForResult(intent,REGISTER_CODE);
    }


    public void main_sign_in_onclick(View view) {
        Intent intent = new Intent(this,signin.class);
        startActivityForResult(intent,SIGNIN_CODE);

    }

    public void main_Quit_onclick(View view) {
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if(intent == null){
            return;
        }
        switch (requestCode){
            case REGISTER_CODE:
                show_Status.setText("Registration Successful");
                show_ID.setText("ID:"+intent.getStringExtra("id"));
                show_Email.setText("Email:"+intent.getStringExtra("email"));
                break;
            case SIGNIN_CODE:
                show_Status.setText(("Sign in Successful"));
                show_ID.setText("Hello  "+intent.getStringExtra("id"));
                show_Email.setText("");
                break;
        }
    }

}