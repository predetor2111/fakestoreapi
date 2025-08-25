package com.example.fakestoreapi.configuration;

import com.example.fakestoreapi.gateway.api.FakeStoreCategoryResponseApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class retrofitConfig {

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryResponseApi FakeStoreCategoryResponseApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryResponseApi.class);
    }

}
