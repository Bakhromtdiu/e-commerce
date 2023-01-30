package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.service.base;

import com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.response.ApiResponse;

public interface BaseService<T,R,R1> extends ResponseMessage{

    ApiResponse<Object> add(T t);
    ApiResponse<R> getList();
    R1 getById(long id);
    ApiResponse<Object> delete(long id);

}
