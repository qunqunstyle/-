
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
					//������1ʱ����������
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
						//�Ӻ���ǰѭ���Ƚ�
						char a = aString.charAt(aString.length() - k - 1);
						char b = bString.charAt(bString.length() - k - 1);
						if (a != b) 
							break;
					    else 
							time++;					
					}
					//ǰһ��ѭ��ִ�������û����;ֹͣ����ƥ��ɹ�
					if (time == bString.length() ) {
						System.out.println(j + " " + temp1);
						isN = true;
						break Loop;
					}
				}
			}
			//��ʮ����Ҳû���ҵ�����˵��ʧ�ܣ����No
			if (!isN)
				System.out.println("No");
		}
	}
}
