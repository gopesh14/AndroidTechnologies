package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToContacts();
            }
        });

    }
    public void goToContacts(){
        Intent read1=new Intent();
        read1.setAction(android.content.Intent.ACTION_VIEW);
        read1.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivity(read1);
    }
}
