
import java.util.Scanner;

public class Y1031 {
	public static void main(String []args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int value[]= {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};//定义权值数组
		char ZtoM[]= {'1','0','X','9','8','7','6','5','4','3','2'};//z到校验码M的对应值
		int time=0;
		Boolean isprint=false;
	    Loop:while (time<num) {
	    	time++;	
	    	int count=0;//计算权值相乘的和
	    	String string =in.next();
	    	if(time==num)
	    		in.close();
	    	for(int i=0;i<17;i++) {
	    		if(string.charAt(i)<='9'&&string.charAt(i)>='0')
	    		    count+=(string.charAt(i)-'0')*value[i];
	    		else {
					System.out.println(string);
					isprint=true;
					continue Loop;//跳出本次while进入下一次，不执行下面的代码
				}
	    	}
	    	int z=count%11;//取模得到z的值
	    	if(string.charAt(17)!=ZtoM[z]) {
	    		isprint=true;
	    		System.out.println(string);
	    	} 			    	
		}
		in.close();
		if(isprint==false)//若是没有输出过错误信息，则输出全对
			System.out.println("All passed");		
	}
}
