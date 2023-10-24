package com.joel.br.Ecommerce.Tech.controller;

import com.joel.br.Ecommerce.Tech.DTO.ProductDTO;
import com.joel.br.Ecommerce.Tech.model.Product;
import com.joel.br.Ecommerce.Tech.services.ProductServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/product")
@AllArgsConstructor
public class ProductController {
    private final ProductServices services;



    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok().body(services.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(services.findById(id));  // ResponseEntity.ok().body(services.findById(id));
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductDTO product) {
        return ResponseEntity.ok().body(services.saveProduct(product));  // ResponseEntity.ok().body(services.create(product));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody ProductDTO product) {

    return ResponseEntity.ok().body(services.updateProduct(id, product));
    }


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        services.deleteProduct(id);
        return  ResponseEntity.noContent().build();
    }

}
