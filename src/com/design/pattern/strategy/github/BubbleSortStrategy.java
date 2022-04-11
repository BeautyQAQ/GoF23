package com.design.pattern.strategy.github;

import java.util.List;

public class BubbleSortStrategy implements SortStrategy {

    @Override
    public List<Integer> sort(List<Integer> t) {
        System.out.println("使用冒泡排序");
        return t;
    }
    
}
