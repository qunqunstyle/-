package LeetCode;

public class leetcode12 {
    public String intToRoman(int num) {
        StringBuilder output = new StringBuilder("");
        int temp = 0;
        if (num >= 1000) {
            temp = num / 1000;
            for (int i = 0; i < temp; i++) {
                output.append("M");
            }
            num = num % 1000;
        }
        if (num >= 900) {
            output.append("CM");
            num -= 900;
        }
        if (num >= 500 && num < 900) {
            output.append("D");
            temp = (num - 500) / 100;
            for (int i = 0; i < temp; i++) {
                output.append("C");
            }
            num = num % 100;
        }
        if (num >= 400 && num < 500) {
            output.append("CD");
            num -= 400;
        }
        if (num >= 100 && num < 400) {
            temp = num / 100;
            for (int i = 0; i < temp; i++) {
                output.append("C");
            }
            num = num % 100;
        }


        if (num >= 90) {
            output.append("XC");
            num -= 90;
        }
        if (num >= 50 && num < 90) {
            output.append("L");
            temp = (num - 50) / 10;
            for (int i = 0; i < temp; i++) {
                output.append("X");
            }
            num = num % 10;
        }
        if (num >= 40 && num < 50) {
            output.append("XL");
            num -= 40;
        }
        if (num >= 10 && num < 40) {
            temp = num / 10;
            for (int i = 0; i < temp; i++) {
                output.append("X");
            }
            num = num % 10;
        }


        if (num == 9) {
            output.append("IX");
            num -= 90;
        }
        if (num >= 5 && num < 9) {
            output.append("V");
            temp = num - 5;
            for (int i = 0; i < temp; i++) {
                output.append("I");
            }
        }
        if (num == 4) {
            output.append("IV");
        }
        if (num < 4) {

            for (int i = 0; i < num; i++) {
                output.append("I");
            }
        }

        return output.toString();

    }
}
