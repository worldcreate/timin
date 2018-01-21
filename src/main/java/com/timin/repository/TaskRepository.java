package com.timin.repository;

import com.timin.entity.AddTask;
import com.timin.entity.DeleteTask;
import com.timin.entity.RenameTask;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

@Dao
@ConfigAutowireable
@Repository
public interface TaskRepository {
    @Insert
    Result<AddTask> add(AddTask entity);

    @Insert
    Result<RenameTask> rename(RenameTask entity);

    @Insert
    Result<DeleteTask> delete(DeleteTask entity);
}
