package Pinduoduo;

import java.util.Scanner;

public class pin1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int offset = in.nextInt();
            int n = in.nextInt();
            int l1 = in.nextInt();
            int  l2 = in.nextInt();
            int l1_open = Math.min(l1,offset);
            int l1_close = Math.min(l1_open+n,l1);
            int l2_open = -1;
            int l2_close = -1;
            if(offset+n<=l1){
                l2_open = l2_close =0;
            }else if(offset + n > l1){
                n = n+offset-l1;
                if(offset>=l1){
                    offset = Math.abs(offset-l1);
                    l2_open = Math.min(l2,offset);
                }else {
                    l2_open = 0;
                }

                l2_close = Math.min(l2_open+n,l2);
            }
            System.out.println(l1_open+" "+l1_close+" "+l2_open+" "+l2_close);
        }
    }
}
