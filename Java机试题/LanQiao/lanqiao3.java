package LanQiao;

import java.util.Scanner;
public class lanqiao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
		long result = (n+1)*n/2;
		
        System.out.print(result);
    }
}
