package com.sample.root.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {

    @Id
    @Column(name="TEST_ATTR_1")
    private Long testAttr1;

    @Column(name="TEST_ATTR_2")
    private String testAttr2;

    @Column(name="TEST_ATTR_3")
    private String testAttr3;

    public Long getTestAttr1() {
        return testAttr1;
    }

    public void setTestAttr1(Long testAttr1) {
        this.testAttr1 = testAttr1;
    }

    public String getTestAttr2() {
        return testAttr2;
    }

    public void setTestAttr2(String testAttr2) {
        this.testAttr2 = testAttr2;
    }

    public String getTestAttr3() {
        return testAttr3;
    }

    public void setTestAttr3(String testAttr3) {
        this.testAttr3 = testAttr3;
    }
}