package com.design.pattern.factory.method.github;

/**
 * 开发人员招聘经理
 */
public class DevelopmentManager extends HiringManager {

    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
