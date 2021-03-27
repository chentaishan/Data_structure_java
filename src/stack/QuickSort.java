package stack;



public class QuickSort {
    static int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

    public static void main(String[] ar) {

        quickSort(0, arr.length - 1);

        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println("--" + arr[i1]);

        }

    }


    public static void quickSort(int left, int right) {

        int i, j, t, temp;

        if (left > right) {
            return;
        }

        temp = arr[left];
        i = left;
        j = right;

        while (i != j) {

            while (arr[j] >= temp && i < j) {

                j--;
            }

            // 从左往右找
            while (arr[i] <= temp && i < j) {

                i++;

            }
            // 交换数据
            if (i < j) {

                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }


        }
        arr[left] = arr[i];
        arr[i] = temp;

        quickSort(left, i - 1);
        quickSort(i + 1, right);




    }


}
