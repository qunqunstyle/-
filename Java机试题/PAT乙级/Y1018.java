package PATY;

import java.util.Scanner;

public class Y1018 {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int num =in.nextInt();
        int time=0;
        int C1=0,J1=0,B1=0,C2=0,J2=0,B2=0;
        int Ce1=0,Je1=0,Be1=0,Ce2=0,Je2=0,Be2=0;
        int win1=0,lose1=0,equl1=0,win2=0,lose2=0,equl2=0;
        String JIA;
        String YI;
        while (time<num){
            JIA=in.next();
            YI =in.next();
            int diff=JIA.charAt(0)-YI.charAt(0);
            if(diff=='C'-'B'){
                B2++;lose1++;win2++;
            }
            if(diff=='B'-'C'){
                B1++;lose2++;win1++;
            }
            if(diff=='J'-'B'){
                J1++;lose2++;win1++;
            }
            if(diff=='B'-'J'){
                J2++;lose1++;win2++;
            }
            if(diff=='J'-'C'){
                C2++;lose1++;win2++;
            }
            if(diff=='C'-'J'){
                C1++;lose2++;win1++;
            }
            if(diff==0){
                if(JIA.charAt(0)=='C'){
                    Ce1++;Ce2++;equl1++;equl2++;
                }
                if(JIA.charAt(0)=='J'){
                    Je1++;Je2++;equl1++;equl2++;
                }
                if(JIA.charAt(0)=='B'){
                    Be1++;Be2++;equl1++;equl2++;
                }
            }
            time++;
        }
        System.out.println(win1+" "+equl1+" "+lose1);
        System.out.println(win2+" "+equl2+" "+lose2);

        char temp='B';
        int max=B1;
        if(C1>max){
            temp='C';
            max=C1;
        }
        if(J1>max){
            temp='J';
        }
        System.out.print(temp+" ");
        temp ='B';
        max=B2;
        if(C2>max){
            temp='C';
            max=C2;
        }
        if(J2>max){
            temp='J';
        }
        System.out.print(temp);


    }
}
