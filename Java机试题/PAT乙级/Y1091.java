
import java.util.Scanner;

public class Y1091 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		long num[] = new long[M];
		for (int i = 0; i < M; i++) {
			num[i] = in.nextInt();
		}
		in.close();
		for (int i = 0; i < M; i++) {
			long temp = num[i] * num[i];
			Boolean isN = false;
			Loop: for (int j = 0; j < 10; j++) {
				long temp1 = temp * j;
				String aString = "" + temp1;
				String bString = "" + num[i];
				if (bString.length() == 1) {
					//长度是1时单独讨论了
					char a = aString.charAt(aString.length() - 1);
					char b = bString.charAt(0);
					if (a == b) {
						System.out.println(j + " " + temp1);
						isN = true;
						break Loop;
					}		
				} else {
					int time = 0;
					for (int k = 0; k < bString.length(); k++) {
						//从后向前循环比较
						char a = aString.charAt(aString.length() - k - 1);
						char b = bString.charAt(bString.length() - k - 1);
						if (a != b) 
							break;
					    else 
							time++;					
					}
					//前一个循环执行完毕且没有中途停止，则匹配成功
					if (time == bString.length() ) {
						System.out.println(j + " " + temp1);
						isN = true;
						break Loop;
					}
				}
			}
			//若十个数也没有找到，则说明失败，输出No
			if (!isN)
				System.out.println("No");
		}
	}
}
