package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "db.agent_merchant_entity")
public class AgentMerchantEntity extends BaseModelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private AgentEntity agentEntity;

    @ManyToOne
    private MerchantEntity merchantEntity;

    @Column
    private double minAmount;

    @Column
    private double maxAmount;

}
