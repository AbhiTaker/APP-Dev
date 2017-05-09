package com.example.hp74tu.takerbook;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class message extends AppCompatActivity {

    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

    }

    public void sendsms(View v)
    {
        String no = et1.getText().toString();
        String msg = et2.getText().toString();
        Intent sent = new Intent(this,sent.class);
        PendingIntent sentpi = PendingIntent.getActivity(this,0,sent,0);
        Intent deliver = new Intent(this,deliver.class);
        PendingIntent deliverpi = PendingIntent.getActivity(this,0,deliver,0);

        SmsManager sm = SmsManager.getDefault();
        sm.sendTextMessage(no, null ,msg,sentpi,deliverpi);

        Toast.makeText(this , "sending...",Toast.LENGTH_SHORT).show();

    }
}
