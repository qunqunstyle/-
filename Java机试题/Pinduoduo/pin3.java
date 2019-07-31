package Pinduoduo;

import java.util.Scanner;

public class pin3 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int input [][] = new int[2][n];
        for(int i = 0;i<n;i++){
            input[0][i] = in.nextInt();
            input[1][i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0;i<n-2;i++){
            int x1 = input[0][i];
            int y1 = input[1][i];
            for(int j=i+1;j<n-1;j++){
                int x2 = input[0][j];
                int y2 = input[1][j];
                for(int k=j+1;k<n;k++){
                    int x3 = input[0][k];
                    int y3 = input[1][k];
                    if((x1-x2)*(y1-y3) != (y1-y2)*(x1-x3))
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
