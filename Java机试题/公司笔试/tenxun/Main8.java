package tenxun;


import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mat[][] = new int[n][2];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            mat[i][0] = in.nextInt();
            mat[i][1] = in.nextInt();
            b[i] = mat[i][0] - mat[i][1];
        }
        Arrays.sort(b);
        for (int i = 0; i < n / 2; i++) {
            int temp = b[i];
            b[i] = b[n - 1 - i];
            b[n - 1 - i] = temp;
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += (long) b[i] * i + (long) (n - 1) * mat[i][1];
        }
        System.out.println(result);
    }
}
