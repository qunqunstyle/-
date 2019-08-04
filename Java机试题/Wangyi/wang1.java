package Wangyi;

import java.util.Scanner;

public class wang1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        while (count-- > 0) {
            int number = 0;
            String roadLength = in.next();
            char[] road = in.next().toCharArray();
            for (int i = 0; i < road.length; i++) {
                if (String.valueOf(road[i]).equals(".")) {
                    number++;
                    i += 2;
                }
            }
            System.out.println(number);
        }
    }

}
