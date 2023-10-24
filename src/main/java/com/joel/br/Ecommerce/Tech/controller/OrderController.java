package com.joel.br.Ecommerce.Tech.controller;

import com.joel.br.Ecommerce.Tech.DTO.OrderDTO;
import com.joel.br.Ecommerce.Tech.model.Order;
import com.joel.br.Ecommerce.Tech.services.OrderServices;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/orders")
@AllArgsConstructor
public class OrderController {


    private  final OrderServices services;



    @GetMapping
    public ResponseEntity<List<Order>> getAllOrder() {
        return ResponseEntity.ok().body(services.findAll());
    }


    @PostMapping

    public ResponseEntity<Order> createOrderA(@RequestBody OrderDTO orderDTO){
       Order order = services.createOrder(orderDTO);
        return ResponseEntity.ok().body(order);
    }
}
