
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Y1028 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int N =in.nextInt();
		int date[]=new int[10];
		System.out.println(date.length);

		Set<Person> set =new TreeSet<>();
		for(int i=0;i<N;i++) {
			Person person=new Person(in.next(), in.next());
			if(person.type==true)
				set.add(person);
		}
		in.close();
		System.out.print(set.size());
		int time=0;
		for (Person person : set) {		
			if(time==0) 
				System.out.print(" "+person.name);							
			time++;
			if(time==set.size())
				System.out.print(" "+person.name);				
		}
	}

}
class Person implements Comparable<Person>{
	String name;
	String date;
	int year;
	int month;
	int day;
	boolean type =true;
	public Person(String name,String date) {
		this.name=name;
		this.date=date;
		String Array[]=date.split("/");
		year=Integer.parseInt(Array[0]);
		month=Integer.parseInt(Array[1]);
		day=Integer.parseInt(Array[2]);
		if(year<1814||year>2014)
			type=false;
		else {
			if(year==1814) {
				if(month<9)
					type=false;
				else {
					if(month==9) {
						if(day<6)
							type=false;
					}
				}
			}
		}	
	}
	@Override
	public int compareTo(Person o) {
		int result=this.year-o.year;		
		if(result!=0)
			return result;
		else {
			result=this.month-o.month;
			if(result!=0)
				return result;
			else {
				result=this.day-o.day;
				return result;
			}
		}		
	}
}

