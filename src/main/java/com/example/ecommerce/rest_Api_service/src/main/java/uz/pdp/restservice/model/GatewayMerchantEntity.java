package com.example.ecommerce.rest_Api_service.src.main.java.uz.pdp.restservice.model;

import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.GatewayEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "db.gateway_merchant")
public class GatewayMerchantEntity extends uz.pdp.restservice.model.BaseModelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private GatewayEntity gatewayEntity;
}
