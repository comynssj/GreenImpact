package com.example.java_version_greenimpact;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void et_register_onclick(View view) {
        EditText etID = findViewById(R.id.et_id);
        EditText etEmail = findViewById(R.id.et_email);
        EditText etPassword = findViewById(R.id.et_password);

        Intent intent = new Intent();
        intent.putExtra("id",etID.getText().toString());
        intent.putExtra("email",etEmail.getText().toString());
        intent.putExtra("password",etPassword.getText().toString());


        int resultCode = 0;
        setResult(resultCode, intent);
        finish();
    }

    public void et_back_onclick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}