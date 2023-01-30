package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "db.merchant")
public class MerchantEntity extends BaseModelEntity {

    @OneToOne
    private GatewayMerchantEntity gatewayMerchantEntity;

    @OneToOne
    private AgentMerchantEntity agentMerchantEntity;



}
