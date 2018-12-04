
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
		//从1开始，为了和说话的位置对应
		for(int i=1;i<=N;i++) 
			say[i]=in.nextInt();
		in.close();
		
	Loop:for(int i = 1 ; i <= N ; i++) {
			for(int j = i+1 ; j <= N ; j++) {
				int identity[]=new int[N+1];//真实身份数组
				Arrays.fill(identity, 1);
				identity [i] = identity[j]=-1;		//设i和j为狼人
				int time=0;
				int lie[]=new int [100];
				//判断说话是否为真，说是好人，确实是好人为真，
				//说是狼人，确实是狼人为真，其他为假，则同号为真，异号为假
				for(int k = 1 ; k <= N ; k++)
					if(say[k]*identity[Math.abs(say[k])]<0) {
						
							lie[time]=k;
							time++;																				
					}
				//若仅有两个人说谎，且一个是狼人一个人好人，则成立
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
