package com.design.pattern.composite.github;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("张三", 12000f);
        Designer designer = new Designer("李四", 15000f);
        Organization organization = new Organization();
        organization.addEmployee(developer);
        organization.addEmployee(designer);
        System.out.println("Net salaries: " + organization.getNetSalaries());
    }
}
