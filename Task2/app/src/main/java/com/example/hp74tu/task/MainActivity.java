package com.example.hp74tu.task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView t1,t2;
    int count=0;
    String [] versionNames = {
            "Alpha","Beta","Cupcake", "Donut", "Eclaire", "Froyo",  "GingerBread","HoneyComb", "IceCream Sandwitch",
            "JellyBean", "Kitkat", "Lollipop", "Marshmallow"
    };

    int [] versionImages = {
            R.drawable.alpha, R.drawable.beta, R.drawable.cupcake, 	R.drawable.donut, R.drawable.eclair, R.drawable.froyo, 		R.drawable.gingerbread, R.drawable.honeycomb,
            R.drawable.icecreamsandwitch, R.drawable.jellybean, 					R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.imag) ;

    }



    public void flipimage(View v)
    {
        int sid = v.getId();
        if(sid == R.id.next)
        {
            if(count==12)
            {
                Toast.makeText(this ,"LAST IMAGE",Toast.LENGTH_SHORT).show();
            }
            else {
                count++;
                t1 = (TextView) findViewById(R.id.textview1);
                t2 = (TextView) findViewById(R.id.textview2);
                t2.setText(versionNames[count]);
                img.setImageResource(versionImages[count]);
            }

        }
        else {
            if(count==0)
            {
                Toast.makeText(this ,"FIRST IMAGE",Toast.LENGTH_SHORT).show();
            }
            else {
                count--;
                t1 = (TextView) findViewById(R.id.textview1);
                t2 = (TextView) findViewById(R.id.textview2);
                t2.setText(versionNames[count]);
                img.setImageResource(versionImages[count]);
            }
        }

    }

    }



