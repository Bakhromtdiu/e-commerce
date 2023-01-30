package com.example.ecommerce.rest_service.main.java.uz.pdp.restservice.model.admin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgentMerchantReceiveDto {
    private String name;
    @JsonProperty("min_sum")
    private double minSum;
    @JsonProperty("max_sum")
    private double maxSum;
    private double commission;
}
