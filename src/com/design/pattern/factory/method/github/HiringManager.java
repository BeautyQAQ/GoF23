package com.design.pattern.factory.method.github;

/**
 * 招聘经理
 */
public abstract class HiringManager {

    protected abstract Interviewer makeInterviewer();

    void takeInterview(){
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }
}
