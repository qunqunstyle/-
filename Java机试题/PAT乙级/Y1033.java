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
				
				//若存在“+”，则大写的字符都无法输出
				if(up==true) {
					if(two.charAt(i)>='A'&&two.charAt(i)<='Z') {
						type=true;
						break;
					}									
				}
				
				//若是first中存在大写字符，则two中大写小写都无法输出
				if(first.charAt(j)>='A'&&first.charAt(j)<='Z') {
					
					char temp=first.substring(j, j+1).toLowerCase().charAt(0);
					if(two.charAt(i)==first.charAt(j)) {//等于大写，不能输出
						type=true;
						break;
					}else if (two.charAt(i)==temp) {//若是等于小写，也不能输出
						type=true;
						break;
					}
				}
				
				//其他zifu
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
