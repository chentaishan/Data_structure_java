import array.Array;
import priorityQueue.MaxHeap;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        testMaxHeap();
    }

    private static void testMaxHeap() {

        MaxHeap<Integer> integerMaxHeap = new MaxHeap<>();
        for (int i = 0; i < 10000; i++) {
            int ran = new Random().nextInt(200);
            integerMaxHeap.add(ran);
        }


        for (int i = 0; i < integerMaxHeap.getSize(); i++) {

            System.out.println( integerMaxHeap.getMaxandRemove());
        }

    }
}
