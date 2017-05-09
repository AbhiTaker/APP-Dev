package com.example.hp74tu.abhishek;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
    }
    public void open(View v)
    {
        int sid = v.getId();
        if( sid ==R.id.dial)
        {
            String no = "tel:7006903810";
            Uri data = Uri.parse(no);
            Intent info = new Intent(Intent.ACTION_DIAL,data);
            startActivity(info);
        }
        if(sid == R.id.explore)
        {
            String url = "http://www.google.com";
                    Uri data = Uri.parse(url);
            Intent info = new Intent(Intent.ACTION_VIEW,data);
            startActivity(info);
        }
        if(sid == R.id.phonebook)
        {
            String address = "content://contacts/people/";
            Uri data = Uri.parse(address);
            Intent info = new Intent(Intent.ACTION_VIEW,data);
            startActivity(info);
        }
        if(sid == R.id.mymap)
        {
            String location = "geo:";
            Uri data = Uri.parse(location);
            Intent info = new Intent(Intent.ACTION_VIEW,data);
            startActivity(info);
        }

    }
}
