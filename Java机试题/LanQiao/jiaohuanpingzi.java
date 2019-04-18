package LanQiao;

import java.util.Scanner;

public class jiaohuanpingzi {
	static int count = 0;
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int start = 0;
		int N = scanner.nextInt();
		int numofBottle[] = new int[N];
		for(int i = 0;i<N;i++) 
			numofBottle[i] = scanner.nextInt();
		scanner.close();
		int time = 0;
		while(start != numofBottle.length) {
			if(numofBottle[time]==time+1) {
				start++;
				time++;
				continue;
			}else {
				change(numofBottle,start, findMin(numofBottle, start));
				time++;
				start++;
			}				
		}
		System.out.println(count);
	}
	
	public static int  findMin(int a[],int start) {
		int min = 10000; 
		int position = 10000;
		for(int i = start;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
				position = i;
			}
		}
		return position;
		
	}
	public static void change(int a[],int key,int value) {
		int temp;
		temp = a[value];
		a[value] = a[key ];
		a[key ] = temp;
		count++;
	}
}
