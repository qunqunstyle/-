package Wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    static List<int []> list = new ArrayList<>();
    static int input[];
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int queu[] = new int[n];
        for(int i = 0;i<n;i++)
            queu[i] = in.nextInt();
        String que = queu.toString();
        in.close();
        input = new int[n];
        for(int i = 0;i<n;i++)
            input[i] = i+1;
        list.add(input);
        dfs(0);
        int time = 1;
        for(int i = 0;i<n;i++){
            if(list.get(i).toString().equals(que))
                break;
            time++;
        }
        for(int i = n-1;i>=0;i--){
            if(time == 1){
                int put [] = list.get(i);
                for(int j = 0;j < put.length;j++){
                    if(j!=0)
                        System.out.print(" ");
                    System.out.print(put[j]);
                }
                break;
            }
            time--;
        }
    }
    public static void swap (int i,int j){
        int temp = input[i];
        input[i] = input [j];
        input[j] = temp;
    }
    public static void dfs (int begin){
        if(begin == input.length -1){
            list.add(input);
        }else {
            for(int i = begin;i<input.length;i++){
                if(i != begin || input[i]!=input[begin]){
                    swap(begin,i);
                    dfs(begin+1);
                    swap(begin,i);
                }

            }
        }
    }
}
