package com.example.fakestoreapi.controllers;

import com.example.fakestoreapi.DTOs.categoryDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.fakestoreapi.service.Icategoryservice;

import java.io.IOException;
import java.util.List;

@RestController()
@RequestMapping("/api/category")
public class CategoryController {

    private final Icategoryservice cs;
    CategoryController(Icategoryservice c) {
        this.cs = c;
    }

    @GetMapping
    public List<categoryDTO> getAllCategory() throws IOException{
        return this.cs.getAllCategories();
    }
}
