package Huawei;

import java.util.Scanner;

public class Main0410_2 {
	static String string = "";
	static int time1 = 0;// ���þ�̬����ͳһ����λ��

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
			System.out.print(a[i]);// �������

	}

	public static String dsp(char[] temp, int head) {// �ݹ������������������

		String string1 = "";// �м�ֵ
		String string2 = "";// ���ص�ֵ
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
			if (temp[i] == '}' || temp[i] == ']' || temp[i] == ')') {// �����������ţ���ζ������һ��ݹ�
				for (int k = 0; k < (temp[head] - '0'); k++)
					string2 += string1;
				time1 = i; // Ϊ��ͳһ��������λ��
				return string2;
			}
		}
		return string2;
	}
}
