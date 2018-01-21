package com.timin.service.task.move.update;

import com.timin.entity.ActiveIn;

public interface TaskMoveUpdateService {

    /**
     * タスクのアクティブ化
     *
     * @param id
     */
    ActiveIn active(Long id);

}
