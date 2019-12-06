package Beijing58;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String string [] = s.split(",");
        int num[] = new int[string.length];
        int MinValue = 0;
        for(int i = 0;i<string.length;i++)
            num[i] = Integer.parseInt(string[i]);
        Arrays.sort(num);
        int time = 0;
        while (time<num.length){
            if(time+num[time]<num.length&&num[time+num[time]] == num[time]){
                MinValue += num[time]+1;
                time += num[time];
            }
            else
                MinValue += num[time]+1;
            time++;
        }
        System.out.println(MinValue);
    }
}
