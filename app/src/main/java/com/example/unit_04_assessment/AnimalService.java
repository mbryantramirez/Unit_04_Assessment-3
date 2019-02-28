package com.example.unit_04_assessment;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AnimalService {
     String ENDPOINT ="/JDVila/storybook/master/echinoderms.json";

    @GET(ENDPOINT)
    Call<MyPojo> getAnimals();
}
