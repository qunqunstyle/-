/*算式转移
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        给出一个仅包含加减乘除四种运算符的算式(不含括号)，如1+2*3/4，在保持运算符顺序不变的情况下，现在你可以进行若干次如下操作：如果交换相邻的两个数，表达式值不变，那么你就可以交换这两个数。

        现在你可以进行任意次操作，使得算式的数字序列字典序最小，然后输出结果，数字之间的字典序定义为若a<b则a的字典序小于b。

        输入
        第一行包含一个整数n，表示算式的长度，即包含n个数字和n-1个运算符。(1≤n≤100000)。

        第二行包含一个含有n个非0整数和n-1个运算符的算式，整数与运算符用空格隔开，运算符包括“+，-，*，/”，整数的绝对值不超过1000。

        输出
        按要求输出字典序最小的表达式，数字与符号之间用空格隔开。


        样例输入
        6
        3 + 2 + 1 + -4 * -5 + 1
        样例输出
        1 + 2 + 3 + -5 * -4 + 1*/

package Didi;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String input [] = new String[2*n-1];
        for(int i = 0;i<input.length;i++)
            input[i] = in.next();
        int temp =0;
        int num [] = new int[n];
        for(int i = 0;i<input.length;i=i+2){
            num[temp] = Integer.valueOf(input[i]);
            temp++;
        }
        char oper [] = new char[n];
        temp = 1;
        oper[0] = '+';
        for(int i = 1;i<input.length;i=i+2){
            oper[temp] = input[i].charAt(0);
            temp++;
        }
        int chackadd[] = new int[n-1];
        int chackplus[] = new int[n-1];
        Arrays.fill(chackadd,0);
        Arrays.fill(chackplus,0);
        for(int i = 0;i<oper.length-1;i++){
            if(oper[i] == '+' ){
                chackadd[i] =1;
            }
            if(oper[i] == '*' ){
                chackplus[i] =1;
            }
        }
        for(int i = n-2;i >=1 ;i--){
            if(chackadd[i] ==1){
                int local = 0;
                for(int j = i-1 ;j>=0;j--){
                    if(chackadd[j] == 1)
                        continue;
                    else {
                        local = j;
                        break;
                    }
                }
                Arrays.sort(num,local,i);
            }
        }
        for(int i = n-2;i > 0 ;i--){
            if(chackplus[i] ==1){
                int local = 0;
                for(int j = i-1 ;j>=0;j--){
                    if(chackplus[j] == 1)
                        continue;
                    else {
                        local = j;
                        break;
                    }
                }
                Arrays.sort(num,local,i);
            }
        }
        for (int i =0;i<n-1;i++){
            System.out.print(num[i]+" "+oper[i+1]+" ");
        }
        System.out.print(" "+num[n-1]);

    }
}
