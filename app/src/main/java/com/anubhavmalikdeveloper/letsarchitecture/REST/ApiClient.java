package com.anubhavmalikdeveloper.letsarchitecture.REST;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private ApiClient apiClient;
    private final String baseUrl = "https://jsonplaceholder.typicode.com/";


    public ApiClient getApiClientInstance() {
        if (apiClient == null) {
            apiClient = new ApiClient();
        }
        return apiClient;
    }

    public <S> S createService(Class<S> apiInterface){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(apiInterface);
    }
}
