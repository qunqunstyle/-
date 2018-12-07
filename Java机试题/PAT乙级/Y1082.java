import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Y1082 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Set <Sportor>set = new TreeSet<>();
		for(int i=0;i<num;i++) {
			Sportor sportor = new Sportor(in.next(), in.nextInt(), in.nextInt());
			set.add(sportor);
		}
		int time=0;
		for (Sportor sportor : set) {		
			if(time==0) 
				System.out.print(sportor.ID);							
			time++;
			if(time==set.size())
				System.out.print(" "+sportor.ID);				
		}

	}

}
class Sportor implements Comparable<Sportor> {
	String ID;
	int  x;
	int y;
	int Radius;

	public Sportor(String id, int x, int y) {
		this.x = x;
		this.y = y;
		this.ID = id;
		Radius =(int)(Math.pow(x, 2)+Math.pow(y, 2));
	}

	@Override
	public int compareTo(Sportor o) {

		return this.Radius-o.Radius;
	}
}