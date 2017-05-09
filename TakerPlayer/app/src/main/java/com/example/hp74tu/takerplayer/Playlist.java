package com.example.hp74tu.takerplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
    }

    public void music(View v)
    {
        Intent info = new Intent(this , audio.class);
        startActivity(info);
    }

    public void exit (View v)
    {
        finish();
    }

    public void videopage(View v)
    {
        Intent info = new Intent(this , video.class);
        startActivity(info);
    }
}
