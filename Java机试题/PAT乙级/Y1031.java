
import java.util.Scanner;

public class Y1031 {
	public static void main(String []args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int value[]= {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};//����Ȩֵ����
		char ZtoM[]= {'1','0','X','9','8','7','6','5','4','3','2'};//z��У����M�Ķ�Ӧֵ
		int time=0;
		Boolean isprint=false;
	    Loop:while (time<num) {
	    	time++;	
	    	int count=0;//����Ȩֵ��˵ĺ�
	    	String string =in.next();
	    	if(time==num)
	    		in.close();
	    	for(int i=0;i<17;i++) {
	    		if(string.charAt(i)<='9'&&string.charAt(i)>='0')
	    		    count+=(string.charAt(i)-'0')*value[i];
	    		else {
					System.out.println(string);
					isprint=true;
					continue Loop;//��������while������һ�Σ���ִ������Ĵ���
				}
	    	}
	    	int z=count%11;//ȡģ�õ�z��ֵ
	    	if(string.charAt(17)!=ZtoM[z]) {
	    		isprint=true;
	    		System.out.println(string);
	    	} 			    	
		}
		in.close();
		if(isprint==false)//����û�������������Ϣ�������ȫ��
			System.out.println("All passed");		
	}
}
