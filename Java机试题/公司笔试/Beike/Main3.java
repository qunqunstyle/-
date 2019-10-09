/*捡贝壳
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        小明去海边游玩，他看到很多五颜六色的贝壳十分开心，于是他开始捡贝壳。小明的背包容量有限，所以他希望先捡价值大的贝壳，如果价值大的贝壳装不下了，再考虑价值次大的贝壳，直到背包再也装不下任何贝壳了。

        现在告诉你贝壳的种类和贝壳的数量，以及小明背包的体积和每种贝壳单个占用的体积，你能算出小明的背包中最多可以装下多少个贝壳么？

        输入
        第一行两个整数n,m，分别表示贝壳的种数和小明背包的体积，1≤n≤100000，1≤m≤1018；

        接下来n行，第i行两个整数x,y，分别表示价值第i大的贝壳的数量和单个贝壳所占的体积；1≤x≤200000，1≤y≤200000；即从上到下输入的贝壳的价值越来越小。

        输出
        一个整数，表示按要求背包中最多可以装下的贝壳的数量。


        样例输入
        4 100
        3 40
        3 6
        1 1
        1 5
        样例输出
        6*/


package Beike;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int shellnum = in.nextInt();
        long packagenum = in.nextLong();
        int count = 0;
        int value[] = new int[shellnum ];
        int num[] = new int[shellnum ];
        for (int i = 0; i < shellnum; i++) {
            num[i] = in.nextInt();
            value[i] = in.nextInt();
        }
        for (int i = 0; i < shellnum; i++) {
            for (int j = 0; j < num[i]; j++) {
                if (value[i] < packagenum) {
                    count++;
                    packagenum -= value[i];
                }

            }
        }
        System.out.println(count);
    }

}
