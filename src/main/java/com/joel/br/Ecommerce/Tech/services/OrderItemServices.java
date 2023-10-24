package com.joel.br.Ecommerce.Tech.services;

import com.joel.br.Ecommerce.Tech.model.OrderItem;
import com.joel.br.Ecommerce.Tech.repository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderItemServices {

    private  final OrderItemRepository repository;





    public List<OrderItem> findAll() {
        return  repository.findAll();
    }


    public OrderItem findById(Long id) {
        return repository.findById(id).get();
    }


    public OrderItem create(OrderItem orderItem){
        return repository.save(orderItem);
    }
}
