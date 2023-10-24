package com.joel.br.Ecommerce.Tech.controller;

import com.joel.br.Ecommerce.Tech.DTO.UserDTO;
import com.joel.br.Ecommerce.Tech.model.User;
import com.joel.br.Ecommerce.Tech.services.UserServices;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/users")
@AllArgsConstructor
public class UserController {

    private  final UserServices userServices;


    @GetMapping
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(userServices.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<User>> findAllUsers(){
        return ResponseEntity.ok().body(userServices.findAllUsers());
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO user){
        return ResponseEntity.ok().body(userServices.createUser(user));
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody UserDTO user){
        return ResponseEntity.ok().body(userServices.updateUser(id, user));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userServices.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
