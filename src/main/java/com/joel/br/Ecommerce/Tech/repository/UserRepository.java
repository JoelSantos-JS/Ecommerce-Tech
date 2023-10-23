package com.joel.br.Ecommerce.Tech.repository;

import com.joel.br.Ecommerce.Tech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByEmail(String email);
}
