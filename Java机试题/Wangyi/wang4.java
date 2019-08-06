package Wangyi;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Comparator;

public class wang4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int table[][]=new int [N][2];
        for(int i=0;i<N;i++){
            table[i][0]=sc.nextInt();
            table[i][1]=sc.nextInt();
        }
        Arrays.sort(table, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int i=1;i<N;i++){
            table[i][1]=Math.max(table[i-1][1],table[i][1]);
        }
        TreeMap<Integer,Integer> map=new TreeMap();
        for(int i=0;i<N;i++){
            map.put(table[i][0],table[i][1]);
        }
        for(int i=0;i<M;i++){
            int p=sc.nextInt();
            if(map.floorKey(p)!=null){
                System.out.println(map.get(map.floorKey(p)));
            }else{
                System.out.println(0);
            }
        }
    }
}
