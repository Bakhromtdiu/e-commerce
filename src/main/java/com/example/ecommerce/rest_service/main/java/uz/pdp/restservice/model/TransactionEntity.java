package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;


import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "db.transaction")
public class TransactionEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private BigDecimal transactionAmount;

    private BigDecimal transactionGatewayAmount;

    @CreationTimestamp
    private Timestamp createdDate;

    @CreationTimestamp
    private Timestamp updatedDate;

}
