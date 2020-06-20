package T360;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String string = in.next();
        int count [] = new int [26];
        Arrays.fill(count,0);
        for(int i = 0;i<string.length();i++){
            count[string.charAt(i)-'a']++;
        }
        //find max
        int max = 0;
        for(int i =0;i<26;i++){
            if(max<count[i])
                max = count[i];
        }
        System.out.println(max);
    }
}
