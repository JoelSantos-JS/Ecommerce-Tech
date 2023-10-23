package com.joel.br.Ecommerce.Tech.services;

import com.joel.br.Ecommerce.Tech.DTO.CategoryDTO;
import com.joel.br.Ecommerce.Tech.mapper.CategoryMapper;
import com.joel.br.Ecommerce.Tech.model.Category;
import com.joel.br.Ecommerce.Tech.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServices {

    private final CategoryRepository repository;
    private final CategoryMapper mapper;



    public Category create(CategoryDTO category){

        Category category1 = mapper.toEntity(category);
        return repository.save(category1);
    }
}
