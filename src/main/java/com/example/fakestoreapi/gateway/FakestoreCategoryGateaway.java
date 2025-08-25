package com.example.fakestoreapi.gateway;

import com.example.fakestoreapi.DTOs.FakeStoreCategoryResponseDTO;
import com.example.fakestoreapi.DTOs.categoryDTO;
import com.example.fakestoreapi.gateway.api.FakeStoreCategoryResponseApi;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Service;




import java.io.IOException;
import java.util.List;

@Component
public class FakestoreCategoryGateaway implements ICategoryGateway {

    private final FakeStoreCategoryResponseApi categoryapi;
    public FakestoreCategoryGateaway(FakeStoreCategoryResponseApi categoryapi){
        this.categoryapi = categoryapi;
    }

    @Override
    public List<categoryDTO> getAllCategories() throws IOException{
        FakeStoreCategoryResponseDTO response = this.categoryapi.getAllFakeCategories().execute().body();
        if(response == null){
            throw new IOException("Failed to fetch");
        }

        return response.getCategories().stream().
                map(category ->categoryDTO.builder().
                        name(category).build()).toList();
    }
}

// make http request and
