package T360;

import java.util.Scanner;

public class Main1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int temp[][] = new int[N][M];
        int count  = 0;//个数
        int num = 0;//重叠个数
        for(int i = 0; i < N ;i++){
            for(int j = 0; j < M;j++){
                temp[i][j] = in.nextInt();
                count += temp[i][j];
            }
        }
        in.close();
        if(temp[0][0] > 1){
            num +=temp[0][0];
        }
        if(temp[0][0] == 1){
            if(temp[1][0]!=0 ||temp[0][1]!=0)
                num++;
        }
        if(temp[N-1][0] > 1){
            num +=temp[N-1][0];
        }
        if(temp[N-1][0] == 1){
            if(temp[N-2][0]!=0 ||temp[N-1][1]!=0)
                num++;
        }

        if(temp[0][M-1] > 1){
            num +=temp[0][M-1];
        }
        if(temp[0][M-1] == 1){
            if(temp[0][M-2]!=0 ||temp[1][M-1]!=0)
                num++;
        }

        if(temp[N-1][M-1] > 1){
            num +=temp[N-1][M-1];
        }
        if(temp[N-1][M-1] == 1){
            if(temp[N-1][M-2]!=0 ||temp[N-2][M-1]!=0)
                num++;
        }

        for(int i = 1;i<N-1;i++){
            if(temp[i][0]>1){
                num +=temp[i][0];
            }else if(temp[i][0] == 1){
                if(temp[i+1][1] != 0||temp[i-1][0] != 0||temp[i][1] != 0)
                    num++;
            }
            if(temp[i][M-1]>1){
                num +=temp[i][M-1];
            }else if(temp[i][M-1] == 1){
                if(temp[i+1][M-1] != 0||temp[i-1][M-1] != 0||temp[i][M-2] != 0)
                    num++;
            }

        }
        for(int i = 1;i<M-1;i++){
            if(temp[0][i]>1){
                num +=temp[0][i];
            }else if(temp[0][i] == 1){
                if(temp[0][i+1] != 0||temp[0][i-1] != 0||temp[1][i] != 0)
                    num++;
            }
            if(temp[N-1][i]>1){
                num +=temp[N-1][i];
            }else if(temp[N-1][i] == 1){
                if(temp[N-1][i-1] != 0||temp[N-1][i+1] != 0||temp[N-2][i] != 0)
                    num++;
            }

        }
        for(int i = 1; i < N - 1 ;i++){
            for(int j = 1; j < M - 1;j++){
                if(temp[i][j]>1){
                    num +=temp[i][j];
                }else if(temp[i][j] == 1){

                    if(temp[i-1][j] != 0||temp[i+1][j] != 0||temp[i][j-1] != 0||temp[i][j+1] != 0)
                        num++;
                }

            }
        }

        System.out.println(6 * count - num * 2);
    }

}
