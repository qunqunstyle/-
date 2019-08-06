package Huawei;

import java.util.Scanner;
//牛客题目   询问更新成绩
public class Main4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int N = in.nextInt();
			int M = in.nextInt();
			int grade [] = new int[N+1];
			for(int i = 1;i<=N;i++) 
				grade [i] = in.nextInt();
			for(int i = 0;i<M;i++) {
				String motion = in.next();
				int A =in.nextInt();
				int B =in.nextInt();
				if(motion.equals("Q"))
					ask(grade,A,B);
				else 
					grade[A] =B;				
			}							
		}
	}
	public static void ask(int grade[],int A,int B) {
		int temp = -1;
		int head,end;
		if(A<B) {
			head = A;
			end = B;
		}else {
			head = B;
			end = A;
		}
			
		for(int i = head;i<=end;i++) {
			if(grade[i]>temp)
				temp = grade[i];
		}
		System.out.println(temp);
	}
  
}
