package com.joel.br.Ecommerce.Tech.controller;

import com.joel.br.Ecommerce.Tech.model.OrderItem;
import com.joel.br.Ecommerce.Tech.services.OrderItemServices;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/order-item")
@AllArgsConstructor
public class OrderItemController {

    private  final OrderItemServices services;



    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll() {
        return ResponseEntity.ok().body(services.findAll());
    }

    @GetMapping(value = "/{id}")
    public   ResponseEntity<OrderItem> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(services.findById(id));
    }
    @PostMapping
    public ResponseEntity<OrderItem> create(@RequestBody OrderItem orderItem) {
        return ResponseEntity.ok().body(services.create(orderItem));
    }
}
