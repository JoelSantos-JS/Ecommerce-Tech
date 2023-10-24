package com.joel.br.Ecommerce.Tech.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.joel.br.Ecommerce.Tech.model.enums.Roles;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @NotNull
    private String name;
    @NotEmpty
    @NotNull
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Roles roles;

    private String phone;
    private LocalDateTime birthDate;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Order> orders = new ArrayList<>();

}
