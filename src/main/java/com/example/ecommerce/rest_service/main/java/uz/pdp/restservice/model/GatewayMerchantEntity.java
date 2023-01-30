package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@Entity
@Table(name = "db.gateway_merchant")
public class GatewayMerchantEntity extends BaseModelEntity {

    @ManyToOne
    private GatewayEntity gatewayEntity;
}
