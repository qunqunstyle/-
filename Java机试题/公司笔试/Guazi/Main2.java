package Guazi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        boolean istrue = true;
        if (input.charAt(0) <= 'Z' && input.charAt(0) >= 'A') {
            if (input.charAt(1) <= 'Z' && input.charAt(0) >= 'A') {
                int len = input.length();
                while (len-- > 1) {
                    if (input.charAt(len) <= 'Z' && input.charAt(len) >= 'A')
                        continue;
                    else {
                        System.out.println("false");
                        istrue = false;
                        break;
                    }
                }
            } else {
                int len = input.length();
                while (len-- > 1) {
                    if (input.charAt(len) <= 'z' && input.charAt(len) >= 'a')
                        continue;
                    else {
                        System.out.println("false");
                        istrue = false;
                        break;
                    }
                }
            }
        } else {
            int len = input.length();
            while (len-- > 0) {
                if (input.charAt(len) <= 'z' && input.charAt(len) >= 'a')
                    continue;
                else {
                    System.out.println("false");
                    istrue = false;
                    break;
                }
            }
        }
        if (istrue)
            System.out.println("true");
    }
}
