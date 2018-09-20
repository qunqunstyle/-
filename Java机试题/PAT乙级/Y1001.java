//太粗心了，我把大写的NO写成了No，找了快俩小时找不到问题，千万注意
import java.util.Scanner;
public class Y1001
{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();//输入的正整数n
        int count=0;
        while (n!=1){
            if(n%2==0)
                n/=2;
            else
                n=(3*n+1)/2;
            count++;
        }
        System.out.println(count);
    }
}
