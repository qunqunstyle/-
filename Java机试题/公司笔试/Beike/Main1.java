/*燃烧卡路里
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 131072KB；其他语言 655360KB
        题目描述：
        越越小姐姐视卡路里为天敌,决定用S(1<=S<=10^9)元钱到健身房使用健身器材来燃烧卡路里。健身房里有n种健身器材,第i种健身器材使用费用为c[i](1<=c[i]<=10^9)，越越小姐姐想知道她最多能使用多少种器材？


        输入
        第一行两个正整数n,S

        第二行n个正整数,第i个正整数为c[i]

        输出
        一行一个整数表示最多能使用的器材数


        样例输入
        5 10
        3 9 5 7 6
        样例输出
        2*/


package Beike;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int S = in.nextInt();
        int count = 0;
        int num = 0;
        int value[] = new int[n];

        for (int i = 0; i < n; i++) {
            value[i] = in.nextInt();
        }
        Arrays.sort(value);
        for (int i = 0; i < n; i++) {
            if(count == S)
                break;
            if(value[i]+count < S ){
                count += value[i];
                num++;
                continue;
            }


        }
        System.out.println(num);


    }
}
