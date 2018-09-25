import java.util.Scanner;

public class Y1006 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int unit_digit;
        int ten_digit;
        int hundred_digit;
        hundred_digit=n/100;      //因为都是整型变量，所以算是取整操作，同时不够三位的话就是为零
        ten_digit=(n%100)/10;     //先对100取余，剩下两位，在对10取整
        unit_digit=n%10;          //直接对10取余
        for(int i=0;i<hundred_digit;i++)
            System.out.print('B');
        for(int i=0;i<ten_digit;i++)
            System.out.print('S');
        for(int i=0;i<unit_digit;i++)
            System.out.print(i+1);
    }
}
