package com.joel.br.Ecommerce.Tech.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table
public class Payment {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    private Order order;
    @Column(name = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
}
