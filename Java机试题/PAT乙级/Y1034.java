import java.util.Scanner;
 
public class Y1034 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split("[\\s/]");
		in.close();
		//分离出数据
		long a1 = Integer.parseInt(input[0]);
		long b1 = Integer.parseInt(input[1]);
		long a2 = Integer.parseInt(input[2]);
		long b2 = Integer.parseInt(input[3]);
 
		//分母不为零，题目说了不能为零，在我看来可以不用写这个判断，可以删去此处if语句
		if (b1 != 0 && b2 != 0) {
			add(a1, b1, a2, b2);
			minus(a1, b1, a2, b2);
			mutilply(a1, b1, a2, b2);
			divide(a1, b1, a2, b2);
		}
	}
 
	//判断分子分母计算后的大小和正负，也可以当做是除法操作
	public static void tackle(long a, long b) {
		if (a == 0) {
			//若分子为零，直接输出0
			System.out.print(0);
			return;
		}
 
		//若分子小于零，则数值小于零，打印左括号和-号
		boolean isMinus = a > 0 ? false : true;
		if (isMinus) {
			System.out.print("(-");
			a = -a;//改值
		}
 
		long gcd = getGcd(a, b);//最大公约数
		a = a / gcd;
		b = b / gcd;
		if (a % b == 0) {
			System.out.print(a / b);
		} else if (Math.abs(a) > b) {
			System.out.print(a / b + " " + a % b + "/" + b);//原代码是(a % b) % b，对b取余一定小于b，多做一次取余操作还是原数，删去
		} else if (a == b) {
			System.out.print(1);
		} else {
			System.out.print(a + "/" + b);
		}
 
		if (isMinus) {
			System.out.print(")");
		}
	}
 
	//除法
	public static void divide(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
		System.out.print(" / ");
		tackle(a2, b2);
		System.out.print(" = ");
		if (a2 == 0) {
			System.out.print("Inf");
		} else if (a2 < 0) {
			//a/b 除 c/d = ad/bc
			tackle(-1 * a1 * b2, -1 * a2 * b1);
		} else {
			tackle(a1 * b2, a2 * b1);
		}
	}
	//乘法
	public static void mutilply(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
		System.out.print(" * ");
		tackle(a2, b2);
		System.out.print(" = ");
		//a/b 乘 c/d = ac/bd
		tackle(a1 * a2, b1 * b2);
		System.out.println();
	}
	//减法
	public static void minus(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
		System.out.print(" - ");
		tackle(a2, b2);
		System.out.print(" = ");
		//减法，a/b 减 c/d 通分做计算，分子为ad-bc，分母为bd
		tackle(a1 * b2 - a2 * b1, b1 * b2);
		System.out.println();
	}
 
	//加法
	public static void add(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
		System.out.print(" + ");
		tackle(a2, b2);
		System.out.print(" = ");
		//加法，a/b 加 c/d 通分做计算，分子为ad+bc，分母为bd
		tackle(a1 * b2 + a2 * b1, b1 * b2);
		System.out.println();
	}
 
	//迭代法（递推法）：欧几里得算法：计算分子分母的最大公约数
	public static long getGcd(long a, long b) {
		while (a % b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return b;
	}
}