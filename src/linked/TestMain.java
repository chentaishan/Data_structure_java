package linked;

import org.junit.Test;

public class TestMain {


    @Test
    public void testLinked() {


        int nums[] = {1, 2, 3, 4, 5, 6, 7};

        final ListNode listNode = new ListNode(-1);
        listNode.list2Linked(nums);
        System.out.println(listNode.toString());


//        final ListNode node = LinkedUtils.deleteNode(listNode, 7);
//        System.out.println(node.toString());


//        System.out.println( LinkedUtils.reverseListNode(listNode));
        final int[] ints = LinkedUtils.printByendTobegin(listNode);
        for (int item : ints ) {

            System.out.println("printByendTobegin--" + item);
        }


    }
}
