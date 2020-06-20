package tenxun;


import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int input[] = new int[k];
        for (int i = 0; i < k; i++)
            input[i] = in.nextInt();
        Node head = new Node(1);
        Node head1 = head;
        for (int i = 2; i <= n; i++) {
            Node temp = new Node(i);
            head.next = temp;
            head = head.next;
        }
        head.next = head1;
        int time = 0;
        while (time < k) {
            for (int i = 0; i < m - 2; i++) {
                head1 = head1.next;
            }
            Node nownext = head1.next.next;
            Node now = head1;
            System.out.println(head1.next.val);
            for (int i = 0; i < input[time]; i++) {
                Node temp = new Node(++n);
                now.next = temp;
                now = now.next;
            }
            now.next = nownext;
            head1 = head1.next;
            time++;
        }
    }

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
