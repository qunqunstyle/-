package Wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 1;i<n;i++){
            a[i] = Math.max(a[i-1],a[i]);
        }
        Arrays.sort(a);
        //System.out.print(a);
        for(int i = 0; i < n; i++){
           if(i!=0)
               System.out.print(" ");
           System.out.print(a[i]);
        }

    }
}
