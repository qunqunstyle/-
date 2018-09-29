package PATY;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int head =in.nextInt();
        int bottom =in.nextInt();
        int temp[]=new int[1000];
        int k=0;
        int count=0;
        //素数定义从2开始计算
        for(int i=2;;i++){
            if(isPrime_3(i)==1){
                count++;
                if(count>=head&&count<=bottom){
                    temp[k]=i;
                    k++;
                }else if(count>bottom)
                    break;
            }
        }
        int j=1;
        for(int i=0;i<k;i++){
            if(j!=10){
                if (j!=1)
                    System.out.print(" ");
                System.out.print(temp[i]);
                j++;
            }else if(j==10&&bottom==head)
                System.out.print(" "+temp[i]);
            else {
                System.out.println(" "+temp[i]);
                j=1;
            }
            head++;
        }
    }

    //判断是不是素数
    static int isPrime_3(int num)
    {
        //两个较小数另外处理
        if(num ==2|| num==3 )
            return 1 ;
        //不在6的倍数两侧的一定不是质数
        if(num %6!= 1&&num %6!= 5)
            return 0 ;
        double tmp =Math.sqrt(num);
        //在6的倍数两侧的也可能不是质数
        for(int i= 5;i <=tmp; i+=6 )
            if(num %i== 0||num %(i+ 2)==0 )
                return 0 ;
        //排除所有，剩余的是质数
        return 1 ;
    }
}