package com.joel.br.Ecommerce.Tech.exceptions;

public class UserAlreadyExists extends  RuntimeException{


    public UserAlreadyExists(String message) {
        super(message);
    }
}
