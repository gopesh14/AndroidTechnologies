package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    EditText e2;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e2 = (EditText) findViewById(R.id.et2);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = e2.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MESSAGE",msg);
                setResult(2,intent);
                finish();
            }
        });
    }
}
