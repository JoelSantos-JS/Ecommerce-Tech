package com.joel.br.Ecommerce.Tech.services;

import com.joel.br.Ecommerce.Tech.DTO.OrderDTO;
import com.joel.br.Ecommerce.Tech.mapper.OrderMapper;
import com.joel.br.Ecommerce.Tech.model.Order;
import com.joel.br.Ecommerce.Tech.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@AllArgsConstructor
public class OrderServices {

    private  final OrderRepository repository;
    private  final OrderMapper mapper;


    public Order createOrder(OrderDTO order){
        order.setMoment(Instant.now());

        Order order1 = mapper.toEntity(order);

        return repository.save(order1);
    }
}
