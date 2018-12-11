
import java.util.Scanner;

public class Y1084 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer(in.next());
		StringBuffer stringBuffer2 =new StringBuffer("");
		int time = in.nextInt();
		in.close();		
		if(time==2)
			System.out.print(stringBuffer+"1");
		else if(time==1)
			System.out.print(stringBuffer);
		else {
			stringBuffer.append(1);
			for(int i=2;i<time;i++) {//第time个，抛开第一个输入值和前面处理的一个
				char one=stringBuffer.charAt(0);
				int count =1;
				
				for(int j=1;j<stringBuffer.length();j++) {
					
					char temp=stringBuffer.charAt(j);
					//若相等且不到最后一位
					if(temp==one&&j!=stringBuffer.length()-1) 
						count++;
					//若相等且到了最后一位
					else if (temp==one&&j==stringBuffer.length()-1) {
						count++;
						stringBuffer2.append(one);
						stringBuffer2.append(count);
					}
					else {//若不相等		
						stringBuffer2.append(one);
						stringBuffer2.append(count);
						if(j==stringBuffer.length()-1) {
							//若不相等且到了最后一位
							stringBuffer2.append(temp);
							stringBuffer2.append(1);
						}
						one =temp;
						count=1;
					}	
				}
				stringBuffer.replace(0, stringBuffer2.length(), stringBuffer2.toString());
				stringBuffer2.delete(0, stringBuffer2.length());
			}
			System.out.print(stringBuffer);
		}
		
	}
}
