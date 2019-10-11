/*物品分堆
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        假设有N个物品，其中第i个物品的重量为Wi。现在要将这些物品分成两堆，使得在“第一堆物品的总重量与第二堆物品的总重量之差尽可能小”的前提下，第一堆物品的数量与第二堆物品的数量之差尽可能大。那么，两堆物品的总重量之差最小是多少？在总重量之差最小的前提下，两堆物品的数量之差最大是多少？

        输入
        第一行包含一个整数N，2≤N≤100。

        第二行包含N个空格隔开的整数W1到WN，1≤Wi≤100。

        输出
        输出两个空格隔开的整数，第一个整数表示两堆物品的总重量之差的最小值，第二个整数表示在总重量之差最小的前提下，两堆物品的数量之差的最大值。


        样例输入
        6
        1 2 3 4 5 6
        样例输出
        1 2*/

package Beike;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W[] = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = in.nextInt();
        }
        Arrays.sort(W);
        for (int i = 1; i < N; i++) {
            W[i] += W[i - 1];
        }
        int halfW = W[N - 1] / 2;

        int temp = 0;
        for (int i = 0; i < N; i++) {
            if (W[i] < halfW)
                continue;
            if (W[i] >= halfW) {
                temp = i;
                break;
            }
        }
        int minweight = Math.min(W[N - 1] - 2 * W[temp - 1], W[N - 1] - 2 * W[temp]);
        int maxnum = Math.abs(temp + 1 - (N - 1 - temp));
        System.out.println(minweight + " " + maxnum);
    }
}
