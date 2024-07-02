package com.sefo.keycloak.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "test")
@Data
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String test;
}
