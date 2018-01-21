package com.timin.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;
import org.springframework.stereotype.Repository;

import com.timin.entity.ActiveIn;

@Dao
@ConfigAutowireable
@Repository
public interface TaskMoveRepository {
    @Insert
    Result<ActiveIn> active(ActiveIn entity);

}
