package com.timin.mapper;

import com.timin.domain.task.Task;
import com.timin.entity.WorkTime;

import java.util.List;

public interface TaskMapper {
    Task convert(com.timin.entity.Task task, List<WorkTime> workTimeList);
}
