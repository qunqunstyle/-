package Huawei;

import java.util.Scanner;

public class Main0410_2 {
	static String string = "";
	static int time1 = 0;// 设置静态变量统一遍历位置

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		in.close();
		int time = 0;
		char temp[] = input.toCharArray();
		for (time = 0; time < temp.length; time++) {
			if ((temp[time] >= 'a' && temp[time] <= 'z') || (temp[time] >= 'A' && temp[time] <= 'Z'))
				string += temp[time];
			if (temp[time] <= '9' && temp[time] >= '1') {
				string += dsp(temp, time);
				time = time1;
			}

		}
		char a[] = string.toCharArray();
		for (int i = a.length - 1; i >= 0; i--)
			System.out.print(a[i]);// 倒序输出

	}

	public static String dsp(char[] temp, int head) {// 递归进入条件，出现数字

		String string1 = "";// 中间值
		String string2 = "";// 返回的值
		for (int i = head + 2; i < temp.length; i++) {
			if (temp[i] <= '9' && temp[i] >= '1') {
				time1 = i;
				String str2 = dsp(temp, i);
				i = time1;
				string1 += str2;
			}
			if (temp[i] != '}' && temp[i] != ']' && temp[i] != ')') {
				if ((temp[i] >= 'a' && temp[i] <= 'z') || (temp[i] >= 'A' && temp[i] <= 'Z')) {
					string1 += temp[i];
					continue;
				}
			}
			if (temp[i] == '}' || temp[i] == ']' || temp[i] == ')') {// 当出现右括号，意味着跳出一层递归
				for (int k = 0; k < (temp[head] - '0'); k++)
					string2 += string1;
				time1 = i; // 为了统一遍历到的位置
				return string2;
			}
		}
		return string2;
	}
}
