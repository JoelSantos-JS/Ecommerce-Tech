package com.joel.br.Ecommerce.Tech.repository;

import com.joel.br.Ecommerce.Tech.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
