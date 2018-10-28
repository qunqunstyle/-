import java.util.Scanner;

public class Y1024 {
	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		String input =in.nextLine();
		in.close();
		String temp[]=input.split("E");
		if(temp[0].charAt(0)=='-')
			System.out.print("-");
		String aString=temp[0].substring(1);//从第二个位置开始
		char a []=aString.toCharArray();//转成char型数组，不包含符号位
		int num=Integer.valueOf(temp[1]);
		
		if(num<0) {
			//阶数为负时较为简单
			System.out.print("0.");
			//打印0
			for (int i = 0; i < (-num)-1; i++) 
				System.out.print("0");	
			//打印有效数字
			for (int i = 0; i < a.length; i++) {
				if(a[i]!='.')
					System.out.print(a[i]);
			}	
		}
		
		else {
			System.out.print(a[0]);
			int count=0;//统计次数			
			for (int i = 2; i < a.length&&count<num; i++) {
				//打印有效小数点前的非零数字
				//当超过小数点后有效数字长度或超过阶数时跳出
				//从第二位开始打印，省略小数点
				  System.out.print(a[i]);
				count++;//统计打印次数
			}
			int count1=count;
			
			//若是阶数小于 科学计数法小数位 长度，需输出小数点和小数位
			if(num<a.length-2) {			
				for (int i = count+2; i < a.length; i++) {
					//当打印长度达到阶数却小于有效数字长度时，打印小数点
					if(count1==num)
					   System.out.print(".");
					System.out.print(a[i]);	
					count1++;
				}					
			}
			
			//若是阶数大于有效数字长度时，打印完有效数字还需打印打印0
			if(a.length-2<num) {
				for(int i=0;i<num-a.length+2;i++)
					System.out.print("0");
			}			
		}
	}
}
