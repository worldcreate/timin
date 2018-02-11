package com.timin.entity.embeddable;

import com.timin.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.seasar.doma.Embeddable;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

@Embeddable
@AllArgsConstructor
@Getter
public class TaskName {
    private final String name;
}
