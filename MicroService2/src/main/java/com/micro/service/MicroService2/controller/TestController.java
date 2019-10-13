package com.micro.service.MicroService2.controller;

import com.micro.service.MicroService2.model.Test;
import com.micro.service.MicroService2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "test")
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "getData", method = RequestMethod.GET)
    public List<Test> getTestObjects(){

   List<Test> testData = testService.getTestData();

   return testData;
    }

    @RequestMapping(value = "saveData", method = RequestMethod.POST)
    public long saveTestObjects(@RequestBody Test test){

        Long insertCount = testService.saveTestData(test);
        return insertCount;
    }


}
