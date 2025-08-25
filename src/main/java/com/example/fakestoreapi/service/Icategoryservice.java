package com.example.fakestoreapi.service;
import com.example.fakestoreapi.DTOs.categoryDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


public interface Icategoryservice {

        public List<categoryDTO> getAllCategories() throws IOException;
}
