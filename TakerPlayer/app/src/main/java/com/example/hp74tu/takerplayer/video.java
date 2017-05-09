package com.example.hp74tu.takerplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {

     VideoView screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        screen =(VideoView)findViewById(R.id.screen);

        String res = "android.resource://com.example.hp74tu.takerplayer/" + R.raw.jungle;
        Uri video = Uri.parse(res);
        screen.setVideoURI(video);
        screen.start();
        MediaController remote = new MediaController(this);
         screen.setMediaController(remote);

    }




}
