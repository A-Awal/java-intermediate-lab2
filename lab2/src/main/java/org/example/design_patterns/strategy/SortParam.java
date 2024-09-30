package org.example.design_patterns.strategy;

public class SortParam<T> implements Cloneable {
    private T[] arr;
    public SortParam(T[] tosort){
        arr = tosort;
    }

    public T[] getArr() {
        return arr;
    }



}
