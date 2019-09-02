/*合唱队形
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        合唱队的N名学生站成一排且从左到右编号为1到N，其中编号为i的学生身高为Hi。现在将这些学生分成若干组（同一组的学生编号连续），并让每组学生从左到右按身高从低到高进行排列，使得最后所有学生同样满足从左到右身高从低到高（中间位置可以等高），那么最多能将这些学生分成多少组？

        输入
        第一行包含一个整数N，1≤N≤105。

        第二行包含N个空格隔开的整数H1到HN，1≤Hi≤109。

        输出
        输出能分成的最多组数。


        样例输入
        4
        2 1 3 2
        样例输出
        2

        提示
        补充样例
        输入样例2
        10
        69079936 236011312 77957850 653604087 443890802 277126428 755625552 768751840 993860213 882053548
        输出样例2
        6

        此时分组为：【69079936】【236011312 77957850】【653604087 443890802 277126428】 【755625552】 【768751840】【 993860213 882053548】调整顺序后即可满足条件*/



package JingDong;

import java.util.Scanner;

public class Main1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long hight[] = new long[N];
        int num = 0;
        for(int i = 0; i<N;i++){
            hight[i] = in.nextLong();
        }
        in.close();
        int i = 0;
        while (i<N){
            int j = N-1;
            while ( j > i){
                if(hight[j]> hight[i] )
                   j--;
                else
                    break;
            }
            num++;
            i = j+1;
        }
        System.out.println(num);

    }
}
