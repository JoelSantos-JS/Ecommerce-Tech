package com.joel.br.Ecommerce.Tech.repository;

import com.joel.br.Ecommerce.Tech.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
