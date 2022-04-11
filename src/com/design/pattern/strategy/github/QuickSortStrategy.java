package com.design.pattern.strategy.github;

import java.util.List;

public class QuickSortStrategy implements SortStrategy {

    @Override
    public List<Integer> sort(List<Integer> t) {
        System.out.println("使用快速排序");
        return t;
    }
    
}
