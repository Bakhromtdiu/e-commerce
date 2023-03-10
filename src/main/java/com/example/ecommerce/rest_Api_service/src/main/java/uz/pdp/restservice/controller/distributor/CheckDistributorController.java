package com.example.ecommerce.rest_Api_service.src.main.java.uz.pdp.restservice.controller.distributor;

import com.example.ecommerce.rest_Api_service.src.main.java.uz.pdp.restservice.model.receive.BaseCheckReceiveDto;
import com.example.ecommerce.rest_Api_service.src.main.java.uz.pdp.restservice.model.receive.DefaultCheckReceiveDto;
import com.example.ecommerce.rest_Api_service.src.main.java.uz.pdp.restservice.service.distributor.CheckDistributor;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.restservice.model.AgentEntity;

import uz.pdp.restservice.model.response.BaseCheckAgentResponse;
import uz.pdp.restservice.repository.AgentRepository;




@RestController
@RequestMapping("/api/transaction")
public class CheckDistributorController{

    private final AgentRepository agentRepository;
    private final CheckDistributor checkDistributor;

    public CheckDistributorController(AgentRepository agentRepository, CheckDistributor checkDistributor) {
        this.agentRepository = agentRepository;
        this.checkDistributor = checkDistributor;
    }

    @PostMapping("/check")
    public BaseCheckAgentResponse check(
            @RequestBody BaseCheckReceiveDto baseCheckReceiveDto,
            HttpServletRequest httpServletRequest
    ) {

        DefaultCheckReceiveDto checkReceiveDto = baseCheckReceiveDto.checkReceiveDto();
        AgentEntity agent = getAgent(httpServletRequest);
        //checkDistributor.check(agent,checkReceiveDto);
        return null;
    }

    private AgentEntity getAgent(HttpServletRequest httpServletRequest){
        String secretKey = httpServletRequest.getHeader("secret_key");
        return agentRepository.findBySecretKey(secretKey);
    }

}
