package Guazi;

import java.util.Scanner;

public class Main1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int input [] = new int[n];
        for(int i = 0;i<n ;i++)
            input[i] = in.nextInt();
        int max = 0;
        int temp = 0;
        for(int i = 0;i<n ;i++){
            for(int wear = n-1 ;wear>i;wear--){
                if(input[wear]>input[i]){
                    max = Math.max(max,wear-i);
                }
            }
        }
        System.out.print(max);

    }
}
