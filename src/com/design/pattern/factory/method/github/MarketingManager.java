package com.design.pattern.factory.method.github;

/**
 * 招聘营销经理
 */
public class MarketingManager extends HiringManager {

    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
    
}
