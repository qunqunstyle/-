package PATY;

import java.util.Arrays;
import java.util.Scanner;

public class Y1019 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int value = in.nextInt();
        int A[]=new int[4];
        count(A,value);
        while (true){
            Arrays.sort(A);
            if(A[0]==A[1]&&A[1]==A[2]&&A[2]==A[3]){
                System.out.print(value+" - "+value+" = 0000");
                break;
            }
            int first =A[3]*1000+A[2]*100+A[1]*10+A[0];
            int two =A[0]*1000+A[1]*100+A[2]*10+A[3];
            value=first-two;
            //输出四个长度的数字还可以转成字符串输出
            /*String s1=String.format("%04d",first);
            String s2=String.format("%04d",two);
            String s3=String.format("%04d",value);
            if(value!=6174)
                System.out.println(s1+" - "+s2+" = "+s3);
            else{
                System.out.print(s1+" - "+s2+" = "+s3);
                break;
            }*/
            if(value!=6174)
                System.out.printf("%04d - %04d = %04d\n",first,two,value);
            else{
                System.out.printf("%04d - %04d = %04d\n",first,two,value);
                break;
            }
            count(A,value);

        }

    }
    static void count(int A[],int value){
        A[0]=value/1000;
        A[1]=(value-A[0]*1000)/100;
        A[2]=(value-A[0]*1000-A[1]*100)/10;
        A[3]=value%10;
    }
}

