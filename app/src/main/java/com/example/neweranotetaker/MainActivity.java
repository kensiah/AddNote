package com.example.neweranotetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editUsername,editPassword;
    private String username = "kensiah", password = "kensiah123";
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews() {
        editUsername = findViewById(R.id.editUsername);
        editPassword = findViewById(R.id.editPassword);
        login = findViewById(R.id.login);
    }

    protected void setListeners() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = editUsername.getText().toString();
                String inputPassword = editPassword.getText().toString();

                if (inputUsername.equals(username) && inputPassword.equals(password)){
  //                  Toast.makeText(MainActivity.this, "Login successful",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this, "Login Fail",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
