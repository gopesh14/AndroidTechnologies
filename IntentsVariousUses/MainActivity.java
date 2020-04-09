package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2,b3,b4;
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openBrowser();
            }
        });
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhone();
            }
        });
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSms();
            }
        });
    }
    public void changeActivity(){
        Intent intent = new Intent(this,Second.class);
        startActivity(intent);
    }
    public void openBrowser(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
    public void openPhone(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:9154717927"));
        startActivity(intent);
    }
    public void sendSms(){
        Intent intent = new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:9154717927"));
        intent.putExtra("sms_body","Hello, Richard!");
        startActivity(intent);
    }

}
