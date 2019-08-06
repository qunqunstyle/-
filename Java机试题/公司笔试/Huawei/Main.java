package Huawei;

import java.util.Scanner;
//牛客华为题目，分汽水瓶子
//https://blog.csdn.net/qunqunstyle99/article/details/89186056
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bottle[] = new int[11];
		int time = 0;
		while (in.hasNext()) {
			int numOfBottle = in.nextInt();
			System.out.println(count(numOfBottle));
			if (numOfBottle == 0)
				break;

		}
		in.close();
		/*
		 * for(int i = 0;i<bottle.length-1;i++) { int numOfBottle = in.nextInt();
		 * if(numOfBottle == 0) break; if(bottle[i]==0) break;
		 * System.out.println(count(bottle[i])); }
		 */
	}

	public static int count(int num) {
		int count = 0;
		count = num / 3;
		num = num % 3 + count;

		if (num < 2)
			return count;
		else if (num == 2) {
			return count + 1;
		} else
			return count += count(num);
	}
}
