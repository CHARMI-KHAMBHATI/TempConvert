package com.charmi.tempconvert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class IntentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        ImageView iv = (ImageView)findViewById(R.id.iv);
        iv.setImageResource(R.drawable.acm);
    }

}
