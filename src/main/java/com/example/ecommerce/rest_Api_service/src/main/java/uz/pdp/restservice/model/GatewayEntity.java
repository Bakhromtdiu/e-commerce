package uz.pdp.restservice.model;

import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.GatewayMerchantEntity;
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
public class GatewayEntity extends uz.pdp.restservice.model.BaseModelEntity {

    @OneToMany(mappedBy = "gatewayEntity")
    private List<GatewayMerchantEntity> gatewayMerchantEntities;

    public boolean isPaynet(){
        return getId() == 10;
    }

    public boolean isPayme(){
        return getId() == 20;
    }

}
