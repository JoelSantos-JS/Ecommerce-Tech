package com.joel.br.Ecommerce.Tech.services;

import com.joel.br.Ecommerce.Tech.DTO.OrderDTO;
import com.joel.br.Ecommerce.Tech.mapper.OrderMapper;
import com.joel.br.Ecommerce.Tech.model.Order;
import com.joel.br.Ecommerce.Tech.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderServices {

    private  final OrderRepository repository;
    private  final OrderMapper mapper;



    public List<Order> findAll() {

		return repository.findAll();

    }


    public Order findById(Long id) {
        return  repository.findById(id).get();
    }


    public Order createOrder(OrderDTO order){
        order.setMoment(Instant.now());

        Order order1 = mapper.toEntity(order);

        return repository.save(order1);
    }


    public Order updateOrder(Long id,OrderDTO order){
        Order order1 = findById(id);
        if(order1 != null){
            order.setStatus(order.getStatus());
            order1.setMoment(Instant.now());

            return repository.save(order1);
        }
        return null;
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
