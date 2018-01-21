package com.timin.controller;

import com.timin.entity.AddTask;
import com.timin.service.task.update.TaskUpdateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by naoya on 2017/10/29.
 */
@RestController()
@RequestMapping("/task")
public class TaskController {

    private static final Logger logger = LogManager.getLogger(TaskController.class);

    @Autowired
    TaskUpdateService taskUpdateService;

    @RequestMapping("/add")
    public AddTask index(@RequestParam("name")String name) {
        taskUpdateService.add(name);
        AddTask task = AddTask.builder().taskId(1).inTime(LocalDateTime.now()).name(name).build();
        return task;
    }

}
