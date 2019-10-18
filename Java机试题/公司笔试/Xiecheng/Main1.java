package Xiecheng;

/*链表排序
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        给定一个单向链表和一个整数m，将链表中小于等于m的节点移到大于m的节点之前，要求两部分中的节点各自保持原有的先后顺序

        输入
        输入数据包含两行，

        第一行，整数m

        第二行，空格分隔的整数序列

        输出
        逗号分隔的整数序列


        样例输入
        4
        9 6 3 7 6 5
        样例输出
        3,9,6,7,6,5*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        ListNode out = new ListNode(100);
        ListNode out1 = out;
        ListNode p = head;
        while(p.next.next != null){
            if(p.next.val<=m){
                ListNode temp = p.next;
                p.next = p.next.next;
                out.next = temp;
                out = out.next;
            }
        }
        out.next =head;
        /*p = head;
        while(p.next != null){
            if(p.val>m){
                ListNode temp = new ListNode(p.val);
                out.next = temp;
                out = out.next;
            }
        }*/

        return  out1.next;


    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNext()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}

