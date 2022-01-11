package com.design.pattern.principle.open_closed_principle;

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    
    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
