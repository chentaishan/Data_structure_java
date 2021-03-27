package array;

import org.junit.Test;

public class TestMain {


    @Test
    public void testSort() {

        int[] arr = { 4, 3, 5, 1,6324,2,6, 7,90};


//        int[] result = SortUtils.bubbleSort(arr);
//        int[] result = SortUtils.seletionSort(arr);
        int[] result = SortUtils.quickSort(0,arr.length-1,arr);

        for (int item : result) {

            System.out.print("=" + item);
        }


    }


}
