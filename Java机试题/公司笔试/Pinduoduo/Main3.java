package Pinduoduo;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int L[] = new int[N];
        int W[] = new int[N];
        for(int i = 0;i<N;i++){
            L[i] =in.nextInt();
        }
        for(int i = 0;i<N;i++){
            W[i] =in.nextInt();
        }
    }
}
