package com.example.hp74tu.hardwaredemo;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opencam(View v)
    {
       String camera_action_name = MediaStore.ACTION_IMAGE_CAPTURE ;
        Intent cam = new Intent(camera_action_name);
        startActivity(cam);

    }
    public void vibdevice(View v1)
    {
        String service_name = Context.VIBRATOR_SERVICE;
       Vibrator v = (Vibrator)getSystemService(service_name);
        v.vibrate(500);

    }
    public void btsetting(View v)
    {
      String bt =  Settings.ACTION_BLUETOOTH_SETTINGS;
        Intent b = new Intent(bt);
        startActivity(b);


    }
    public void btpanel(View v)
    {
         Intent info = new Intent(this, btdemo.class);
        startActivity(info);
    }
}
