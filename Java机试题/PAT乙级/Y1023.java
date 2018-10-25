package PATY;

import java.util.Scanner;

public class Y1023 {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        int input[]=new int[10];
        for(int i=0;i<10;i++)
            input[i]=in.nextInt();
        in.close();
        int count=0;
            for(int i=1;i<10;i++){
                if(input[i]!=0){
                    if(count==0){
                        System.out.print(i);
                        count++;
                        for(int k=0;k<input[0];k++)
                            System.out.print(0);
                        for(int k=1;k<input[i];k++)
                            System.out.print(i);
                    }else {
                        for(int j=0;j<input[i];j++)
                            System.out.print(i);
                    }
                }
            }
        }
}

