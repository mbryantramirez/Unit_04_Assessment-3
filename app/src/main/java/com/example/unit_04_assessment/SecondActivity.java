package com.example.unit_04_assessment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity implements DetailFragment.OnFragmentInteractionListener {
    Message message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onFragmentInteraction(Uri website) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, DetailFragment.newInstance(message.getImage(), String.valueOf(message.getWiki()), message.getAnimal()))
                .addToBackStack(null)
                .commit();


    }
}
