package tenxun;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int input[] = new int[n];
        double Max = 0;
        for (int i = 0; i < n; i++)
            input[i] = in.nextInt();
        long x[] = new long[n];
        Arrays.fill(x, 0);
        x[0] = input[0];
        for (int i = 1; i < n; i++) {
            x[i] = input[i] + x[i - 1];
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Max = Math.max(Max, (double) input[findmin(input, i, j)] * (double) (x[j] - x[i - 1]));
            }
        }
        System.out.printf("%.0f", Max);
    }

    public static int findmin(int[] input, int head, int wear) {
        int min = 100001;
        int local = 0;
        for (int i = head; i <= wear; i++) {
            if (input[i] < min) {
                min = input[i];
                local = i;
            }
        }
        return local;
    }

    public static long getall(int[] input, int head, int wear) {
        long val = 0;

        for (int i = head; i <= wear; i++) {
            val += (long) input[i];
        }
        return val;
    }
}
