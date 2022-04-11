package com.design.pattern.strategy.github;

import java.util.List;

/**
 * 排序策略
 */
public interface SortStrategy {
    public List<Integer> sort(List<Integer> t);
}
