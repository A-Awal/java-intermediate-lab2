package org.example.design_patterns.strategy;

import java.lang.reflect.Constructor;

public class Application {
    public static void main(String[] args){

        Sorter sorter = new Sorter();
        QuickSortParam<Integer> sortParam = new QuickSortParam<>(new Integer[]{2, 4, 1}, 0, 3);
//        sorter.sort(sortParam, SortStrategy::quickSort);
    }
}
