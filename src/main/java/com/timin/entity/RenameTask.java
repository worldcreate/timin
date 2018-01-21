package com.timin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity(immutable = true)
@Builder
@AllArgsConstructor
@Getter
public class RenameTask {

    @Id
    private final Integer taskId;

    private final LocalDateTime inTime;

}
