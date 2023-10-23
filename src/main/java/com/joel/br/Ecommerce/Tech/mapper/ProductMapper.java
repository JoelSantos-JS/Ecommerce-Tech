package com.joel.br.Ecommerce.Tech.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joel.br.Ecommerce.Tech.DTO.ProductDTO;
import com.joel.br.Ecommerce.Tech.DTO.UserDTO;
import com.joel.br.Ecommerce.Tech.model.Product;
import com.joel.br.Ecommerce.Tech.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductMapper {

    private  final ObjectMapper mapper;



    public Product toEntity(ProductDTO productDTO) {
    return  mapper.convertValue(productDTO, Product.class);
    }

    public  ProductDTO toDto(Product product) {
        return  mapper.convertValue(product, ProductDTO.class);
    }
}
