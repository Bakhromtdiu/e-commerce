package uz.pdp.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restservice.model.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity,Long> {
}
