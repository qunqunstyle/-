import java.util.Scanner;

public class Y1086 {
	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		int A =in.nextInt();
		int B =in.nextInt()*A;
		in.close();
		String outPut =B+"";
		Boolean temp=false;
		for(int i=outPut.length()-1;i>=0;i--) {
			if(outPut.charAt(i)!='0')
				temp=true;
			if(temp)
			   System.out.print(outPut.charAt(i));
		}
	}
}
