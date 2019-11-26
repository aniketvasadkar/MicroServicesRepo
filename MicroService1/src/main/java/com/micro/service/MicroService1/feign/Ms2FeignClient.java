package com.micro.service.MicroService1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("MICROSERVICE2MS")
public interface Ms2FeignClient {

    @RequestMapping(value="home/home")
    public List<String> getMs2HomeResponse();
}
