import java.util.Arrays;
import java.util.Scanner;

public class Y1005 {
    public static void main(String []args){

    Scanner in = new Scanner(System.in);
    int n =in.nextInt();
    int temp[]=new int[n];        //存储输入值
    int arg[][] =new int[n][n];   //存储判断值，当某一列全为0时才是关键值
    int result[]=new int[n];      //输出结果数组
    int count=0;                   //做统计输出空格用
    int num=0;                     //result数组的长度
    for(int i=0;i<n;i++ ){
        for (int k=0;k<n;k++)
            arg[i][k]=0;            //全部置为0
    }
    for(int i=0;i<n;i++){
        temp[i]=in.nextInt();
    }
    for(int i=0;i<n;i++){
        int S =temp[i];
        while (S!=1){
            if(S % 2 == 0){
                S /= 2;
            } else
                S = (3 * S + 1) / 2;
            for(int k=0;k<n;k++){
                if(S==temp[k]){
                    arg[i][k]=1;    //当中间值与temp[i]（从0到n）的值相同的话，将之置为1
                }
            }
        }
    }
        for(int i=n-1;i>=0;i--){
            arg[i][i]=0;            //将对角线全部置为零，自己不能将自己覆盖
            for(int k=0;k<n;k++){
                if(arg[k][i]==1)
                    break;          //当某一列出现1后，则绝对不是关键值，跳出
                else
                if(k==n-1){
                    result[num]=temp[i];    //当遍历到每一列最后一个值，均为零时，则为关键值，将之存储到result数组中去
                    num++;                  //数组长度
                }
            }
        }
        Arrays.sort(result,0,num);   //因为输入的数据并不一定是从小到大排列的，并没有这个要求，所以需要需要排列一下
    for(int i=num-1;i>=0;i--){                  //这个操作让我从通过三个到全部通过，同时是从大到小输出。
        if (count!=0)
            System.out.print(' ');
        System.out.print(result[i]);
        count++;
    }
}
}
