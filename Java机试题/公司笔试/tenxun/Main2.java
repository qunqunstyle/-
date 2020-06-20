//40
package tenxun;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double length = Math.pow(2,(double)n);
        int input[] = new int[(int)length];

        for (int i = 0;i<length;i++){
            input[i] = in.nextInt();
        }
        int m = in.nextInt();
        int times [] = new int[m];
        for(int i = 0;i<m;i++)
            times[i] = in.nextInt();

        while (m-->0){
            int count = 0;
             int temp = (int)Math.pow(2,times[times.length-m-1]);
             for(int i =0;i <= input.length-temp;i=i+temp){
                 int wear = i+temp-1;
                 for(int j = i;j < i+temp/2;j++){

                     int temp1 = input[j];
                     input[j] = input[wear];
                     input[wear] = temp1;
                     wear--;
                 }
             }
             for(int i = 0;i < length;i++){
                 int num = input [i];
                 for(int j = i+1;j<length;j++){
                     if(num>input[j])
                         count++;
                 }
             }
             System.out.println(count);
        }


    }
}
