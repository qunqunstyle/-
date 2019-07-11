package lanqiao;
//        题目描述：
//        现有N个球，分别按照顺序标号：1~N；现在要求去除部分球，要求如下：
//        1、去除所有标号为（1、4、9、16、5^2....）完全平方数的球体
//        2、将剩余的K个球体重新编号为1~K；
//        3、重复上述过程，直到只留下最后一个球

//        例子：
//        input ：6
//        output：5

//        这是一个面试题目，手撕代码系列，常规思路为递归操作，但是使用辅助空间的话可以很大的节省时间和空间资源
//        小球数组[1,2,3,4,5,6]
//        游标数组[1,1,1,1,1,1]   (1)
//        游标数组[0,1,1,0,1,1]   (2)
//        游标数组[0,0,1,0,1,0]   (3)
//        游标数组[0,0,0,0,1,0]   (4)
//        输出编号5


//        这里是使用了一个辅助空间，因为只需要输出一开始的编号，也就是最初数组中的值，故也可以直接将原数组不符合标准的置为零
//        在每一轮判断编号的时候原数组为零不加，不为零加一，也可以有同样的效果。这样没有空间的额外申请，但是破坏了原数组。
//        在本题中没有影响，如遇到变种可以酌情变通。

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class delete_the_ball {



    public static void main(String []args){
        List <String> list = new ArrayList<>() ;
        list.add("1");
        Scanner in =new Scanner(System.in);
        int N;//球的个数
        double sum=0;//记录每一轮的序号值
        int where=0;//记录位置
        N =in.nextInt();
        int input[] = new int[N+1];
        int temp[] = new int[N+1];

        //按序初始化小球数组
        for(int i=1;i<=N;i++)
            input[i]=i;

        //按序初始化游标数组
        for(int i=1;i<=N;i++)
            temp[i]=1;

     Loop:  while (true){
            //每一次进入循环都做一次累加，判断是否只剩一个
            for (int i=1;i<=N;i++){
                sum+=temp[i];
                //每一次都记录游标等于1的值，当只剩一个时，自然是目标小球的下标
                if (temp[i]==1)
                    where=i;
            }

            //当游标数组的累加值为1时，输出结果
            if(sum==1){
             System.out.println(where);
             break Loop;
             }
             //将每一轮统计前将游标总数置为零
            sum=0;
            for(int i=1;i<=N;i++){
                sum+=temp[i];
                //将sum开平方对1取余操作
                if (Math.sqrt(sum)%1==0)
                    temp[i]=0;

            }
        }

    }
}

