package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "db.gateway")
public class GatewayEntity extends BaseModelEntity {

    @OneToMany(mappedBy = "gatewayEntity")
    private List<GatewayMerchantEntity> gatewayMerchantEntities;


}
