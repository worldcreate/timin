package com.timin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity(immutable = true)
@Builder
@AllArgsConstructor
@Getter
public class Employee {

    @Id
    private final Integer id;

    private final String name;

    private final Integer age;
}
