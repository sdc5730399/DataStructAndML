package vicky.Test;

import vicky.DS.Sort.HeapSort;

public class InsertionTest {
    public static void main(String[] args) {
        int array[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        //new InsertionSort(array);
        new HeapSort(array);
        for(int i=0; i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
