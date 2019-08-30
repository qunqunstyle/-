/*
考场安排
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        某校在积极推行无人监考制度，但是总有学生是不自觉的，如果将两个很熟的异性朋友放在同一个考场里，他们就会交流甚至作弊。因此一个考场中不能允许两个很熟的异性朋友存在，学校希望通过搬出一部分学生的方法来改善这一问题。

        但是又因为教室数量有限，因此希望一个教室中容下的学生尽可能多，即需要搬出教室的学生数量尽可能少，请你输出搬出教室人数最少，且字典序最小的方案。

        输入
        输入第一行有两个整数n和m，分别表示有n个男生和n个女生，有m个朋友关系。

        (1<=n<=500,1<=m<=100000)

        接下来m行，每行有两个整数，x和y，表示第x号男生和第y号女生是朋友。男生的编号均为[1,n]，女生的编号为[n+1,2n]。

        输出
        输出第一行包含一个整数a，表示最少需要搬出教室的人数。

        输出第二行有a个整数，即a个需要搬出教室的人的编号，要求人数最少，且字典序最小。


        样例输入
        2 2
        3 1
        1 4
        样例输出
        1
        1
*/


package JingDong;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int order [] = new int[2*n];//输出序列
        int order1 [] = new int[2*n];//中间序列
        Arrays.fill(order1,0);
        Arrays.fill(order,0);
        int num = 0;
        int communication[][] = new int[m][2];//男女关系表
        for (int i = 0; i < m ; i++){
            int temp = in.nextInt();
            int temp1 = in.nextInt();
            if(temp<=n){
                communication[i][0] = temp;
                communication[i][1] = temp1;
            }else {
                communication[i][1] = temp;
                communication[i][0] = temp1;
            }
            order1[temp-1]++;
            order1[temp1-1]++;
        }
        while (!chack(order1)){
            int findmaxpeoplelocal = findmax(order1);
            order[findmaxpeoplelocal-1] = 1;
            num++;
            if(findmaxpeoplelocal<=n){
                for(int i = 0;i < m;i++){
                    if(communication[i][0] == findmaxpeoplelocal)
                        communication[i][0] = communication[i][1] = 0;
                }
            }else {
                for(int i = 0;i < m;i++){
                    if(communication[i][1] == findmaxpeoplelocal)
                        communication[i][0] = communication[i][1] = 0;
                }
            }
            Arrays.fill(order1,0);
            for(int i = 0;i<m;i++){
                if(communication[i][0]!=0){
                    order1[communication[i][0]-1]++;
                    order1[communication[i][1]-1]++;
                }
            }
        }
        System.out.println(num);
        for(int i = 0;i<2*n;i++){
            if(i!=0)
                System.out.print(" ");
            if(order[i]!=0)
                System.out.print(i+1);
        }

    }
    public static boolean chack(int order[]){ //判断是否符合标准
        int lengman = 0;
        int lenggil = 0;
        for(int i = 0;i<order.length;i++){
            if(i>=0 &&i<order.length/2){
                if(order[i]!=0)
                    lengman++;
            }
            if(i>=order.length/2 &&i<order.length){
                if(order[i]!=0)
                    lenggil++;
            }
        }
        if(lenggil==0 || lengman==0)
            return true;
        else
            return false;
    }
    public static int findmax(int order[]){//寻找这一轮中关系网最多的人
        int result = 0;
        int local = 0;
        for(int i = 0;i<order.length;i++){
            if(order[i] > result){
                result = order[i];
                local = i;
            }
        }
        order[local] = 0;
        return local+1;
    }
}