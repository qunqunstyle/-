package DaJiang;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, A, X;

        while (in.hasNext()) {
            N = in.nextInt();
            A = in.nextInt();
            X = in.nextInt();
            int input[] = new int[N];
            int alltime = 0;
            for (int i = 0; i < N; i++) {
                input[i] = in.nextInt();
                alltime += input[i];
            }
            if (alltime <= X * 60 * A + (8 - X) * 60) {
                if (alltime <= X * 60 * A) {
                    if (alltime / A * A < alltime) {
                        System.out.println(alltime / A + 1);
                    } else
                        System.out.println(alltime / A);
                } else {
                    alltime = alltime - X * 60 * A + X * 60;
                    System.out.println(alltime);
                }

            } else
                System.out.println("0");
        }
    }
}
