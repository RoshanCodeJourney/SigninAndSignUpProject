package com.example.splashscreensignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class account_created extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_created);

        Toast.makeText(account_created.this, "Account has Been Created. ", Toast.LENGTH_SHORT).show();
    }
}