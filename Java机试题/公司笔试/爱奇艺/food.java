

import java.util.Scanner;

//import static java.lang.StrictMath.pow;


public class food {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int P = scan.nextInt();
        int k = 0;
        int food[] = new int[1000];
        //int A[] = new int[1000];
        for (int i = 0; i < N; i++) {
            food[i] = scan.nextInt();
        }

        while (k < M) {
            char input1 = scan.next().charAt(0);
            int input2 = scan.nextInt();
            switch (input1){
                case 'B':food[input2-1]--;
                break;
                case 'A':food[input2-1]++;
                break;
            }
            k++;
        }
        int  aar_index = 1;
        for (int i = 0; i < N; i++) {
            if (food[i] > food[P-1]) {
                aar_index ++;
            }
        }
        System.out.println(aar_index);
    }
}
       /* Scanner scan = new  Scanner(System.in);
        int  split_num = scan.nextInt();
        int  color_num = 4;

        if(split_num >= 1 && color_num>=1){
            double kind = recurve(split_num,color_num);
            System.out.printf ("%.0f",kind);
        }
    }
    public static double recurve (int N,int M){
        double kind_new = 0;
        if(N == 1 && M >=1)
            return M;
        if(N == 2 && M >=2)
            return M*(M-1);
        if(N == 3 && M>=3)
            return M*(M-1)*(M-2);
        if(N >3 && M >=2){
            kind_new= M*pow(M-1,N-1) - recurve(N-1,M);
            //kind_new=recurve(N-1,M)*(M-2) + recurve(N-2,M)*(M-1);
        }
        return kind_new;
    }*/

