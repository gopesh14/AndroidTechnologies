package com.example.toastex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //making toast
        String message = "Hello World!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        //if Toast.LENGTH_LONG constant was used then toast appears longer than usual.
    }
}
