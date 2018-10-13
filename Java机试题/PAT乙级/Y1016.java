package PATY;

import java.util.Scanner;
public class Y1016 {
    public static void main(String []args) {

        Scanner in = new Scanner(System.in);
        String A = in.next();
        int DA =in.nextInt();
        String B =in.next();
        int DB =in.nextInt();
        int PA=0,countA=0;
        int PB=0,countB=0;
        for(int i=0;i<A.length();i++){
            if((A.charAt(i)-48)==DA){
                countA++;
                if(countA==1)
                    PA+=DA;
                else
                    PA=PA*10+DA;

            }
        }
        for(int i=0;i<B.length();i++) {
            if ((B.charAt(i) - 48) == DB) {
                countB++;
                if (countB == 1)
                    PB += DB;
                else
                    PB = PB*10+DB;
            }
        }
        System.out.println(PA+PB);
    }
}
