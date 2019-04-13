package LanQiao;

import java.time.LocalDate;
import java.util.Scanner;

public class yidongjuli {
	static int w ;
	static int m ;
	static int n ;
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		 w = scanner.nextInt();
		 m = scanner.nextInt();
		 n = scanner.nextInt();
		int line1 = m/w;
		if(m%w!=0)
			line1++;
		int line2 = n/w;
		if(n%w!=0)
			line2++;
		int order1 = line1%2;
		int order2 = line2%2;
		int local1 = Local(order1, m);
		int local2 = Local(order2, m);
		System.out.println(Math.abs(line1-line2)+Math.abs(local2-local1));
	}
	public static  int Local(int order,int m) {
		int local=0;
		if(order==1) {
			local = m%w;
			if(local==0)
				local=w;
		}else {
			local = w-(m%w)+1;
			if(local==0)
				local=1;
		}
			
		return local;
	}

}
