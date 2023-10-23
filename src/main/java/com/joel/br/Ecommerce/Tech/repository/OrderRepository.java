package com.joel.br.Ecommerce.Tech.repository;

import com.joel.br.Ecommerce.Tech.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
