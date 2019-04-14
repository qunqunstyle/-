package LanQiao;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class yasuobianhuan {
	public static void main(String args[]) {
		Scanner scanner =new Scanner(System.in);
		int  n = scanner.nextInt();
		int putin[] = new int[n+1];
		putin[0] = 0;
		for(int i=1;i<=n;i++) 
			putin[i] = scanner.nextInt();
		int putout[] = new int[n+1];
		Arrays.fill(putout, 0);
		int a[] = new int[n];//保存最后一次访问的位置，长度待定
		Arrays.fill(a, 0);
		for(int i=1;i<=n;i++) {		
			if(a[putin[i]] ==0) {
				a[putin[i]]=i;
				putout[i]=-1*putin[i];
			}else  {
				int head = a[putin[i]];
				int end = i;
				Set<Integer> set = new TreeSet<>();
				for(int j = head+1;j<end;j++) {
					set.add(putin[j]);
				}				
				putout[i]=set.size();
				a[putin[i]]=end;//记录该数字最后一次出现的位置
			}
				
				
		}
		for(int i=1;i<putout.length;i++) {
			if(i!=1)
				System.out.print(" ");
			System.out.print(putout[i]);
		}
	}
}
