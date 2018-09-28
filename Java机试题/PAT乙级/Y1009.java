package PATY;
import java.util.Scanner;

public class Y1009 {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String[] str = string.split(" ");//按照空格将输入的字符串进行拆解成字符串数组
        for(int i=str.length-1;i>=0;i--){
            if(i!=str.length-1)
                System.out.print(' ');
            System.out.print(str[i]);
        }
    }
}