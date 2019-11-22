package com.zhg.javakc.modules.test.entity;

import com.zhg.javakc.base.entity.BaseEntity;

import java.io.Serializable;
import java.util.Date;

public class TestEntity extends BaseEntity<TestEntity> implements Serializable {
    private String testName;
    private String testId;
    private Integer testAge;
    private Date testDate;
    private String testSex;
    public void setTestSex(String testSex) {
        this.testSex = testSex;
    }

    public String getTestSex() {
        return testSex;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public void setTestAge(Integer testAge) {
        this.testAge = testAge;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getTestName() {
        return testName;
    }

    public String getTestId() {
        return testId;
    }

    public Integer getTestAge() {
        return testAge;
    }

    public Date getTestDate() {
        return testDate;
    }
}
