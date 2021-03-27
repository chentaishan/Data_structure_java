package array;

/**
 * 各种排序算法
 * 冒泡
 * 快速
 * 选择
 */
public class SortUtils {


    /**
     * 冒泡：相邻两位对比，一个循环下来处理最值
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;

    }

    /**
     * 选择排序：从第一位开始依次和其他位置比较，每循环依次得到最值。
     *
     * @param arr
     * @return
     */
    public static int[] seletionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;

    }


    int left = 0;
    int right = 0;

    /**
     * 快速排序：选择一个基点，一般为第一位
     *  小于这个基点，放到左边，大于这个基点，放到右边。
     * @param arr
     * @return   https://blog.csdn.net/chentaishan/article/details/103408667
     */
    public static int[] quickSort(int left,int right,int[] arr) {

        int i,j;
        if (left>right){
            return new int[0];
        }
        i= left;
        j= right;

        int provit = arr[left];

        while (i!=j) {

            while (arr[j]>=provit&&i<j){ //大于这个基点，下标往左移
                j--;
            }
            while (arr[i]<=provit&&i<j){ //小于这个基点，下标往右移
                i++;
            }

            int t;
            if (i<j){ // 互换两边的数据，小的移到左边，大的移到右边
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }


        }

        // 当左右对比一次完成，这时候i=j 相等，找到整个数组的中值
        //其实目的是把第一次的基点，放到排序后的位置
        arr[left] = arr[i];
        arr[i] = provit;

        // 整个数组被基点分成两半，这两半继续按照上述的逻辑去排序，直到排序完成。
        quickSort(left,i-1,arr);
        quickSort(i+1,right,arr);


        return arr;
    }
}
