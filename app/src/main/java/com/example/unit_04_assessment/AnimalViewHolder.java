package com.example.unit_04_assessment;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;
    final Retrofit retrofit = RetrofitSingleton.getInstance();
    Intent intent;

    public AnimalViewHolder (@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.animal_text_view);
        imageView = itemView.findViewById(R.id.animal_image_view);

    }

    public void onBind (final Message message) {
        textView.setText(message.getAnimal());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra("animal name",message.getAnimal());
                intent.putExtra("animal image", message.getImage());
                intent.putExtra("animal URI", message.getWiki());
                itemView.getContext().startActivity(intent);


            }
        });
        retrofit.create(AnimalService.class)
                .getAnimals()
                .enqueue(new Callback<MyPojo>() {
                    @Override
                    public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {
                        MyPojo myPojo = response.body();
                        if (myPojo != null) {
                            Log.d("woohoo", "onResponse: " + myPojo.getMessage());

                            Picasso.get()
                                    .load(String.valueOf(myPojo.getMessage()))
                                    .into(imageView);
                        }
                    }

                    @Override
                    public void onFailure(Call<MyPojo> call, Throwable t) {
                        Log.d("boohoo", " onFailure: " + t.getMessage());
                    }
                });

    }


}
