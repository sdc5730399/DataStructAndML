package vicky.DS.Sort;
/*
*     sdc ¶ÑÅÅĞò
* */

public class HeapSort {
    public   HeapSort(int[] array) {
        int n = array.length;
        for (int k = n / 2; k >= 1; --k) {
            sink(array, k, n);
        }
        while (n > 1) {
            exch(array, 1, n--);
            sink(array, 1, n);
        }
    }

    public static void exch(int array[], int i, int j){
        int swap = array[i - 1];
        array[i - 1] = array[j - 1];
        array[j - 1] = swap;
    }

   public static void sink(int array[], int k, int n){
       while (2 * k <= n) {
           int j = 2 * k;
           if (j < n && less(array, j, j + 1)) ++j;
           if (!less(array, k, j)) break;
           exch(array, k, j);
           k = j;
           continue;
        }
    }

    public static boolean less(int array[], int i, int j){
        if (array[i-1] < array[j-1])
            return true;
        else
            return false;
    }

   /* public static void main(String [] args){
        int array[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
         new HeapSort(array);
         for(int i=0; i< array.length;i++){
            System.out.println(array[i]);
         }
    }*/
}
