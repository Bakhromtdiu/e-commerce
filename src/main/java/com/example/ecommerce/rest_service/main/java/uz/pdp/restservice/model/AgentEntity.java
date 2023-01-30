package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "db.agent")
public class AgentEntity extends uz.pdp.restservice.model.BaseModelEntity {

    @Column
    private String secretKey;

    @Column
    @OneToMany(mappedBy = "agentEntity")
    private List<AgentMerchantEntity> agentMerchantEntities;
}
