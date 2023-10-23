package com.joel.br.Ecommerce.Tech.DTO;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ProductDTO {

    private Long id;
    private String name;

    private String description;

    private Double price;

    private String image;
    private Set<CategoryDTO> categories = new HashSet<>();
}
