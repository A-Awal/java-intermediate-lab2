package org.example.design_patterns.strategy;

public class QuickSortParam<T> extends SortParam<T>{
    private int low;
    private int high;

    public QuickSortParam(T[] tosort, int low, int high) {
        super(tosort);
        this.low = low;
        this.high = high;
    }

    public int getHigh() {
        return high;
    }
    public int getLow() {
        return low;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setLow(int low) {
        this.low = low;
    }
}
