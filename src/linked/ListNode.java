package linked;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void list2Linked(int arr[]) {

        if (arr.length == 0) {
            return;
        }

        this.val = arr[0];

        ListNode curr = this;
        for (int x = 1; x < arr.length; x++) {


            ListNode next = new ListNode(arr[x]);

            curr.next = next;

            curr = curr.next;

        }
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        ListNode curr = this;
        while (curr != null) {
            stringBuffer.append(curr.val + "->");
            curr = curr.next;
        }
        stringBuffer.append("NULL");
        return stringBuffer.toString();
    }
}
