package com.design.pattern.strategy.github;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] i = {1, 5, 4, 3, 2, 8};
        List<Integer> list = Arrays.asList(i);

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(list);

        Sorter sorter2 = new Sorter(new QuickSortStrategy());
        sorter2.sort(list);
    }
}
