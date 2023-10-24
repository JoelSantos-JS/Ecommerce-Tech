package com.joel.br.Ecommerce.Tech.services;

import com.joel.br.Ecommerce.Tech.DTO.ProductDTO;
import com.joel.br.Ecommerce.Tech.mapper.ProductMapper;
import com.joel.br.Ecommerce.Tech.model.Product;
import com.joel.br.Ecommerce.Tech.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServices {

    private  final ProductRepository repository;
    private final ProductMapper mapper;



    public List<Product> findAll(){
        return repository.findAll();
    }


    public Product findById(Long id){
        return repository.findById(id).get();
    }
    public Product saveProduct(ProductDTO productDTO){
        Product product = mapper.toEntity(productDTO);
        return repository.save(product);
    }


    public Product updateProduct(Long id,ProductDTO productDTO){
        Product product = findById(id);
        if(product != null){
          product.setDescription(productDTO.getDescription());
          product.setPrice(productDTO.getPrice());
          product.setName(productDTO.getName());
          product.setImage(productDTO.getImage());
          return repository.save(product);
        }
    return  null;
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }
}
