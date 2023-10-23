package com.joel.br.Ecommerce.Tech.repository;

import com.joel.br.Ecommerce.Tech.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
