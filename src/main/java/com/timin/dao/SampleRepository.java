package com.timin.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.timin.entity.Employee;
import org.springframework.stereotype.Repository;

@Dao
@ConfigAutowireable
@Repository
public interface SampleRepository {
    @Select
    List<Employee> selectAll();
}
