package Huawei;

import java.util.Arrays;
import java.util.Scanner;
//牛客华为题目，明明的随机数
//https://blog.csdn.net/qunqunstyle99/article/details/89186056
public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int home[] = new int[1001];
			Arrays.fill(home, 0);
			for (int i = 0; i < n; i++) {
				int num = in.nextInt();
				if (home[num] == 0)
					home[num] = 1;
			}
			for (int i = 1; i <= 1000; i++) {
				if (home[i] != 0)
					System.out.println(i);
			}
		}

	}
}
