package com.joel.br.Ecommerce.Tech.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joel.br.Ecommerce.Tech.DTO.UserDTO;
import com.joel.br.Ecommerce.Tech.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserMapper {

    private  final ObjectMapper mapper;



    public User toEntity(UserDTO user) {
    return  mapper.convertValue(user, User.class);
    }

    public  UserDTO toDto(User user) {
        return  mapper.convertValue(user, UserDTO.class);
    }
}
