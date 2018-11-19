import java.util.Scanner;
 
public class Y1034 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split("[\\s/]");
		in.close();
		//���������
		long a1 = Integer.parseInt(input[0]);
		long b1 = Integer.parseInt(input[1]);
		long a2 = Integer.parseInt(input[2]);
		long b2 = Integer.parseInt(input[3]);
 
		//��ĸ��Ϊ�㣬��Ŀ˵�˲���Ϊ�㣬���ҿ������Բ���д����жϣ�����ɾȥ�˴�if���
		if (b1 != 0 && b2 != 0) {
			add(a1, b1, a2, b2);
			minus(a1, b1, a2, b2);
			mutilply(a1, b1, a2, b2);
			divide(a1, b1, a2, b2);
		}
	}
 
	//�жϷ��ӷ�ĸ�����Ĵ�С��������Ҳ���Ե����ǳ�������
	public static void tackle(long a, long b) {
		if (a == 0) {
			//������Ϊ�㣬ֱ�����0
			System.out.print(0);
			return;
		}
 
		//������С���㣬����ֵС���㣬��ӡ�����ź�-��
		boolean isMinus = a > 0 ? false : true;
		if (isMinus) {
			System.out.print("(-");
			a = -a;//��ֵ
		}
 
		long gcd = getGcd(a, b);//���Լ��
		a = a / gcd;
		b = b / gcd;
		if (a % b == 0) {
			System.out.print(a / b);
		} else if (Math.abs(a) > b) {
			System.out.print(a / b + " " + a % b + "/" + b);//ԭ������(a % b) % b����bȡ��һ��С��b������һ��ȡ���������ԭ����ɾȥ
		} else if (a == b) {
			System.out.print(1);
		} else {
			System.out.print(a + "/" + b);
		}
 
		if (isMinus) {
			System.out.print(")");
		}
	}
 
	//����
	public static void divide(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
		System.out.print(" / ");
		tackle(a2, b2);
		System.out.print(" = ");
		if (a2 == 0) {
			System.out.print("Inf");
		} else if (a2 < 0) {
			//a/b �� c/d = ad/bc
			tackle(-1 * a1 * b2, -1 * a2 * b1);
		} else {
			tackle(a1 * b2, a2 * b1);
		}
	}
	//�˷�
	public static void mutilply(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
		System.out.print(" * ");
		tackle(a2, b2);
		System.out.print(" = ");
		//a/b �� c/d = ac/bd
		tackle(a1 * a2, b1 * b2);
		System.out.println();
	}
	//����
	public static void minus(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
		System.out.print(" - ");
		tackle(a2, b2);
		System.out.print(" = ");
		//������a/b �� c/d ͨ�������㣬����Ϊad-bc����ĸΪbd
		tackle(a1 * b2 - a2 * b1, b1 * b2);
		System.out.println();
	}
 
	//�ӷ�
	public static void add(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
		System.out.print(" + ");
		tackle(a2, b2);
		System.out.print(" = ");
		//�ӷ���a/b �� c/d ͨ�������㣬����Ϊad+bc����ĸΪbd
		tackle(a1 * b2 + a2 * b1, b1 * b2);
		System.out.println();
	}
 
	//�����������Ʒ�����ŷ������㷨��������ӷ�ĸ�����Լ��
	public static long getGcd(long a, long b) {
		while (a % b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return b;
	}
}