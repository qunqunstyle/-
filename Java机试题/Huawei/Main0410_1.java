package Huawei;

import java.util.Arrays;
import java.util.Scanner;

public class Main0410_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String input[] = new String[n];
		for (int i = 0; i < n; i++)
			input[i] = in.next();
		String[] string = new String[10000];
		for (int i = 0; i < 10000; i++)
			string[i] = "";
		int time = 0;
		for (int i = 0; i < n; i++) {
			char temp[] = input[i].toCharArray();
			for (int j = 0; j < temp.length; j++) {
				L: for (int k = 0; k < 8; k++) {
					if (j == temp.length && k < 7) {
						int less = string[time].length();
						for (int m = 0; m < (8 - less); m++)
							string[time] += "0";
						break L;
					}
					string[time] += temp[j];
					j++;
				}
				time++;
				j--;
			}
		}
		Arrays.sort(string, 0, time);
		for (int i = 0; i < string.length; i++) {
			if (string[i].equals(""))
				break;
			if (i != 0)
				System.out.print(" ");
			System.out.print(string[i]);
		}
	}
}
