package com.timin.service.task.update;

import com.timin.entity.AddTask;
import com.timin.repository.TaskRepository;
import org.seasar.doma.jdbc.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskUpdateServiceImpl implements TaskUpdateService {
    @Autowired
    TaskRepository taskRepository;


    /**
     * {@inheritDoc}
     */
    @Override
    public int add(String name) {
        AddTask task = AddTask.builder().name(name).inTime(LocalDateTime.now()).build();
        Result<AddTask> result = taskRepository.add(task);
        return result.getCount();
    }
}
