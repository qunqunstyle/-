import java.util.Scanner;

public class Y1024 {
	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		String input =in.nextLine();
		in.close();
		String temp[]=input.split("E");
		if(temp[0].charAt(0)=='-')
			System.out.print("-");
		String aString=temp[0].substring(1);//�ӵڶ���λ�ÿ�ʼ
		char a []=aString.toCharArray();//ת��char�����飬����������λ
		int num=Integer.valueOf(temp[1]);
		
		if(num<0) {
			//����Ϊ��ʱ��Ϊ��
			System.out.print("0.");
			//��ӡ0
			for (int i = 0; i < (-num)-1; i++) 
				System.out.print("0");	
			//��ӡ��Ч����
			for (int i = 0; i < a.length; i++) {
				if(a[i]!='.')
					System.out.print(a[i]);
			}	
		}
		
		else {
			System.out.print(a[0]);
			int count=0;//ͳ�ƴ���			
			for (int i = 2; i < a.length&&count<num; i++) {
				//��ӡ��ЧС����ǰ�ķ�������
				//������С�������Ч���ֳ��Ȼ򳬹�����ʱ����
				//�ӵڶ�λ��ʼ��ӡ��ʡ��С����
				  System.out.print(a[i]);
				count++;//ͳ�ƴ�ӡ����
			}
			int count1=count;
			
			//���ǽ���С�� ��ѧ������С��λ ���ȣ������С�����С��λ
			if(num<a.length-2) {			
				for (int i = count+2; i < a.length; i++) {
					//����ӡ���ȴﵽ����ȴС����Ч���ֳ���ʱ����ӡС����
					if(count1==num)
					   System.out.print(".");
					System.out.print(a[i]);	
					count1++;
				}					
			}
			
			//���ǽ���������Ч���ֳ���ʱ����ӡ����Ч���ֻ����ӡ��ӡ0
			if(a.length-2<num) {
				for(int i=0;i<num-a.length+2;i++)
					System.out.print("0");
			}			
		}
	}
}
