import java.util.Scanner;

public class Y1093 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String one = in.nextLine();
		String two = in.nextLine();
		in.close();
		char[] num1 = one.toCharArray();
		char[] num2 = two.toCharArray();
		//��Ӳ����࣬��ʹ��stringbuilder
		StringBuilder stringBuilder = new StringBuilder();
		//����һ
		for (int i = 0; i < num1.length; i++) {
			if(stringBuilder.length()==95)
				break;
			String str =""+num1[i];
			//�ж��Ƿ���ڵ�ǰԪ�أ�����������û�������
			if(stringBuilder.indexOf(str)!=-1) 
				continue;
			else 
				stringBuilder.append(num1[i]);
		}
		//�����
		for (int i = 0; i < num2.length; i++) {
			if(stringBuilder.length()==95)
				break;
			String str =""+num2[i];
			if(stringBuilder.indexOf(str)!=-1) 
				continue;
			else 
				stringBuilder.append(num2[i]);
		}
		System.out.println(stringBuilder);
	}
}
