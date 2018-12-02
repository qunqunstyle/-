import java.util.Scanner;

public class Y1087 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int temp[] =new int[N*2];
		for(int i=1;i<=N;i++) {
			int count =i/2 + i/3 + i/5;
			temp[count]=1;
		}
		int time=0;
		for(int i=0;i<2*N;i++) {
			if(temp[i]==1)
				++time;
		}
		System.out.print(time);
		
	}
}
