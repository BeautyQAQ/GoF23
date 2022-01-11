package com.design.pattern.principle.open_closed_principle;

public class OpenCloseTest {
    public static void main(String[] args) {
        // ICourse iCourse = new JavaCourse(1, "Java架构", 11800D);
        ICourse iCourse = new JavaDiscountCourse(1, "Java架构", 11800D);
        
        System.out.println("课程编号:" + iCourse.getId() + "\n"+
                            "课程名称:" + iCourse.getName() + "\n"+
                            "课程售价:"+((JavaDiscountCourse)iCourse).getDiscountPrice()+"\n"+
                            "课程原价:"+iCourse.getPrice());
    }
}
