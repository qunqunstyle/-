package LeetCode;

public class LeetCode_02 {
	// 代码是官方的代码，我的思路也差不多，实现不如人家的好看，就没有贴自己的代码，直接给代码加上注释

	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */
	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode dummyHead = new ListNode(0);// dummyHead保存result的链表头
			ListNode p = l1, q = l2, curr = dummyHead;
			int carry = 0;
			while (p != null || q != null) {
				int x = (p != null) ? p.val : 0;// 若不为null则取出值计算，为空则补0计算
				int y = (q != null) ? q.val : 0;// 同上
				int sum = carry + x + y;// 加上进位计算
				carry = sum / 10;// 判断是否进位
				curr.next = new ListNode(sum % 10);// 新建节点保存sum取余后的结果，进位后的
				curr = curr.next;// 指针后移
				if (p != null)
					p = p.next;// 若不到链尾则后移
				if (q != null)
					q = q.next;// 同上
			}
			if (carry > 0) {
				curr.next = new ListNode(carry);// 最后一位若有进位则保存1，carry == 1
			}
			return dummyHead.next;// dummyHead保存的是0，从下一个节点开始返回，即为结果。
		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
