package Pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String string2 = in.nextLine();
        in.close();
        String numA[] = string.split(" ");
        String numB[] = string2.split(" ");
        int A[] = new int[numA.length];
        int B[] = new int[numB.length];
        for (int i = 0; i < numA.length; i++) {
            A[i] = Integer.valueOf(numA[i]);
        }
        for (int i = 0; i < numA.length; i++) {
            B[i] = Integer.valueOf(numB[i]);
        }
        int temp = 0;
        int temp1 = 0, temp2 = 0;

        for (int i = 1; i < A.length - 1; i++) {
            temp1 = A[i - 1];
            temp = i;
            temp2 = A[i + 1];

            if (A[i] > temp1 || temp2 - temp1 == 1)
                continue;

            else
                break;
        }

        Arrays.sort(B);
        int num_re = -1;
        boolean has = false;
        for (int i = B.length - 1; i >= 0; i--) {
            if (B[i] < temp2 && B[i] > temp1) {
                num_re = B[i];
                has = true;
                break;
            }
        }
        A[temp] = num_re;

        if (has) {
            for (int i = 0; i < A.length; i++) {
                if (i != 0)
                    System.out.print(" ");
                System.out.print(A[i]);
            }
        } else
            System.out.println("N0");


    }
}
