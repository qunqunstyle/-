import java.util.Scanner;

public class Y1028_change {
	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		String name,date;
	    int year, month, day, count = 0;
	    int maxyear = 0, maxmonth = 0, maxday = 0, minyear = 9999, minmonth = 9999, minday = 9999;
	    String maxname = null, minname = null;
	    for (int i = 0; i < n; i++) {
	        name =in.next();
	        date=in.next();
	        String Array[]=date.split("/");
			year=Integer.parseInt(Array[0]);
			month=Integer.parseInt(Array[1]);
			day=Integer.parseInt(Array[2]);
	        if((year < 2014 || (year == 2014 && month < 9) || (year == 2014 && month == 9 && day <= 6)) &&
	           (year > 1814 || (year == 1814 && month > 9) || (year == 1814 && month == 9 && day >= 6))) {
	            count++;
	            if(year > maxyear || (year == maxyear && month > maxmonth) || (year == maxyear && month == maxmonth && day > maxday)) {
	                maxyear = year;
	                maxmonth = month;
	                maxday = day;
	                maxname = name;
	            }
	            if(year < minyear || (year == minyear && month < minmonth) || (year == minyear && month == minmonth && day < minday)) {
	                minyear = year;
	                minmonth = month;
	                minday = day;
	                minname = name;
	            }
	        }
	    }
	    System.out.print(count);
	    if(count!=0)
	    	System.out.printf(" "+minname+" "+maxname);
	}
	
}
