/*迷宫寻路
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        给定一个包含非负整数的 M x N 迷宫，请找出一条从左上角到右下角的路径，使得路径上的数字总和最小。每次只能向下或者向右移动一步。

        输入
        第一行包含两个整数M和N，以空格隔开，1≤N≤10，1≤N≤10。

        接下来的M行中，每行包含 N个数字 。

        输出
        找出总和最小的路径，输出路径上的数字总和。


        样例输入
        3 3
        1 3 1
        1 5 1
        4 2 1
        样例输出
        7*/
package Meituan;

import java.util.Scanner;

public class Main1 {
    static int count = 10000000;
    static int M;
    static int N;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        int road[][] = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                road[i][j] = in.nextInt();
            }
        }
        M--;
        N--;
        dfs(road, 0, 0, 0);
        System.out.println(count);
    }

    public static void dfs(int road[][], int i, int j, int allnum) {
        allnum += road[i][j];
        if (M == i && N == j) {
            if (allnum < count)
                count = allnum;
        } else if (M == i && j < N) {
            dfs(road, i, j + 1, allnum);
        } else if (N == j && i < M) {
            dfs(road, i + 1, j, allnum);
        } else if (j < N && i < M) {
            dfs(road, i, j + 1, allnum);
            dfs(road, i + 1, j, allnum);
        }

    }
}
