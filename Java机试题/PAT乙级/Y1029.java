import java.util.Scanner;

public class Y1029 {
	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		String A =in.nextLine();
		String B =in.nextLine();
		String out ="��";
		for(int i=0;i<A.length();i++) {
			String temp=A.substring(i, i+1);
			//���Ǵ�д��ĸʱ����ƥ�������ĸ�Ĵ�д��Сд��B���Ƿ����
			if(temp.charAt(0)<='Z'&&temp.charAt(0)>='A') {
				//������ַ�ת��Сд
				String temp1=temp.toLowerCase();
				if(B.contains(temp)==false&&B.contains(temp1)==false) {	
					//�������ڼ����������
					if(out.contains(temp)==false&&out.contains(temp1)==false) {
						out+=temp;
						System.out.print(temp.charAt(0));
					}
				}
					
			}
			//����Сд��ĸʱ����ƥ�������ĸ�Ĵ�д��Сд��B���Ƿ����
			else if(temp.charAt(0)<='z'&&temp.charAt(0)>='a') {
				String temp1=temp.toUpperCase();
				if(B.contains(temp)==false&&B.contains(temp1)==false)
					//�������ڼ����������
					if(out.contains(temp)==false&&out.contains(temp1)==false) {
						out+=temp1;
						System.out.print(temp1.charAt(0));
					}
			}
			else {
				//�����ַ�ʱ��ֻ��Ҫ�ж��Ƿ����
				if(B.contains(temp)==false) {
					if(out.contains(temp)==false) {
						out+=temp;
						System.out.print(temp.charAt(0));
					}
				}

			}
		}
		//Ҳ����ֻ���out�ĵ�һ���ַ�֮����ַ����������Ͳ���Ҫ��ÿһ���ж��е������
		//out =out.substring(1);
		//System.out.print(out);
	}

}
