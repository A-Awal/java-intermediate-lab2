package org.example.design_patterns.strategy;

import java.util.List;
import java.util.function.Consumer;

public class Sorter {
    public <T> T[] sort(SortParam<T > sortParam,  Consumer<? super SortParam<T>> sortStrategy) {
        sortStrategy.accept(sortParam);
        return sortParam.getArr();
    }
}
