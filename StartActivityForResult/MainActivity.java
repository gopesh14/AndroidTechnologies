package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.tv1);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Second.class);
                startActivityForResult(intent,1);  // Activity is started with a request code - 1
            }
        });

    }
    //Now, callback method to get result from Second activity
    @Override
    protected void onActivityResult(int reqCode,int resCode,Intent intent){
        super.onActivityResult(reqCode,resCode,intent);
        //checking whether request code is same or not
        if (reqCode == 1) {
            String msg = intent.getStringExtra("MESSAGE");
            t1.setText(msg);
        }
    }
}
