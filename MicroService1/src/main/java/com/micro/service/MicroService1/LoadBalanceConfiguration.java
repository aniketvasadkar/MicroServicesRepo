package com.micro.service.MicroService1;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadBalanceConfiguration {

    @Bean @LoadBalanced
    public RestTemplate getLoadBalancedRestTemplate(){
        return new RestTemplate();
    }
}
