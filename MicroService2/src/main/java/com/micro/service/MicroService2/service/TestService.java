package com.micro.service.MicroService2.service;

import
        com.micro.service.MicroService2.model.Test;
import com.micro.service.MicroService2.repo.ITestDao;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestService {

    @Autowired
    ITestDao iTestDao;

    public List<Test> getTestData() {
        return iTestDao.getTestData();
    }

    public Long saveTestData(Test test) {
        return iTestDao.saveAndFlush(test).getTestAttr1();
    }

    @HystrixCommand(fallbackMethod = "testHystrixFallback")
    public String testHystrix(){
        //System.out.println(1/0);
        return "Hello Home from Microservice 2 service response!!!";
    }

    public String testHystrixFallback(){
        return "Hello Home from Microservice 2 service hystrix response!!!";
    }
}
