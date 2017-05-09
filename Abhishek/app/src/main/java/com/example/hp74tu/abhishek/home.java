package com.example.hp74tu.abhishek;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class home extends AppCompatActivity {
    TextView ob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


          ;      //  (TextView)findViewById( R.id.textview1); //accesing elements by id and typecastin// String content = ob.getText().toString();
          //  content = content.toUpperCase();

          ob =  (TextView)findViewById( R.id.textview1);            //  ob.setText(content);

                            //overriding in java file


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void second(View v)
    {
        Intent info = new Intent(this , Calculator.class )       ;
        startActivity(info);
    }

    public  void app(View v)
    {
        Intent info = new Intent(this,app.class);
        startActivity(info);
    }
    public void exit(View v)
    {
        finish();
    }
    int status = 0;
    public void upper(View v)
    {

      String content = ob.getText().toString();
        if(status ==0) {
            content = content.toUpperCase();
            ob.setText(content);
            status = 1;
        }
        else
        {
                           // int sid=v.getId();
            content = content.toLowerCase();
            ob.setText(content);
            status = 0;
        }
    }

    @Override
    public void onBackPressed() {
        Toast t = Toast.makeText(this , "Press BACK to exit", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
