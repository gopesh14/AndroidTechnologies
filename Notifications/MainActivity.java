package com.example.notificationex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotification();
            }
        });

    }
    private void addNotification(){

        //step 1 to create Notification builder
        //step 2 also in a line as adding mandatory properties for notification
        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.n1)
                                                                                           .setContentTitle("Notification Example")
                                                                                           .setContentText("This is a demo");
        //step 3 to make intent
        Intent intent = new Intent(this,MainActivity.class);

        //now making pending intent
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        nBuilder.setContentIntent(pendingIntent);

        //step 4 issuing notification
        NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0,nBuilder.build());
    }
}
