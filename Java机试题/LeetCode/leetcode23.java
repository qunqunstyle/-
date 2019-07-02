package LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class leetcode23 {
    class Solution {
        //divide and conquer
        //time: o(nlogk) n:the number of nodes of k lists
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists == null || lists.length == 0) return null;
            return helper(lists, 0, lists.length - 1);
        }
        public ListNode helper(ListNode[] lists, int start, int end){
            if(start == end){
                return lists[start];
            }
            int mid = (end - start) / 2 + start;
            ListNode left = helper(lists, start, mid);
            ListNode right = helper(lists, mid + 1, end);
            return mergeTwoLists(left, right);
        }
        public ListNode mergeTwoLists(ListNode left, ListNode right){
            ListNode dummy = new ListNode(-1);
            ListNode tail = dummy;
            while(left != null && right != null){
                if(left.val <= right.val){
                    tail.next = new ListNode(left.val);
                    left = left.next;
                    tail = tail.next;
                }else{
                    tail.next = new ListNode(right.val);
                    right = right.next;
                    tail = tail.next;
                }
            }
            if(left != null){
                tail.next = left;
            }
            if(right != null){
                tail.next = right;
            }
            return dummy.next;
        }
    }

    /*//PriorityQueue time:o(nlogk) space:o(k) n: number of all nodes, k: lists.length
    //Analysis: size of PriorityQueue is k. each node will be added into pq. One add operation takes o(logk). Thus, time complexity is o(logk * n)
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode A, ListNode B){
                return A.val - B.val;
            }
        });
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for(ListNode list : lists){
            if(list != null){
                pq.add(list);
            }
        }
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            tail.next = temp;
            tail = tail.next;
            if(temp.next != null){
                pq.add(temp.next);
            }
        }
        return dummy.next;
    }

    //iteratively
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        List<ListNode> temp = new ArrayList<>();
        for(ListNode list : lists){
            temp.add(list);
        }
        while(temp.size() > 1){
            List<ListNode> new_lists = new ArrayList<>();
            for(int i = 0; i < temp.size() - 1; i += 2){
                new_lists.add(mergeTwoLists(temp.get(i), temp.get(i + 1)));
            }
            if(temp.size() % 2 == 1){
                new_lists.add(temp.get(temp.size() - 1));
            }
            temp = new_lists;
        }
        return temp.get(0);
    }
    public ListNode mergeTwoLists(ListNode left, ListNode right){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(left != null && right != null){
            if(left.val <= right.val){
                tail.next = new ListNode(left.val);
                left = left.next;
                tail = tail.next;
            }else{
                tail.next = new ListNode(right.val);
                right = right.next;
                tail = tail.next;
            }
        }
        if(left != null){
            tail.next = left;
        }
        if(right != null){
            tail.next = right;
        }
        return dummy.next;
    }*/

}
