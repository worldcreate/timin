package com.timin.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.timin.entity.Employee;

@Dao
@ConfigAutowireable
public interface SampleDao {
    @Select
    List<Employee> selectAll();
}
