package DaJiang;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int gamenum = in.nextInt();
            int havedays = in.nextInt();
            int value[] = new int[gamenum + 1];
            int days[] = new int[gamenum + 1];
            int allvalue = 0;
            int alldays = 0;
            for (int i = 1; i <= gamenum; i++) {
                value[i] = in.nextInt();
                days[i] = in.nextInt();
                allvalue += value[i];
                alldays += days[i];
            }
            if (alldays <= havedays)
                System.out.println(allvalue);
            else {
                int dp[][] = new int[gamenum + 1][havedays + 1];
                for (int i = 0; i <= havedays; i++) {
                    dp[0][i] = 0;
                }
                for (int i = 0; i <= gamenum; i++) {
                    dp[i][0] = 0;
                }
                for (int i = 1; i <= gamenum; i++) {
                    for (int j = 1; j <= havedays; j++) {
                        if (j < days[i]) {
                            //当背包的重量小于当前物品的重点时，则沿用上一行的value值
                            dp[i][j] = dp[i - 1][j];
                        } else {
                            dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - days[i]] + value[i]);
                        }
                    }
                }
                System.out.println(dp[gamenum][havedays]);
            }
        }
    }
}
