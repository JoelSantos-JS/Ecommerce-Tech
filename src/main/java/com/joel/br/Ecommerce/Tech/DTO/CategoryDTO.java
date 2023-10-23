package com.joel.br.Ecommerce.Tech.DTO;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class CategoryDTO {

    private Long id;
    private String name;
    private Set<ProductDTO> products = new HashSet<>();
}
