import java.util.Scanner;

public class Y1027 {

	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		int  num =in.nextInt();
		char symbol =in.next().charAt(0);
		in.close();
		int count =1;//���Դ�ӡ��������
		int rank=1;  //ÿһ��������
		int surplus=0;	//ʣ���������	
		while (count+(rank+2)*2<num) {
			rank+=2;	
			count +=rank*2;
		}
		surplus=num-count;
		int ceng =(rank+1)/2; //�ȴ�ӡ�ϰ벿��
		if(count!=1) {
			for (int i = 0; i <ceng; i++) {
				for(int j=0;j<i;j++)//��ӡ�׿ո�
					System.out.print(" ");
				for (int j = 0; j <rank; j++) 
					System.out.print(symbol);				
				for(int j=0;j<i;j++)//��ӡβ�ո�
					System.out.print(" ");
				System.out.print("\n");
				rank-=2;//ÿһ���������ݼ�2
			}
			rank=1;//������ִ����һ��-2���������-1��������Ϊ1
			int ceng2=ceng-1;//���ƿո���
			//��ӡ�°벿��
			for (int i = 0; i <ceng-1; i++) {
				rank+=2;//ÿ��������
				for(int j=0;j<ceng2-1;j++)
					System.out.print(" ");
				for (int j = 0; j <rank; j++) 
					System.out.print(symbol);				
				for(int j=0;j<ceng2-1;j++)
					System.out.print(" ");
				System.out.print("\n");
				ceng2--;
			}
			if(surplus!=0) 
				System.out.println(surplus);			
		}
		else {
			//��ֻ�ܴ�ӡһ������һ���ǣ������ʣ��
			System.out.println(symbol);
			System.out.println(surplus);
		}
	}
}
