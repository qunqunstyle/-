package Pinduoduo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class pin5 {

    public static class Bear{
        int hanger;
        int fight;
        public Bear(int fight,int hanger){
            this.fight = fight;
            this.hanger = hanger;
        }
    }
    public static class compareBear implements Comparator<Bear> {
        public int compare(Bear b1,Bear b2){
            return -(b1.fight - b2.fight);
        }
    }

    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int suger[] = new int[m];
        for(int i = 0;i<m;i++){
            suger[i] = in.nextInt();
        }
        Arrays.sort(suger);
        Bear bear[] =new Bear[n];
        HashMap<Integer,Bear> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int fight = in.nextInt();
            int hanger = in.nextInt();
            bear[i] = new Bear(fight,hanger);
            map.put(i,bear[i]);
        }
        Arrays.sort(bear,new compareBear());
        for(int i = 0;i<n;i++){
            for(int j = m-1;j>=0;j--){
                if(bear[i].hanger>=suger[j]&&suger[j]!=-1){
                    bear[i].hanger -= suger[j];
                    suger[j] = -1;
                }
            }

        }
        for(int i =0;i<n;i++){
            System.out.println(map.get(i).hanger);
        }

    }

}
