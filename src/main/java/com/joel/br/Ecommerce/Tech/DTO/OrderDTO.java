package com.joel.br.Ecommerce.Tech.DTO;

import com.joel.br.Ecommerce.Tech.model.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus status;
    private UserDTO userDTO;

}
