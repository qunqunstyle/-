/*项目分配
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        某公司雇有N名员工，每名员工可以负责多个项目，但一个项目只能交由一名员工负责。现在该公司接到M个项目，令Ai,j表示第i名员工负责第j个项目所带来的收益，那么如果项目分配得当，总收益最大是多少？

        输入
        第一行包含两个整数N和M，1≤N，M≤1000。

        接下来N行，每行包含M个整数，第i行的第j个整数表示Ai,j，1≤Ai,j≤1000。

        输出
        输出总收益的最大值。


        样例输入
        3 3
        1 3 3
        2 2 2
        3 2 1
        样例输出
        9*/

package Didi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int input[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                input[i][j] = in.nextInt();
            }
        }
        int maxvalue = 0;
        for (int i = 0; i < M; i++) {
            int temp = 0;
            for (int j = 0; j < N; j++) {
                if (input[j][i] > temp)
                    temp = input[j][i];
            }
            maxvalue += temp;
        }
        System.out.print(maxvalue);
    }
}
