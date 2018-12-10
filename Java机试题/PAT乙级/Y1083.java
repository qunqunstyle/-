
import java.util.Arrays;
import java.util.Scanner;

public class Y1083 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int newOrder[] = new int[num + 1];
		int[] differ = new int[num];// ���Ĳ�ֵ���ᳬ��num-1,����0,��num��
		Arrays.fill(differ, 0);
		for (int i = 1; i < num; i++) {
			newOrder[i] = in.nextInt();
			int index = Math.abs(newOrder[i] - i);
			differ[index]++;
		}
		in.close();
		for (int i = num - 1; i >= 0; i--) {
			if (differ[i] > 1)
				System.out.println(i + " " + differ[i]);
		}
	}
}
