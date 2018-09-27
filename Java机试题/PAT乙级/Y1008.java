package PATY;
import java.util.Scanner;
public class Y1008 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int move =in.nextInt();
        int num2 =2*num;
        int temp2;
        int temp[]=new int[num2];//建立两个长度的数组
        for(int i=0;i<num;i++)
            temp[i]=in.nextInt();
        temp2=num;
        for(int i=0;i<num;i++){//将全部后移move个数
            temp[temp2+move-1]=temp[temp2-1];
            temp2--;
        }
        temp2=move;
        for(int i=0;i<move;i++){//将数组最后面的数置于数组的开始
            temp[temp2-1]=temp[num+temp2-1];
            temp2--;
        }
        int count =0;
        for(int i=0;i<num;i++){
            if(count!=0)
                System.out.print(' ');
            System.out.print(temp[i]);
            count++;
        }
    }
}