//链表倒序
package liulishuo;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Node head = new Node(0,null);
        Node h1 = head;
       int count = 0;
        while (count < 4){
            Node temp = new Node(in.nextInt(),null);
            h1.next = temp;
            h1 = h1.next;
            count ++;
        }
        Node out = new Node(0,null);
        Node out1 = out;
        Stack <Node> stack = new Stack<Node>();
        while (count-->0){
            stack.push(head.next);
            head = head.next;
        }
        int i =0;
        while (! stack.isEmpty()){
            if(i != 0)
                System.out.println(" ");

            System.out.println(stack.peek().val);
            out.next = stack.pop();
            i++;
        }
        out.next = null;
        //out1指向翻转后的链表
    }
}
class  Node {
    int val;
    Node next;
    public Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
}
