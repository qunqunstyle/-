
import java.util.Arrays;
import java.util.Scanner;

public class Y1030 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		int p=in.nextInt();
		long num[]=new long[N];
		for(int i=0;i<N;i++) {
			num[i]=in.nextLong();
		}
		in.close();
		int max=0;//�����ֵ��
		int count=0;//ͳ�Ƹ���
		Arrays.sort(num);//���������򣬴�С����		
		for(int i=0;i<N;i++) {
			if(max>N-i+1)
				break;//��max�Ѿ�����δ����������ʱ������Է���
			for(int j=i;j<N;j++) {
				if(max>N-j+1)
					break;//��max�Ѿ�����δ����������ʱ������Է���
				int temp=N-1;//���ֵM����
				if(num[i]*p<num[temp])
					temp--;
				else
					if(max<temp-j+1)
					    max=temp-j+1;
			}
		}
		System.out.print(max);
	} 
}
