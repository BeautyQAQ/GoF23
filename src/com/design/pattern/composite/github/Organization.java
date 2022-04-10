package com.design.pattern.composite.github;

import java.util.ArrayList;
import java.util.List;

/**
 * 组织：由不同类型的员工组成
 */
public class Organization {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public float getNetSalaries(){
        float netSalaries = 0f;
        for(Employee employee : this.employees){
            netSalaries += employee.getSalary();
        }
        return netSalaries;
    }
}
