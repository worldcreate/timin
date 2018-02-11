package com.timin.mapper;

import com.timin.domain.task.Task;
import com.timin.entity.WorkTime;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskMapperImpl implements TaskMapper {


    @Override
    public Task convert(com.timin.entity.Task task, List<WorkTime> workTimeList) {
        // TODO
        return null;
    }
}
