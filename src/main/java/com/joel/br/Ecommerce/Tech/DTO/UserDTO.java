package com.joel.br.Ecommerce.Tech.DTO;

import com.joel.br.Ecommerce.Tech.model.enums.Roles;

import java.time.LocalDateTime;
import java.util.List;

public record UserDTO (String name, String email, String password, String phone, LocalDateTime birthDate, Roles roles, List<OrderDTO> orders) {
}
