package com.micro.service.MicroService2.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "home")
@RestController
public class HomeController {

    @RequestMapping(value = "home", method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> getHomeResponse(){
        System.out.println("---------------Greeting from microservice 2---------------------------");
        List<String> greet = new ArrayList<String>();
        greet.add("Hello Home from Microservice 2 !!!");
        return greet;
    }
}
