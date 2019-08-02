package Pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class pin4 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long input [] = new long[n];

        for(int i = 0;i<n;i++){
            input [i] = in.nextLong();
        }
        Arrays.sort(input);
        long one = 0;
        if(input[1]<0){
             one = input[0]*input[1]*input[n-1];
        }

        long two = input[n-2]*input[n-3]*input[n-1];
        System.out.println(one>two?one:two);
    }
}
