package com.ytl.imageswitchingviabutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SwitchImage(View view) {
        //Log.i("hello", "button pressed");
        ImageView image = findViewById(R.id.imageView3);

        if (image.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.car).getConstantState())
        {
            Toast.makeText(this, "it's VW and switch to BMW", Toast.LENGTH_SHORT).show();
            image.setImageResource(R.drawable.bmw);
        }
        else
        {
            Toast.makeText(this, "it's BMW and switch to VW", Toast.LENGTH_SHORT).show();
            image.setImageResource(R.drawable.car);
        }
    }

}
