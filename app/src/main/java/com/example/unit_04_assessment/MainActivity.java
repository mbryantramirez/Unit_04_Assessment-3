package com.example.unit_04_assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView animalRecyclerView;
    private ArrayList<Message> animals = new ArrayList<>();
    private AnimalAdapter animalAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalRecyclerView = findViewById(R.id.animal_recyclerview);
        layoutManager = new GridLayoutManager(this,1);
        animalRecyclerView.setHasFixedSize(true);
        animalRecyclerView.setLayoutManager(layoutManager);
        animalAdapter = new AnimalAdapter(animals);
        animalRecyclerView.setAdapter(animalAdapter);
    }
}
