package Wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class wang2 {
    public static void main(String[] args) {

        class clock implements Comparable<clock> {
            int H;
            int M;
            int time;

            public clock(int H, int M) {
                this.H = H;
                this.M = M;
                this.time = H * 60 + M;
            }

            @Override
            public int compareTo(clock o1) {
                return this.time - o1.time;
            }
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        clock clock[] = new clock[n];
        for (int i = 0; i < n; i++) {
            int H = in.nextInt();
            int M = in.nextInt();
            clock[i] = new clock(H, M);
        }

        Arrays.sort(clock, 0, n);
        int needtime = in.nextInt();
        int schooltime = in.nextInt() * 60 + in.nextInt();
        in.close();
        schooltime -= needtime;
        for (int i = n - 1; i >= 0; i--) {
            if (clock[i].time <= schooltime) {
                System.out.println(clock[i].H + " " + clock[i].M);
                break;
            }
        }
    }

}
