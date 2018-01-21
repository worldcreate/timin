package com.timin.entity;

import java.time.LocalDateTime;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity(immutable = true, naming = NamingType.SNAKE_LOWER_CASE)
@Builder
@AllArgsConstructor
@Getter
public class ActiveIn {

    @Id
    private final Long taskId;

    private final LocalDateTime inTime;

}
