package Shunfeng;

import java.util.Scanner;

public class Main1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int input [] = new int[n];
        String string = in.next();
        for(int i= 0;i<n;i++)
            input[i] = string.charAt(i)-'A';
        int num[] = new int[13];
        for(int i = 0;i < 13;i++)
            num[i] = in.nextInt();
        for(int i = 0;i < n;i++)
            num[input[i]] = -1 ;
        //findMax
        int local = 0;
        int Max = -1;
        for(int i = 0; i<13;i++){
            if(Max < num[i]){
                Max = num[i];
                local = i;
            }
        }
        char out = (char)('A' + local);
        System.out.println(out);
    }
}
