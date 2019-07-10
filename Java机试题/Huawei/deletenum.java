package Huawei;
import java.util.Scanner;
import java.util.Arrays;
public class deletenum {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num >=1000)
            num =999;

        int temp[] = new int [num];
        Arrays.fill(temp,1);
        int count = 0;
        int i = 0;
        L :while(true){
            int all = 0;
            for(int j = 0;j<temp.length;j++){
                all+=temp[j];

            }
            if(all == 1){
                for(int j = 0;j<temp.length;j++){
                    if(temp[j] == 1){
                        System.out.println(j);
                        break L;
                    }

                }
            }

            if(count == 2){
                count =-1;
                temp[i]=0;
            }
            i++;
            if(i<=num-1&temp[i]!=0)
                count++;

            if(i>num-1){
                i=0;
                count = 0;
            }

        }
    }
}
