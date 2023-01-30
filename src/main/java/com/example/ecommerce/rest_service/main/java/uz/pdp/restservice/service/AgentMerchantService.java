package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service;

import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.AgentMerchantEntity;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.receive.AgentMerchantReceiveDto;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.response.ApiResponse;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentMerchantService implements BaseService<AgentMerchantReceiveDto, List<AgentMerchantEntity>,AgentMerchantEntity> {

    @Override
    public ApiResponse<Object> add(AgentMerchantReceiveDto agentMerchantReceiveDto) {
        return null;
    }

    @Override
    public ApiResponse<List<AgentMerchantEntity>> getList() {
        return null;
    }

    @Override
    public AgentMerchantEntity getById(long id) {
        return null;
    }

    @Override
    public ApiResponse<Object> delete(long id) {
        return null;
    }
}
