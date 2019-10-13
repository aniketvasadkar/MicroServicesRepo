package com.sample.root.service;

import com.sample.root.model.Test;
import com.sample.root.repo.ITestDao;
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
