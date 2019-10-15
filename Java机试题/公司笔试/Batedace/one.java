package Batedace;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        boolean has = false;
        sc.close();
        if(Math.abs(l-r)<=2)
            System.out.println("NO");
        else {
          L:  for(int i = l;i<=r-2;i++){
                int one = i;
                int three = r;
                for(int j =r-i;j<=r-1;j++){
                    if(one < j + three && j <one +three&&three<one+j){
                        has = true;
                        System.out.println("YES");
                        System.out.println(one+" "+j+" "+three);
                        break L;
                    }
                }
            }


            if(!has)
                System.out.println("NO");
        }

    }
}
