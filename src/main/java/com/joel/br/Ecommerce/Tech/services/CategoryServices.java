package com.joel.br.Ecommerce.Tech.services;

import com.joel.br.Ecommerce.Tech.DTO.CategoryDTO;
import com.joel.br.Ecommerce.Tech.mapper.CategoryMapper;
import com.joel.br.Ecommerce.Tech.model.Category;
import com.joel.br.Ecommerce.Tech.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServices {

    private final CategoryRepository repository;
    private final CategoryMapper mapper;



    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        return repository.findById(id).get();
    }
    public Category create(CategoryDTO category){

        Category category1 = mapper.toEntity(category);
        return repository.save(category1);
    }

    public Category update(Long id, CategoryDTO category){
       Category category1 = findById(id);
       if(category1 != null){
           category1.setName(category.getName());
       }
        return repository.save(category1);
    }

    public  void delete(Long id){
        repository.deleteById(id);
    }
}
