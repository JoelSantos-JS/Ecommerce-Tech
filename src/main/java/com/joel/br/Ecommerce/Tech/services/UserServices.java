package com.joel.br.Ecommerce.Tech.services;

import com.joel.br.Ecommerce.Tech.DTO.UserDTO;
import com.joel.br.Ecommerce.Tech.exceptions.UserAlreadyExists;
import com.joel.br.Ecommerce.Tech.mapper.UserMapper;
import com.joel.br.Ecommerce.Tech.model.User;
import com.joel.br.Ecommerce.Tech.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServices {

    private  final UserRepository repository;
    private  final UserMapper mapper;



    public List<User> findAllUsers(){
        return repository.findAll();
    }



    public User  createUser(UserDTO user){
        validateEmail(user.email());
        User userEntity = mapper.toEntity(user);

        return repository.save(userEntity);
    }





















    public  void  validateEmail(String user) {
        boolean exists = repository.existsByEmail(user);
        if (exists) {
            throw new UserAlreadyExists("User Already Exists");
        }

    }
}
