
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
		int max=0;//最多数值数
		int count=0;//统计个数
		Arrays.sort(num);//将数组排序，从小到大		
		for(int i=0;i<N;i++) {
			if(max>N-i+1)
				break;//当max已经大于未遍历的数组时，则可以放弃
			for(int j=i;j<N;j++) {
				if(max>N-j+1)
					break;//当max已经大于未遍历的数组时，则可以放弃
				int temp=N-1;//最大值M坐标
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
