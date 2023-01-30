package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;


import java.sql.Timestamp;


@MappedSuperclass
@Getter
@Setter
public abstract class BaseModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;

    private boolean isInActive;

    @CreationTimestamp
    private Timestamp createdDate;

    @CreationTimestamp
    private Timestamp updatedDate;


    public BaseModelEntity(long id) {
        this.id = id;
    }

    public BaseModelEntity() {
    }
}
