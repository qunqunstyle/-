
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.LongSupplier;

import javax.sql.rowset.spi.SyncFactoryException;

public class Y1089 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int say[]=new int[N+1];	
		Boolean ifHasAn=true;
		//��1��ʼ��Ϊ�˺�˵����λ�ö�Ӧ
		for(int i=1;i<=N;i++) 
			say[i]=in.nextInt();
		in.close();
		
	Loop:for(int i = 1 ; i <= N ; i++) {
			for(int j = i+1 ; j <= N ; j++) {
				int identity[]=new int[N+1];//��ʵ�������
				Arrays.fill(identity, 1);
				identity [i] = identity[j]=-1;		//��i��jΪ����
				int time=0;
				int lie[]=new int [100];
				//�ж�˵���Ƿ�Ϊ�棬˵�Ǻ��ˣ�ȷʵ�Ǻ���Ϊ�棬
				//˵�����ˣ�ȷʵ������Ϊ�棬����Ϊ�٣���ͬ��Ϊ�棬���Ϊ��
				for(int k = 1 ; k <= N ; k++)
					if(say[k]*identity[Math.abs(say[k])]<0) {
						
							lie[time]=k;
							time++;																				
					}
				//������������˵�ѣ���һ��������һ���˺��ˣ������
				if(time == 2 && identity[lie[1]] + identity[lie[0]] == 0) {
					System.out.print(i+" "+j);
					ifHasAn=false;
					break Loop;	
				}
										
			}
		}
		if(ifHasAn)
			System.out.print("No Solution");
					
	}

}
