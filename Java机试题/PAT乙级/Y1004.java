

import java.util.Arrays;
import java.util.Scanner;

class P implements Comparable<P>{

    String name,id;
    int score;
    /*public P(String name,String id,int score){
        this.score =score;
        this.id = id;
        this.name =name;
    }*/
    public  int compareTo(P p){
        return this.score-p.score;
    }
}
public class Y1004{
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        P[] a =new P[n];
        for (int i=0;i<n;i++){
            a[i]=new P();
        }
        for(int i=0;i<n;i++){
            a[i].name=in.next();
            a[i].id=in.next();
            a[i].score=in.nextInt();
        }
        Arrays.sort(a,0,n);
        System.out.println(a[n-1].name+' '+a[n-1].id);
        System.out.println(a[0].name+' '+a[0].id);

    }
}
