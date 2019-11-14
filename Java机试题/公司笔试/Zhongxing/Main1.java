package Zhongxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String []args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Scanner in = new Scanner(System.in);

        for (int i =0;i<list.size();i++)
           System.out.print(list.get(i));
    }
    public List<Integer> salaryfrequeny(int num , int [] salaries){
        List<Integer> list = new ArrayList<>();
        int length = salaries.length;
        int temp [] = new int[length];
        Arrays.fill(temp,0);
        for(int i = 0;i <length;i++){
            if(salaries[i] == -1)
                continue;
            else {
                int count = 0;
                int conrrentSal = salaries[i];
                temp[i]++;
                for (int j = i+1; j<length;j++){
                    if(conrrentSal == salaries[j]){
                        temp[i]++;
                        salaries[j] = -1;
                    }
                }
            }
        }
        //找最大的工资个数
        int allNum = 0;
        while (allNum < length){
            int max = 0;
            for(int i = 0;i<length;i++ ){
                if(temp[i]>max){
                    max = i;
                }
            }
            for(int i = 0; i<temp[max];i++){
                list.add(salaries[max]);
                allNum++;
            }
            temp[max] = 0;
        }
        return list;
    }
}
