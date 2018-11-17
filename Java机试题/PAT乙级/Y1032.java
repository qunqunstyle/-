import java.util.Scanner;

public class Y1032 {
	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int school[]=new int[5000];
		for(int i=0;i<500;i++)
			school[i]=0;
		for(int i=0;i<n;i++) {
			int id =in.nextInt();
			int score=in.nextInt();		
			school[id]+=score;
		}
		int maxid=0;
		for(int i=0;i<499;i++)
			if(school[i]<school[i+1])
				maxid=i+1;
		System.out.println(maxid+" "+school[maxid]);
	}
}
