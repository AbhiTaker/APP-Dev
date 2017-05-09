package com.example.hp74tu.abhishek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class image extends AppCompatActivity {
     ImageView ob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ob = (ImageView)findViewById(R.id.pic) ;

    }

    public void flipimage (View v) {
        int sid = v.getId();
        if (sid == R.id.pic1)
        {
           ob.setImageResource(R.drawable.facebook) ;
        }
        else if(sid ==R.id.pic2)
        {
            ob.setImageResource(R.drawable.socialtwitter) ;
        }
    }
}
