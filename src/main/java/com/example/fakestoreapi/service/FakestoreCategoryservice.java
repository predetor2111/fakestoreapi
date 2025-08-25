package com.example.fakestoreapi.service;

import com.example.fakestoreapi.DTOs.categoryDTO;
import com.example.fakestoreapi.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreCategoryservice implements Icategoryservice {

    private final ICategoryGateway categoryGateway;
    public FakestoreCategoryservice(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<categoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }
}
