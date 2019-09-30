/*七夕节的礼物
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 131072KB；其他语言 655360KB
        题目描述：
        七夕将近,Bruce想要送给他的女朋友Alice一份特殊的礼物。Bruce知道Alice的幸运字符串t,长度为n(1<=n<=50)。Bruce想要构造出一个最短的字符串s,使得幸运字符串t在s中出现了恰好k(1<=k<=50)次,他想请你帮助他找到这样的字符串s,他将在七夕时把s作为礼物送给Alice

        输入
        第一行输入两个正整数n,k，以空格隔开

        第二行输入长度为n的字符串t

        输出
        输出一行一个字符串表示字符串s


        样例输入
        3 4
        aba
        样例输出
        ababababa*/


package Beike;

import java.util.Scanner;

public class Main2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String string = in.nextLine();
        in.close();
        String complax = "";
        for(int i = 0;i<string.length();i++){
            if(string.charAt(i)== ' '){

            }
        }
    }
}
