package PATY;

import java.util.Scanner;

/*
public class Y1010 {
    public static void main(String []args){

        int count=0;
        Scanner input = new Scanner(System.in);
        int one_letter[]=new int[100];

       for(int i=0;i<100;i++){
            one_letter[i]=input.nextInt();
            count++;
            if(one_letter[i]==0)
                break;
        }
        input.close();
       int k=0;
       for(int i=0;i<count;i=i+2){
            if(one_letter[k+1]!=0){

                one_letter[k]=one_letter[k]*one_letter[k+1];
                one_letter[k+1]--;
            }
            else
                one_letter[k]=0;
            k=k+2;
        }
        k=0;
       int flag=0;
       while (one_letter[k]!=0){
            if(k!=0)
                System.out.print(' ');
            System.out.print(one_letter[k]+" "+one_letter[k+1]);
            flag=1;
            k=k+2;
        }
        if(flag==0)
            System.out.print("0 0");
    }
}*/


public class Y1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int one_letter[]=new int[2];
        int isHaveOutput = 0;
        while (in.hasNext()) {
            one_letter[0] = in.nextInt();
            one_letter[1] = in.nextInt();

            if (one_letter[0] * one_letter[1] != 0) {
                //当出现零时做判断，是零方程式还是常数项的阶数零
                if (isHaveOutput!=0) {
                    System.out.print(" ");
                } else {
                    isHaveOutput = 1;
                }

                System.out.print(one_letter[0] * one_letter[1] + " " + (one_letter[1] - 1));
            }
        }
        in.close();

        if (isHaveOutput==0) {
            System.out.print("0 0");
        }
    }
}