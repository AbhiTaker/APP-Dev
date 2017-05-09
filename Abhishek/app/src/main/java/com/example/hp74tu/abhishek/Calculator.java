package com.example.hp74tu.abhishek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    EditText a,b;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

    }
    public void operate(View v)
    {
        a =  (EditText)findViewById( R.id.inputa);
       String x = ( a.getText().toString());
        int m =  Integer.parseInt(x);



        b =  (EditText)findViewById( R.id.inputb);
        String y = b.getText().toString();
        int n = Integer.parseInt(y);
        res = (TextView)findViewById(R.id.result);
        res.setText("Result : ");
        String c = res.getText().toString();
        int sid = v.getId();
        int z=0;
        if( sid ==R.id.add)
        {
          z = m + n ;
        }

        if( sid ==R.id.sub)
        {
           z = m - n ;
        }
        if( sid ==R.id.mul)
        {
            z = m*n ;

        }
        if( sid ==R.id.div)
        {
            try {
                 z = m / n;

                res.setText(c + z);
            }
            catch ( Exception e)
            {
                res.setText("DIVIDE BY ZERO ERROR");
            }

        }
        res.setText(c + z);
    }


}
