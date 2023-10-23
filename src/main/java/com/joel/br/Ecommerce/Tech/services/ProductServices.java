package com.joel.br.Ecommerce.Tech.services;

import com.joel.br.Ecommerce.Tech.DTO.ProductDTO;
import com.joel.br.Ecommerce.Tech.mapper.ProductMapper;
import com.joel.br.Ecommerce.Tech.model.Product;
import com.joel.br.Ecommerce.Tech.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServices {

    private  final ProductRepository repository;
    private final ProductMapper mapper;



    public Product saveProduct(ProductDTO productDTO){
        Product product = mapper.toEntity(productDTO);
        return repository.save(product);
    }
}
