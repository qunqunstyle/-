package Xunfei;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String s[] = string.split(";");
        int num = Integer.parseInt(s[0]);
        int row = s[1].length()/num;
        if(s[1].length()%num >= 1)
            row++;
        char out [][] =new char[row][num];
        Arrays.fill(out[row-1],';');
        int time = 0;
        L :for(int i = 0;i<row;i++){
            for(int j = 0;j<num;j++){
                if(time > s[1].length()-1)
                    break L;
                out[i][j] = s[1].charAt(time);
                time++;
            }
        }
        for(int i = 0;i<num;i++){
            for(int j = 0;j<row;j++){
                if(out[j][i] == ';'&& i== num-1)
                    break;
                if(out[j][i] == ';'&& i!= num-1)
                    System.out.print(" ");

                else
                   System.out.print(out[j][i]);
            }
        }
    }
}
