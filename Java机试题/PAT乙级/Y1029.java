import java.util.Scanner;

public class Y1029 {
	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		String A =in.nextLine();
		String B =in.nextLine();
		String out ="我";
		for(int i=0;i<A.length();i++) {
			String temp=A.substring(i, i+1);
			//当是大写字母时，需匹配这个字母的大写和小写在B中是否存在
			if(temp.charAt(0)<='Z'&&temp.charAt(0)>='A') {
				//将这个字符转成小写
				String temp1=temp.toLowerCase();
				if(B.contains(temp)==false&&B.contains(temp1)==false) {	
					//若不存在加入输出队列
					if(out.contains(temp)==false&&out.contains(temp1)==false) {
						out+=temp;
						System.out.print(temp.charAt(0));
					}
				}
					
			}
			//当是小写字母时，需匹配这个字母的大写和小写在B中是否存在
			else if(temp.charAt(0)<='z'&&temp.charAt(0)>='a') {
				String temp1=temp.toUpperCase();
				if(B.contains(temp)==false&&B.contains(temp1)==false)
					//若不存在加入输出队列
					if(out.contains(temp)==false&&out.contains(temp1)==false) {
						out+=temp1;
						System.out.print(temp1.charAt(0));
					}
			}
			else {
				//其他字符时，只需要判断是否存在
				if(B.contains(temp)==false) {
					if(out.contains(temp)==false) {
						out+=temp;
						System.out.print(temp.charAt(0));
					}
				}

			}
		}
		//也可以只输出out的第一个字符之后的字符串，这样就不需要在每一个判断中单独输出
		//out =out.substring(1);
		//System.out.print(out);
	}

}
