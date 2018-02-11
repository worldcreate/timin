package com.timin.repository.task.read;

import com.timin.entity.Task;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Dao
@ConfigAutowireable
@Repository
public interface TaskRepository {
    @Select
    List<Task> selectAll(LocalDateTime now);
}
