package com.PRAYUDO.simpelkejarikonawe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.PRAYUDO.simpelkejarikonawe.Profile.profile;
import com.PRAYUDO.simpelkejarikonawe.QA.QA_home;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showProfile(View view) {
        Intent intent = new Intent(MainActivity.this, profile.class);
        startActivity(intent);
    }


    public void showQA(View view) {
        Intent intent = new Intent(MainActivity.this, QA_home.class);
        startActivity(intent);
    }
}
