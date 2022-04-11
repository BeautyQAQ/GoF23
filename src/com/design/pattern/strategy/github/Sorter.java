package com.design.pattern.strategy.github;

import java.util.List;

/**
 * 决定使用什么策略
 */
public class Sorter {
    private SortStrategy sorter;

    public Sorter(SortStrategy sorter){
        this.sorter = sorter;
    }

    public List<Integer> sort(List<Integer> list){
        return this.sorter.sort(list);
    }
}
