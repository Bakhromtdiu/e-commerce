package uz.pdp.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restservice.model.GatewayMerchantEntity;

public interface GatewayMerchantRepository extends JpaRepository<GatewayMerchantEntity, Long> {
}
