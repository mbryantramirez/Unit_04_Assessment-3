package com.example.unit_04_assessment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ArrayList<Message> animals;

    public AnimalAdapter (ArrayList<Message> animals) {
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        AnimalViewHolder animalViewHolder = new AnimalViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_view, viewGroup,false));
        return animalViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder animalViewHolder, int position) {
        animalViewHolder.onBind(animals.get(position));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
