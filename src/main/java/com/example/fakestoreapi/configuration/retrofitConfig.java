package com.example.fakestoreapi.configuration;

import com.example.fakestoreapi.gateway.api.FakeStoreCategoryResponseApi;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Configuration
public class retrofitConfig {

    @Bean
    public Retrofit retrofit(){

        Dotenv dotenv = Dotenv.load();
        String baseUrl = dotenv.get("BASE_URL");

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryResponseApi FakeStoreCategoryResponseApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryResponseApi.class);
    }

}
