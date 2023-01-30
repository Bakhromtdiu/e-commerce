package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service;

import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.AgentEntity;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.receive.AgentReceiveDto;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.response.ApiResponse;
import org.springframework.stereotype.Service;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service.base.BaseService;

import java.util.List;

@Service
public class AgentService implements BaseService<AgentReceiveDto, List<AgentEntity>,AgentEntity> {
    @Override
    public ApiResponse<Object> add(AgentReceiveDto agentReceiveDto) {
        return null;
    }

    @Override
    public ApiResponse<List<AgentEntity>> getList() {
        return null;
    }

    @Override
    public AgentEntity getById(long id) {
        return null;
    }

    @Override
    public ApiResponse<Object> delete(long id) {
        return null;
    }
}
