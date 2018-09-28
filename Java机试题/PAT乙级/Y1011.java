package PATY;

import java.util.Scanner;

public class Y1011 {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            long A=input.nextLong();
            long B=input.nextLong();
            long C=input.nextLong();
            if((A+B)>C)
                System.out.println("Case #"+ i +": true");
            else
                System.out.println("Case #"+ i +": false");
        }
    }
}