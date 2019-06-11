package Huawei;


import java.util.Scanner;
//牛客华为题目，进制转换
//https://blog.csdn.net/qunqunstyle99/article/details/89186056
public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String input = in.next();
			int output = 0;
			double time = 0 ;
			char []count = input.toCharArray();
			for(int i =count.length-1;i>=2;i--) {
				if(count[i]<='9')
				    output +=(count[i]-'0')*Math.pow(16, time);
				else 
					output +=(count[i]-'A'+10)*Math.pow(16, time);
				time++;
			}
			System.out.println(output);
		}

	}
}
