package array;


public class Test1 {


    public static int[] addOne(int digits[]) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;


    }


    public static int doubleNum(int nums[]) {

        int max = nums[0];

        for (int x : nums
        ) {
            if (max < x) {
                max = x;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i] * 2 && nums[i] != max) {
                return -1;
            }
        }

        return max;
    }

    /**
     * 数组的中心索引
     *
     * @param arr
     * @return
     */
    public static int middleIndex(int arr[]) {

        int left = 0;
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        for (int y = 0; y < arr.length; y++) {

            if (left == sum - arr[y] - left) {
                return y;
            }

            left += arr[y];

        }


        return -1;
    }

    /**
     * 合并两个排序好的数组
     *
     * @param arr1
     * @param arr2
     * @param n1
     * @param n2
     * @param arr3
     */
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                   int n2, int[] arr3) {
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < n1 && j < n2) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }

    /**
     * 第一个不重复的数据
     *
     * @param arr
     * @param n
     * @return
     */
    static int firstNonRepeating(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == n)
                return arr[i];
        }

        return -1;
    }

    /**
     * 获取数组里第二位的元素
     *
     * @param arr
     */
    static void print2Smallest(int arr[]) {

        int first, second, arr_size = arr.length;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.println(" Invalid Input ");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {

                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                    "smallest element");
        else
            System.out.println("The smallest element is " +
                    first + " and second Smallest" +
                    " element is " + second);
        System.out.print("--" + first);
        System.out.print("--" + second);
    }


    /* Driver program to test above functions */
    public static void main(String[] args) {
//        int arr[] = {12, 13, 1, 10, 34, 1};
//        print2Smallest(arr);

//
//        int arr[] = { 9, 4, 9, 6, 7, 4 };
//        int n = arr.length;
//
//        System.out.print(firstNonRepeating(arr, n));


//        int[] arr1 = {1, 3, 5, 7};
//        int n1 = arr1.length;
//
//        int[] arr2 = {2, 4, 6, 8};
//        int n2 = arr2.length;
//
//        int[] arr3 = new int[n1 + n2];
//
//        mergeArrays(arr1, arr2, n1, n2, arr3);

//
//        int[] nums = {1, 7, 3, 6, 5, 6};
//
//        System.out.print(middleIndex(nums) + "----");

        int[] nums = {1, 2, 3, 9};

        addOne(nums);

    }

    public void sortArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

        }


    }
}
