package com.sample.root.repo;

import com.sample.root.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("iTestDao")
public interface ITestDao extends JpaRepository<Test, Long> {

    @Query(value = "select t from Test t")
    public List<Test> getTestData();
}
