package com.example.fakestoreapi.gateway;
import com.example.fakestoreapi.DTOs.categoryDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


public interface ICategoryGateway {
   List<categoryDTO> getAllCategories() throws IOException;
}
