package com.example.hp74tu.takerplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class audio extends AppCompatActivity {

    MediaPlayer mp;
    TextView duration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        mp = MediaPlayer.create(this , R.raw.chakdeindia);
        duration = (TextView)findViewById(R.id.dur);
        int dur = mp.getDuration();
        dur = dur/1000 ;
        int sec = dur%60 ;
        dur = dur/60;
        String time = "DURATION - " + dur + ":" + sec;
        duration.setText(time);
    }

    public void forward( View v)
    {int nl = mp.getCurrentPosition()+3000;
     if(nl< mp.getDuration() + 3000)
     {    mp.seekTo(nl);
     }
     }

    public void play(View v)
    {
        mp.start();

    }

    public void pause(View v)
    {
        mp.pause();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}
