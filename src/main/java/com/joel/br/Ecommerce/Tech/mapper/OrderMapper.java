package com.joel.br.Ecommerce.Tech.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joel.br.Ecommerce.Tech.DTO.OrderDTO;
import com.joel.br.Ecommerce.Tech.DTO.UserDTO;
import com.joel.br.Ecommerce.Tech.model.Order;
import com.joel.br.Ecommerce.Tech.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderMapper {

    private  final ObjectMapper mapper;



    public Order toEntity(OrderDTO orderDTO) {
    return  mapper.convertValue(orderDTO, Order.class);
    }

    public  OrderDTO toDto(Order user) {
        return  mapper.convertValue(user, OrderDTO.class);
    }
}
