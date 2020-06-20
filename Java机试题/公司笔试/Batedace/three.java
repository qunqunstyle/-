package Batedace;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in [][] = new int[2][7];
        int count ;
        int count1 =0;

        for(int i =0;i<n;i++){
            for(int k =0;k<7;k++){
                in[i][k] = sc.nextInt();
            }
        }
        sc.close();
        for(int k = 0;k<n;k++){
            count = 0;
            for(int i = 0;i<7;i++){
                count += in[k][i];
            }
            count1 =count;
            if(count<=6)
                System.out.println("0");
            else {
                count -=7;
                int timeof3 = count /2 ;
                int timeof2 = 0;
                if(count - timeof3 *2 ==1)
                    timeof3 -= 1;
                timeof2 = (count - timeof2*2)/2;
                if(timeof3<=7){
                    System.out.println((int)Math.pow(3,timeof3)*(int)Math.pow(2,timeof2));
                }
                else {
                    count =count1-21;
                    count = count-timeof3*2-timeof2;
                     timeof3 = count /3 ;
                     timeof2 = 0;
                    if(count - timeof3 *2 ==1)
                        timeof3 -= 1;
                        System.out.println((int)Math.pow(3,timeof3)*(int)Math.pow(2,timeof2)*(int)Math.pow(3,7));

                }



            }
        }



    }
}
