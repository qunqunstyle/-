//太粗心了，我把大写的NO写成了No，找了快俩小时找不到问题，千万注意
import java.util.Scanner;
public class Y1003
{
    public static void main(String []args){
        //这是个规律推导题，P和T有且只能有一个，若出现这样的 1P2T3 ，则A的个数为1*2=3
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        String input[]=new String[n];
        String output[]=new String[n];
        for(int i =0;i<n;i++) {
            input[i] = in.next();
            int count1=0;
            int count2=0;
            int count3=0;
            int countP=0;
            int countT=0;
            int mark =0;
            char temp[] = input[i].toCharArray();
            for (int k = 0; k < temp.length; k++) {
                mark++;//标记是否符合小循环内的要求，没有跳出
                if(temp[k]!='P'&&temp[k]!='A'&&temp[k]!='T'){
                    output[i]="NO";
                    break;
                }
                if(temp[k]=='P'){
                    countP++;
                    if(countT==1&&countP==0){
                        //T在P前面出现的话，输入错误
                        output[i]="NO";
                        break;
                    }
                    if (countP==2){
                        //P出现两次，输入错误
                        output[i]="NO";
                        break;
                    }

                }
                if(temp[k]=='T'){
                    countT++;
                    if(countP==0||count2==0){
                        //T前面没有出现P和A的话，输入错误
                        output[i]="NO";
                        break;
                    }
                    if (countT==2){
                        //T出现两次，错误
                        output[i]="NO";
                        break;
                    }
                }
                if(temp[k]=='A'){
                    if(countP==0){
                        count1++;
                    }
                    if(countP==1&&countT==0){
                        count2++;
                    }
                    if(countT==1){
                        count3++;
                    }
                }
            }
            //count2不能为零
            if(count1*count2==count3&&count2!=0)
                output[i]="YES";
            if(mark==temp.length&&count1*count2!=count3)
                output[i]="NO";
        }
        for(int i=0;i<n;i++)
            System.out.println(output[i]);
    }
}
