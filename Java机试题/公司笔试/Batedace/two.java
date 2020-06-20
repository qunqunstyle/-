package Batedace;

import java.util.Arrays;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String love []= new String[n];
        for (int i = 0;i<n;i++){
            love[i] = sc.next();
        }
        for (int i = 0;i<n;i++){
            char input[] = love[i].toCharArray();
            int length = input.length;
            char output [] = new char[length];
            int mid = 0;
            if(length % 2 ==1)
                mid = length/2+1;
            else
                mid = length/2;

            for(int j = 0;j<mid;j++)
                output[2*j] = input[j];
            int c = length;
            for(int j = 1;j<=length-1;j=j+2){
                output[j] = input[c-1];
                c--;
            }
            if(i!=0)
                System.out.print(" ");
            String s = String.valueOf(output);
            System.out.print(s);

        }

    }
}
