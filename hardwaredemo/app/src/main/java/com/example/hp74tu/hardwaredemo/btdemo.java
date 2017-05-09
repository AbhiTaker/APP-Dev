package com.example.hp74tu.hardwaredemo;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class btdemo extends AppCompatActivity {

     TextView status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btdemo);

        status = (TextView)findViewById(R.id.textview1);
        BluetoothAdapter bt = BluetoothAdapter.getDefaultAdapter();
        boolean value = bt.isEnabled();
        if(value)
        {
            status.setText("ON");
            int blue = 0x0000ff;
            status.setTextColor(blue);
        }
        else
        {
            status.setText("OFF");
            int red = 0xff0000;
            status.setTextColor(red);
        }

    }
}
