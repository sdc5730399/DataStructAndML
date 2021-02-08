package vicky.DS.Sort;
/*
      sdc  ≤Â÷µ≈≈–Ú
 */
public class InsertionSort {

    public  InsertionSort(int[] array) {
        int current;
        for(int i=0; i<array.length-1;i++)
        {
            current = array[i+1];
            int preIndex = i;
            while(preIndex >=0 && current < array[preIndex]){
                array[preIndex+1] = array[preIndex];
                preIndex --;
            }
            array[preIndex+1] = current;
        }
     }
        public static void main(String [] args){
            int array[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
               new InsertionSort(array);
            for(int i=0; i< array.length;i++){
                System.out.println(array[i]);
            }
        }
   }

