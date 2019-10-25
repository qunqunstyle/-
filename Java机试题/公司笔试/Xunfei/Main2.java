package Xunfei;

import java.util.Scanner;

public class Main2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String string[] = s.split(";");
        String s1[] = string[0].split(",");
        String s2[] = string[1].split(",");
        String s3[] = string[2].split(",");
        int x1 = Integer.parseInt(s1[0]);
        int y1 = Integer.parseInt(s1[1]);
        int r1 = Integer.parseInt(s1[2]);
        int x2 = Integer.parseInt(s2[0]);
        int y2 = Integer.parseInt(s2[1]);
        int r2 = Integer.parseInt(s2[2]);
        int x3 = Integer.parseInt(s3[0]);
        int y3 = Integer.parseInt(s3[1]);
        int r3 = Integer.parseInt(s3[2]);
        if(Math.pow(y1-y2,2)+Math.pow(x1-x2,2)<= Math.pow(r1+r2,2))
            System.out.print("红蓝圈相交,");
        else
            System.out.print("红蓝圈不相交,");
        if(Math.pow(y1-y3,2)+Math.pow(x1-x3,2)<= Math.pow(r1+r3,2))
            System.out.print("红绿圈相交,");
        else
            System.out.print("红绿圈不相交,");
        if(Math.pow(y3-y2,2)+Math.pow(x3-x2,2)<= Math.pow(r3+r2,2))
            System.out.print("蓝绿圈相交");
        else
            System.out.print("蓝绿圈不相交");

    }
}
