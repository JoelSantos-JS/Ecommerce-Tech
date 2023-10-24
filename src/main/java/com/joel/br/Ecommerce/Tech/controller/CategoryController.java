package com.joel.br.Ecommerce.Tech.controller;

import com.joel.br.Ecommerce.Tech.DTO.CategoryDTO;
import com.joel.br.Ecommerce.Tech.model.Category;
import com.joel.br.Ecommerce.Tech.services.CategoryServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/category")
@AllArgsConstructor
public class CategoryController {

    private  final CategoryServices categoryServices;



    @GetMapping
    public ResponseEntity<List<Category>> categories(){
        return ResponseEntity.ok().body(categoryServices.findAll());
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody CategoryDTO category){
        return ResponseEntity.ok().body(categoryServices.create(category));
    }
}
