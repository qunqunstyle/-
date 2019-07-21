package Offer;

import java.util.Stack;

public class offer31 {
    public static void main(String []args){
        int [] pushA = {1};
        int [] popA = {2};
        System.out.println(IsPopOrder(pushA,popA));
    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack <Integer> stack = new Stack<Integer>();
        //Stack <Integer>B = new Stack();
        int a = 0;
        int b = 0;
        while(a<=popA.length-1&&b<=popA.length-1){
            stack.push(pushA[a]);
            if(pushA[a]==popA[b]){
                stack.pop();
                b++;
                a++;
            }else{
                a++;
            }
        }
        if(b<=popA.length-1){
            while(b<=popA.length-1){
                if(stack.peek()!= popA[b])
                    return false;
                else{
                    stack.pop();
                    b++;
                }
            }
        }
        return true;
    }
}
