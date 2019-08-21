
//判断是否是IPV4地址
package liulishuo;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] temp = string.split("\\.");
        boolean istrue = true;
        if (temp.length != 4){
            System.out.println(false);
            istrue =false;
        }



        else {
            for (int i = 0; i < 4; i++) {
                if (temp[i].length() > 3) {
                    System.out.println("false");
                    istrue =false;
                    break;
                } else {
                    int num = 0;
                    for (int j = 0; j < temp[i].length(); j++) {

                        if (temp[i].charAt(j) > '9' || temp[i].charAt(j) < '0') {
                            System.out.println("false");
                            istrue =false;
                            break;
                        } else {
                            num += num * 10 + temp[i].charAt(j) - '0';
                        }
                    }
                    if (num > 255 || num < 0) {
                        System.out.println("false");
                        istrue =false;
                        break;
                    }

                }

            }
            if (istrue)
                System.out.println("true");
        }
    }
}
