package Wangyi;

import java.util.Scanner;

public class wang3 {
    static int count = 0;
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int value[] = new int[n];
        int sum = 0;
        for(int i = 0;i < n;i++){
            value[i] = in.nextInt();
            sum +=value[i];
        }
        if(sum <= w)
            System.out.println((int)Math.pow((double)2,(double)n));
        else {
            dfs(0,0,n,w,value);
            System.out.println(count);
        }


    }
    public static void dfs(int consum,int index,int n,int w,int value[]){
        if(consum>w)
            return;
        if(index>=n)
            return;
        else {
            count++;
            dfs(consum,index+1,n,w,value);
            dfs(consum+value[index],index+1,n,w,value);
        }
    }
}
