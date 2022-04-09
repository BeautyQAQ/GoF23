package com.design.pattern.factory.method.github;

/**
 * 开发人员面试
 */
public class Developer implements Interviewer {

    @Override
    public void askQuestions() {
        System.out.println("Asking about design patterns!");        
    }
    
}
