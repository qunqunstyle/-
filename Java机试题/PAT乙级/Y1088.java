import java.util.Scanner;

public class Y1088 {
	public static void main(String []args) {
		Scanner inScanner =new Scanner(System.in);
		int M = inScanner.nextInt();
		int X = inScanner.nextInt();
		int Y = inScanner.nextInt();
		inScanner.close();
		int A=0,B;
		double C;
		//循环，判断符合要求的A的最大值
		for(int i=10;i<99;i++) {
			 B = i/10+i%10*10;
			 if(Math.abs(i-B)*1.0/X==B*1.0/Y)
			      if(i>A)
						  A=i;
			/*for(int j=0;j<99;j++) {
				if(i!=B) {
					if(j*X==Math.abs(i-B)&&B==Y*j)
						if(i>A)
						  A=i;
				}
			}	*/						
		}
		if(A==0)
			System.out.print("No Solution");
		else {
			B = A/10+A%10*10;
			C =1.0*B/Y;
			double temp[]= {A,B,C};
			System.out.print(A+" ");
			for(int i=0;i<3;i++) {
				if(temp[i]<M)
					System.out.print("Gai");
				else if(temp[i]>M)
					System.out.print("Cong");
				else 
					System.out.print("Ping");
				if(i!=2)
					System.out.print(" ");				
			}
		}
	}
}
