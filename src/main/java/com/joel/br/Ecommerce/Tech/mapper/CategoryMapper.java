package com.joel.br.Ecommerce.Tech.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joel.br.Ecommerce.Tech.DTO.CategoryDTO;
import com.joel.br.Ecommerce.Tech.DTO.ProductDTO;
import com.joel.br.Ecommerce.Tech.model.Category;
import com.joel.br.Ecommerce.Tech.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CategoryMapper {

    private  final ObjectMapper mapper;



    public Category toEntity(CategoryDTO categoryDTO) {
    return  mapper.convertValue(categoryDTO, Category.class);
    }

    public  CategoryDTO toDto(CategoryDTO categoryDTO) {
        return  mapper.convertValue(categoryDTO, CategoryDTO.class);
    }
}
