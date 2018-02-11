package com.timin.service.task.refer;


import com.timin.domain.task.Task;
import com.timin.mapper.TaskMapper;
import com.timin.repository.task.read.TaskRepository;
import com.timin.repository.task.read.TaskWorkTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskReferServiceImpl implements TaskReferService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskWorkTimeRepository workTimeRepository;
    @Autowired
    private TaskMapper taskMapper;


    /**
     * ({@inheritDoc})
     *
     * @return
     */
    @Override
    public Task initDisplay() {
        LocalDateTime now = LocalDateTime.now();
        List<com.timin.entity.Task> taskList = taskRepository.selectAll(now);

        taskList.stream().map(task -> taskMapper.convert(task, workTimeRepository.selectByTaskId(task.getId())));
        return null;
    }
}
