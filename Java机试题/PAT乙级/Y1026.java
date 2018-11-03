import java.util.Scanner;

class Y1026{						
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		double c1=in.nextInt();
		double c2=in.nextInt();
		in.close();
		double time =c2-c1;
		time =Math.round(time/100);//四舍五入取整
		int hour =(int)time/3600;
		int minute =((int)time-hour*3600)/60;
		int second =(int)time%60;
		//转为String型，使用String.format("%02d", hour);将之不足两位用0填充
		String hour1 =String.format("%02d", hour);
		String minute1 =String.format("%02d", minute);
		String second1 =String.format("%02d", second);
		System.out.println(hour1+":"+minute1+":"+second1);		
	}
}

