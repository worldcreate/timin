package com.timin.service.task.move.update;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timin.entity.ActiveIn;
import com.timin.repository.TaskMoveRepository;

@Service
public class TaskMoveUpdateServiceImpl implements TaskMoveUpdateService {

    @Autowired
    TaskMoveRepository taskMoveRepository;

    /**
     *
     * ({@inheritDoc})
     *
     * @return
     */
    @Override
    public ActiveIn active(Long id) {
        return taskMoveRepository.active(ActiveIn.builder().taskId(id).inTime(LocalDateTime.now()).build()).getEntity();
    }

}
