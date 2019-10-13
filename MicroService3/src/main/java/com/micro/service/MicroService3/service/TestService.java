package com.micro.service.MicroService3.service;

import com.micro.service.MicroService3.model.Test;
import com.micro.service.MicroService3.repo.ITestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    ITestDao iTestDao;

    public List<Test> getTestData() {
        return iTestDao.getTestData();
    }

    public Long saveTestData(Test test) {
        return iTestDao.saveAndFlush(test).getTestAttr1();
    }
}
