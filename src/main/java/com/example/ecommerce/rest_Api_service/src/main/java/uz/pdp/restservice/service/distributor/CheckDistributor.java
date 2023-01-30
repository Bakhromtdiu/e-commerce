package com.example.ecommerce.rest_Api_service.src.main.java.uz.pdp.restservice.service.distributor;

import com.example.ecommerce.rest_Api_service.src.main.java.uz.pdp.restservice.model.receive.DefaultCheckReceiveDto;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.GatewayEntity;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.GatewayMerchantEntity;
import org.springframework.stereotype.Service;

import uz.pdp.restservice.model.MerchantEntity;
import uz.pdp.restservice.model.response.BaseCheckAgentResponse;
import uz.pdp.restservice.repository.GatewayMerchantRepository;
import uz.pdp.restservice.repository.GatewayRepository;
import uz.pdp.restservice.repository.MerchantRepository;
import uz.pdp.restservice.repository.TransactionRepository;

import java.math.BigDecimal;

@Service
public class CheckDistributor {

    private final MerchantRepository merchantRepository;
    private final TransactionRepository transactionRepository;
    private final GatewayMerchantRepository gatewayMerchantRepository;
    private final GatewayRepository gatewayRepository;

    public CheckDistributor(MerchantRepository merchantRepository, TransactionRepository transactionRepository, GatewayMerchantRepository gatewayMerchantRepository, GatewayRepository gatewayRepository) {
        this.merchantRepository = merchantRepository;
        this.transactionRepository = transactionRepository;
        this.gatewayMerchantRepository = gatewayMerchantRepository;
        this.gatewayRepository = gatewayRepository;
    }

    public BaseCheckAgentResponse check(
            uz.pdp.restservice.model.AgentEntity agentEntity,
            DefaultCheckReceiveDto defaultCheckReceiveDto
    ){
        uz.pdp.restservice.model.TransactionError transactionError = null;
        MerchantEntity merchantEntity = null;
        GatewayMerchantEntity gatewayMerchantEntity = null;
        uz.pdp.restservice.model.AgentMerchantEntity agentMerchantEntity = null;
        GatewayEntity gatewayEntity = null;
        uz.pdp.restservice.model.TransactionEntity transactionEntity = null;


        if (!defaultCheckReceiveDto.isFull()){
            transactionError = uz.pdp.restservice.model.TransactionError.PARAMETERS_INVALID;
        }

        if (transactionError == null) {
            merchantEntity = merchantRepository.getReferenceById(defaultCheckReceiveDto.getMerchantId());

            transactionEntity = new uz.pdp.restservice.model.TransactionEntity(uz.pdp.restservice.model.TransactionState.CREATED);
            transactionEntity.setTransactionAmount(defaultCheckReceiveDto.getAmount());
          //  transactionEntity.setMerchantEntity(merchantEntity);
            transactionRepository.save(transactionEntity);

            if (merchantEntity == null) {
                transactionError = uz.pdp.restservice.model.TransactionError.MERCHANT_NOT_FOUND;
            }

            if (transactionError == null) {
//                gatewayMerchantEntity = merchantEntity.getGatewayMerchantEntity();
//                agentMerchantEntity = merchantEntity.getAgentMerchantEntity();
                gatewayEntity = gatewayMerchantEntity.getGatewayEntity();

                if (defaultCheckReceiveDto.getAmount().compareTo(BigDecimal.valueOf(agentMerchantEntity.getMaxAmount())) > 0) {
                    transactionError = uz.pdp.restservice.model.TransactionError.MAX_AMOUNT;
                }

                if (defaultCheckReceiveDto.getAmount().compareTo(BigDecimal.valueOf(agentMerchantEntity.getMinAmount())) < 0) {
                    transactionError = uz.pdp.restservice.model.TransactionError.MIN_AMOUNT;
                }
//
//                if (/*gatewayEntity.isPaynet()*/true){
//                    if (getRandomNumber() < 5){
//                        transactionEntity.setState(uz.pdp.restservice.model.TransactionState.CHECK_ERROR);
//                    }else {
//                        transactionEntity.setState(uz.pdp.restservice.model.TransactionState.CHECKED);
//                    }
//                }
//
//                if (gatewayEntity.isPayme()){
//                    if (getRandomNumber() < 5){
//                        transactionEntity.setState(TransactionState.CHECK_ERROR);
//                    }else {
//                        transactionEntity.setState(TransactionState.CHECKED);
//                    }
//                }
            }
        }

        return null;
    }

    private int getRandomNumber(){
        return (int)(Math.random() * 10);
    }
}
