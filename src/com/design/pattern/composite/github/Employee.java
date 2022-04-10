package com.design.pattern.composite.github;

import java.util.List;

/**
 * 员工
 */
public interface Employee {
    String getName();

    void setSalary(float salary);

    float getSalary();

    List<String> getRoles();
}
