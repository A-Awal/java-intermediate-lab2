package org.example.design_patterns.strategy;

public class SortStrategy {
        public static void bubbleSort(SortParam<Integer> sortParam) {
            var arr = sortParam.getArr();
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                // Last i elements are already sorted
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap the elements if they are in the wrong order
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

    public static void quickSort(QuickSortParam<Integer> sortParam) {
            Integer[] arr = sortParam.getArr();
            int low = sortParam.getLow();
            int high = sortParam.getHigh();
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            sortParam.setHigh(pivotIndex - 1);
            quickSort(sortParam);

            //reset high
            sortParam.setHigh(high);
            sortParam.setLow(pivotIndex + 1);

            quickSort(sortParam);
        }
    }

    private static int partition(Integer[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
