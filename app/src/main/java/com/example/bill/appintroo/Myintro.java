package com.example.bill.appintroo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import static android.graphics.Color.*;


/**
 * Created by bill on 10/13/15.
 */
public class Myintro extends AppIntro {



    @Override
    public void init(Bundle savedInstanceState){

        addSlide(AppIntroFragment.newInstance("title",
                "description"
                ,R.drawable.icon,
                Color.parseColor("#2196F3")));

    }

    @Override
    public void onSkipPressed() {
        Toast.makeText(getApplicationContext(),"Skipped", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onDonePressed() {
        Toast.makeText(getApplicationContext(),"Done!", Toast.LENGTH_LONG).show();
    }
}
