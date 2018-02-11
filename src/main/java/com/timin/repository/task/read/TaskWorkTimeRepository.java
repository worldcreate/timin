package com.timin.repository.task.read;

import com.timin.entity.WorkTime;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

@Dao
@ConfigAutowireable
@Repository
public interface TaskWorkTimeRepository {
    @Select
    List<WorkTime> selectByTaskId(Long taskId);
}
