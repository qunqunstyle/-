package PATY;

import java.util.Scanner;

public class Y1021 {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        String input =in.next();
        char count[]=input.toCharArray();
        int temp[]=new int[10];
        for (int i=0;i<10;i++)
            temp[i]=0;
        for(char X: count){
            switch (X){
                case '0':temp[0]++;break;
                case '1':temp[1]++;break;
                case '2':temp[2]++;break;
                case '3':temp[3]++;break;
                case '4':temp[4]++;break;
                case '5':temp[5]++;break;
                case '6':temp[6]++;break;
                case '7':temp[7]++;break;
                case '8':temp[8]++;break;
                case '9':temp[9]++;break;
            }
        }
        for(int i=0;i<10;i++){
            if(temp[i]!=0)
                System.out.println(i+":"+temp[i]);
        }
    }
}
