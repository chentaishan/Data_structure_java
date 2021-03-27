package linked;

/**
 * 实现更多算法
 * 删除链表节点
 * 链表反转
 */
public class LinkedUtils {

    /*
     * 删除链表里某个节点
     * 使用虚拟节点的方法
     */
    public static ListNode deleteNode(ListNode node, int val) {

        if (node == null) {
            return null;
        }
        ListNode dumpNode = new ListNode(-1);
        dumpNode.next = node;


        ListNode pre = dumpNode;
        while (pre.next != null) {

            if (pre.next.val == val) {

                pre.next = pre.next.next;

                break;
            }
            pre = pre.next;


        }

        return dumpNode.next;

    }

    /**
     * 反转 链表
     *
     * @param listNode
     * @return
     */
    static ListNode pre;
    static ListNode temp;

    public static ListNode reverseListNode(ListNode listNode) {

        if (listNode == null) {
            return pre;
        }
        //这两句把链表切成两半
        temp = listNode.next;
        listNode.next = pre; // 反转的关键

        pre = listNode;

        listNode = temp;

        return reverseListNode(listNode);

    }

    /**
     * 从尾到头打印链表
     */


    public static int[] printByendTobegin(ListNode listNode) {
        ListNode head = reverseListNode(listNode);
        if (head==null){
            return new int[0];
        }
        int length = 0;

        ListNode curr = head;
        while (curr != null) {

            curr = curr.next;
            length++;

        }
        int[] size = new int[length];
        length = 0;

        while (head != null) {

            size[length] = head.val;
            length++;
            head = head.next;


        }
        return size;

    }
}
