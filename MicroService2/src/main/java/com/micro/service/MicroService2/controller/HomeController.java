package com.micro.service.MicroService2.controller;

import com.micro.service.MicroService2.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "home")
@RestController
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    TestService testService;

    @RequestMapping(value = "home", method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> getHomeResponse(){
        log.info("---------------Greeting from microservice 2---------------------------");
        List<String> greet = new ArrayList<String>();
        greet.add(testService.testHystrix());
        return greet;
    }
}
