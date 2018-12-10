import java.util.Scanner;

public class Y1082TWO {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int max = 20000;
		int min = 0;
		String maxid = "";
		String minid = "";
		for (int i = 0; i < num; i++) {
			String id = in.next();
			int x = in.nextInt();
			int y = in.nextInt();
			int radius = (int) (Math.pow(x, 2) + Math.pow(y, 2));
			if (radius < max) {
				max = radius;
				maxid = id;
			}

			if (radius > min) {
				min = radius;
				minid = id;
			}
		}
		System.out.print(maxid + " " + minid);

	}
}
