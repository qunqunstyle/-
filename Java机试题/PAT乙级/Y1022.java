package PATY;

import java.util.Scanner;

public class Y1022 {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        //int型最长2的32次方，int型够用
        int A =in.nextInt();
        int B =in.nextInt()+A;
        int D =in.nextInt();
        int temp[]=new int[100];
        int i=0;
        //十进制到任意进制，这个数对基数依次取余，倒序输出，在之前正序输出最后一个商
        while (B/D!=0){
            temp[i]=B%D;
            B=B/D;
            i++;
        }
        System.out.print(B);

        for(int j=i-1;j>=0;j--)
            System.out.print(temp[j]);
    }
}
