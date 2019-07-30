package Pinduoduo;

import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int head[] = new int[26];
        Arrays.fill(head,0);
        int wear [] = new int[26];
        Arrays.fill(wear,0);
        while (in.hasNext()) {
            String  a = in.next();
            head[a.charAt(0)-'A']++;
            wear[a.charAt(a.length()-1)-'A']++;
        }
        boolean ok =true;
        for(int i = 0;i<head.length;i++){
            if(head[i]!=wear[i]){
                ok = false;
                break;
            }
        }
        System.out.println(ok);
    }
}