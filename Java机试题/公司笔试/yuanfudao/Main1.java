package yuanfudao;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int dp[][] = new int[10000][10000];
        dp[0][1] = 1;
        dp[1][K] = 1;
        dp[1][2] = 1;
        for(int i = 1;i<= N;i++){
            for(int j = 1;j<=K;j++){
                if(j == 1)
                    dp[i][j] = dp[i-1][K]+ dp[i-1][2];
                else if(j==N)
                    dp[i][j] = dp[i-1][1]+ dp[i-1][K-1];
                else
                    dp[i][j] = dp[i-1][j-1]+ dp[i-1][j+1];

            }
        }
        System.out.println(dp[N][1]);

    }
}
