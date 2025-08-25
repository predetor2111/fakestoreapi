package com.example.fakestoreapi.gateway.api;

import com.example.fakestoreapi.DTOs.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;


public interface FakeStoreCategoryResponseApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllFakeCategories() throws IOException;
}
