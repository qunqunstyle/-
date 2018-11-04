import java.util.Scanner;

public class Y1027 {

	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		int  num =in.nextInt();
		char symbol =in.next().charAt(0);
		in.close();
		int count =1;//可以打印的星星数
		int rank=1;  //每一行星星数
		int surplus=0;	//剩余的星星数	
		while (count+(rank+2)*2<num) {
			rank+=2;	
			count +=rank*2;
		}
		surplus=num-count;
		int ceng =(rank+1)/2; //先打印上半部分
		if(count!=1) {
			for (int i = 0; i <ceng; i++) {
				for(int j=0;j<i;j++)//打印首空格
					System.out.print(" ");
				for (int j = 0; j <rank; j++) 
					System.out.print(symbol);				
				for(int j=0;j<i;j++)//打印尾空格
					System.out.print(" ");
				System.out.print("\n");
				rank-=2;//每一行星星数递减2
			}
			rank=1;//因最后多执行了一次-2操作变成了-1，重新置为1
			int ceng2=ceng-1;//控制空格数
			//打印下半部分
			for (int i = 0; i <ceng-1; i++) {
				rank+=2;//每行星星数
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
			//若只能打印一个，则一个星，再输出剩余
			System.out.println(symbol);
			System.out.println(surplus);
		}
	}
}
