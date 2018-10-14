package PATY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.math.BigInteger;
//import java.util.Scanner;

public class Y1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = bufferedReader.readLine().split(" ");
        bufferedReader.close();
        int b = Integer.parseInt(ab[1]), t = 0;
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < ab[0].length(); i++) {
            t = t * 10 + ab[0].charAt(i) - '0';
            stringBuffer.append((char)(t / b + '0'));
            t = t % b;
        }
        String result = stringBuffer.toString();
        if (result.charAt(0) == '0'  && result.length() != 1) {
            System.out.print(result.substring(1) + " " + t);
        } else {
            System.out.print(result + " " + t);
        }
    }
}
/*Scanner in=new Scanner(System.in);
        BigInteger A=in.nextBigInteger();
        BigInteger B = in.nextBigInteger();
        BigInteger Q=A.divide(B);
        BigInteger R=A.remainder(B);

        System.out.println(Q+" "+R);*/