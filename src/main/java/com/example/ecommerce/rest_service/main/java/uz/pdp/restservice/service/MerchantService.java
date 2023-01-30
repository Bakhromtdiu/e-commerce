package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service;

import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.MerchantEntity;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.receive.MerchantReceiveDto;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.response.ApiResponse;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service.base.BaseService;
import org.springframework.stereotype.Service;
import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.repository.MerchantRepository;

import java.util.List;

@Service
public class MerchantService implements BaseService<MerchantReceiveDto, List<MerchantEntity>,MerchantEntity> {

    private final MerchantRepository merchantRepository;
    private final ModelMapper modelMapper;

    public MerchantService(MerchantRepository merchantRepository, ModelMapper modelMapper) {
        this.merchantRepository = merchantRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ApiResponse<Object> add(MerchantReceiveDto merchantReceiveDto) {
//        MerchantEntity merchantEntity = modelMapper.map(merchantReceiveDto, MerchantEntity.class);
//        merchantRepository.save(merchantEntity);
        return new ApiResponse<>(0,SUCCESS);
    }

    @Override
    public ApiResponse<List<MerchantEntity>> getList() {
        return new ApiResponse<>(0,SUCCESS,merchantRepository.findAll());
    }

    @Override
    public MerchantEntity getById(long id) {
        return merchantRepository.getReferenceById(id);
    }


    @Override
    public ApiResponse<Object> delete(long id) {
        MerchantEntity merchantEntity = merchantRepository.getReferenceById(id);
        merchantEntity.setInActive(true);
        merchantRepository.save(merchantEntity);
        return new ApiResponse<>(0,SUCCESS);
    }
}
