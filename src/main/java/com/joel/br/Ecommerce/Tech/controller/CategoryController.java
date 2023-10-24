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


    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(categoryServices.findById(id));

    }
    @GetMapping
    public ResponseEntity<List<Category>> categories(){
        return ResponseEntity.ok().body(categoryServices.findAll());
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody CategoryDTO category){
        return ResponseEntity.ok().body(categoryServices.create(category));
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<Category> updateCategory ( @PathVariable Long id, @RequestBody CategoryDTO category){

        return  ResponseEntity.ok().body(categoryServices.update(id,category));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id){
        categoryServices.delete(id);
        return ResponseEntity.noContent().build();
    }
}
