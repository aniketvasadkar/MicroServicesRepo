package com.micro.service.MicroService1.controller;
import com.micro.service.MicroService1.LoadBalanceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "home")
@RestController
@RibbonClient(name = "ms1Ribbon",configuration = LoadBalanceConfiguration.class)
public class HomeController {

    @Autowired
    RestTemplate template;

    @RequestMapping(value = "home", method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> getHomeResponse(){
        List<String> greet = new ArrayList<String>();
    //    RestTemplate template = new RestTemplate();
       greet =  template.getForObject("http://ms1Ribbon/home/home",List.class);
        return greet;
    }
}
