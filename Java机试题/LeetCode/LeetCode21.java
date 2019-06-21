package LeetCode;

/**
 * Definition for singly-linked list.
 */


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode list = new ListNode(0);
        ListNode listNode = list;
        while (l1 != null && l2 != null) {

            if (l1.val > l2.val) {
                list.val = l2.val;
                l2 = l2.next;
            } else {
                list.val = l1.val;
                l1 = l1.next;
            }
            if (l1 != null && l2 != null) {
                list.next = new ListNode(0);
                list = list.next;
            }
        }

        if (l1 == null)
            list.next = l2;
        else
            list.next = l1;
        return listNode;
    }

}
