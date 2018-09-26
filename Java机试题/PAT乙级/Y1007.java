import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int temp[]=new int[10000];
        int k=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(isPrime_3(i)==1){
                temp[k]=i;
                k++;
            }
        }
        for(int i=1;i<k;i++){
            if(temp[i]-temp[i-1]==2)
                count++;
        }
        System.out.print(count);
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
