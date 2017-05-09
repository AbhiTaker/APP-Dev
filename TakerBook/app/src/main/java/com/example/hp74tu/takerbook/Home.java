package com.example.hp74tu.takerbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        splash s = new splash();
        s.start();


    }

    class splash extends Thread {

            public void run(){
                try{
                    sleep(3000);
                }catch (Exception e){}

                Intent info = new Intent(Home.this , message.class);
                startActivity(info);
                finish();
            }
    }



}

