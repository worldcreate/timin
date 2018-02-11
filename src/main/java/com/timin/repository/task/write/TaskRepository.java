package com.timin.repository.task.write;

import com.timin.entity.Task;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

@Dao
@ConfigAutowireable
@Repository
public interface TaskRepository {
    @Insert
    Result<Task> insert(Task entity);

    @Update(excludeNull = true)
    Result<Task> update(Task entity);
}
