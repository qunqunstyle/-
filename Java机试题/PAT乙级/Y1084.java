
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
			for(int i=2;i<time;i++) {//��time�����׿���һ������ֵ��ǰ�洦���һ��
				char one=stringBuffer.charAt(0);
				int count =1;
				
				for(int j=1;j<stringBuffer.length();j++) {
					
					char temp=stringBuffer.charAt(j);
					//������Ҳ������һλ
					if(temp==one&&j!=stringBuffer.length()-1) 
						count++;
					//������ҵ������һλ
					else if (temp==one&&j==stringBuffer.length()-1) {
						count++;
						stringBuffer2.append(one);
						stringBuffer2.append(count);
					}
					else {//�������		
						stringBuffer2.append(one);
						stringBuffer2.append(count);
						if(j==stringBuffer.length()-1) {
							//��������ҵ������һλ
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
