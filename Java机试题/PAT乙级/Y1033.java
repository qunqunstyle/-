import java.util.Scanner;

public class Y1033 {
	public static void main(String []args) {
		Scanner in=new Scanner(System.in);
		String first=in.nextLine();
		String two=in.nextLine();
		in.close();
		String out="";
		Boolean up=false;
		if(first.contains("+")) {
			 up=true;
		}
		for(int i=0;i<two.length();i++) {
			Boolean type=false;			
			for(int j=0;j<first.length();j++) {
				
				//�����ڡ�+�������д���ַ����޷����
				if(up==true) {
					if(two.charAt(i)>='A'&&two.charAt(i)<='Z') {
						type=true;
						break;
					}									
				}
				
				//����first�д��ڴ�д�ַ�����two�д�дСд���޷����
				if(first.charAt(j)>='A'&&first.charAt(j)<='Z') {
					
					char temp=first.substring(j, j+1).toLowerCase().charAt(0);
					if(two.charAt(i)==first.charAt(j)) {//���ڴ�д���������
						type=true;
						break;
					}else if (two.charAt(i)==temp) {//���ǵ���Сд��Ҳ�������
						type=true;
						break;
					}
				}
				
				//����zifu
				else {
					if(two.charAt(i)==first.charAt(j)) {
						type=true;
						break;
					}
				}		
			}
			if(type==false) {
				out+=two.charAt(i);
			}
		}
		System.out.println(out);		
	}	
}
