package PATY;

import java.util.Scanner;

public class Y1012 {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int num[]=new int[n];
        int A1=0;
        int A2=0;
        int A3=0;
        float A4=0.0f;
        int A5=0;
        int count=1;
        for(int i=0;i<n;i++)
            num[i]=input.nextInt();
        int k=0;
        for(int i=0;i<n;i++){

            if(num[i]%5==0&&num[i]%2==0)
                A1+=num[i];
            if(num[i]%5==1){

                if(count%2==1){
                    A2+=num[i];
                }else
                    A2-=num[i];
                count++;
            }
            if(num[i]%5==2)
                A3++;
            if(num[i]%5==3){
                k++;
                A4=(A4*(k-1)+num[i])/k;

            }
            if(num[i]%5==4){
                if(num[i]>A5)
                    A5=num[i];
            }
        }
        if(A1!=0)
            System.out.print(A1);
        else
            System.out.print("N");
        if(A2!=0)
            System.out.print(" "+A2);
        else
            System.out.print(" N");
        if(A3!=0)
            System.out.print(" "+A3);
        else
            System.out.print(" N");
        if(A4!=0.0f)
            System.out.printf(" %.1f",A4);
        else
            System.out.print(" N");
        if(A5!=0)
            System.out.print(" "+A5);
        else
            System.out.print(" N");
    }
}
