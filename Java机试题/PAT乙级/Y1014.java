package PATY;

import java.util.Scanner;

public class Y1014 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        String one =in.nextLine();
        String two =in.nextLine();
        String three =in.nextLine();
        String four =in.nextLine();
        char one_1[]=one.toCharArray();
        char two_1[]=two.toCharArray();
        char three_1[]=three.toCharArray();
        char four_1[]=four.toCharArray();
        int time=0;
        int count=0;
        Loop:while (time<one_1.length||time<two_1.length){
            if(one_1[time]==two_1[time]){
                if(count==0){
                    switch (one_1[time]){
                        case 'A':System.out.print("MON ");count++;break;
                        case 'B':System.out.print("TUE ");count++;break;
                        case 'C':System.out.print("WED ");count++;break;
                        case 'D':System.out.print("THU ");count++;break;
                        case 'E':System.out.print("FRI ");count++;break;
                        case 'F':System.out.print("SAT ");count++;break;
                        case 'G':System.out.print("SUN ");count++;break;
                        default:break;
                    }
                }else {

                    if(one_1[time]>=48&one_1[time]<57){
                        //emmmm，这个地方输出0加一个数，我一开始输出的是空格，卡了我好久，卧槽，太马虎了
                        System.out.print("0"+one_1[time]+":");break Loop;}
                    if(one_1[time]==57){
                        System.out.print(one_1[time]+":");break Loop;}
                    if(one_1[time]>=65&one_1[time]<=78){
                        //输出是一个ascll码的位数，所以要转成int
                        int temp =one_1[time];
                        System.out.print(temp-55+":");
                        break Loop;
                    }
                }
            }
            time++;
        }
        time=0;
       BOOP: while (time<three_1.length||time<four_1.length){

            if(three_1[time]==four_1[time]){
                //因为不知道是不是只有小写字母有用，我也判断了大写的字符
                if((three_1[time]>=97&three_1[time]<=122)||(three_1[time]>=65&three_1[time]<=90)){
                    if(time<10)
                        System.out.print("0"+time);
                    else
                        System.out.print(time);
                    break BOOP;
                }
            }
            time++;
        }
    }
}