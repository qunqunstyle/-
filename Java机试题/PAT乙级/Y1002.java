//太粗心了，我把大写的NO写成了No，找了快俩小时找不到问题，千万注意
import java.util.Scanner;
public class Y1002
{
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        String n =in.next();
        int sum = 0;
        char temp[] =n.toCharArray();
        for (int i=0;i<temp.length;i++){
            sum += temp[i] -'0';
        }
        String s = String.valueOf(sum);
        char temp1[] = s.toCharArray();
        for(int i=0;i<temp1.length;i++){
            //将判断放到了前面
            if(i!=0)
                System.out.print(' ');
            switch (temp1[i]){
                case '1' :System.out.print("yi");
                    break;
                case '2' :System.out.print("er");
                    break;
                case '3' :System.out.print("san");
                    break;
                case '4' :System.out.print("si");
                    break;
                case '5' :System.out.print("wu");
                    break;
                case '6' :System.out.print("liu");
                    break;
                case '7' :System.out.print("qi");
                    break;
                case '8' :System.out.print("ba");
                    break;
                case '9' :System.out.print("jiu");
                    break;
                case '0' :System.out.print("ling");
                    break;
            }

        }
    }
}
