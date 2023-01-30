package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service;

import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.GatewayMerchantEntity;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.receive.GatewayMerchantReceiveDto;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.response.ApiResponse;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatewayMerchantService implements BaseService<GatewayMerchantReceiveDto, List<GatewayMerchantEntity>, GatewayMerchantEntity> {
    @Override
    public ApiResponse<Object> add(GatewayMerchantReceiveDto gatewayMerchantReceiveDto) {
        return null;
    }

    @Override
    public ApiResponse<List<GatewayMerchantEntity>> getList() {
        return null;
    }

    @Override
    public GatewayMerchantEntity getById(long id) {
        return null;
    }

    @Override
    public ApiResponse<Object> delete(long id) {
        return null;
    }
}
