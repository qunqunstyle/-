package Sike;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String out = "";
        int time =0;
        boolean isfast = false;
        while (time<s.length()){
            if(s.charAt(0) == '<'){
                System.out.println("");
                break;
            }else {
                if(!isfast && !chack(s,time)){
                    time++;
                    continue;
                }
                if(chack(s,time)){
                    isfast = true;
                    out += s.charAt(time);
                }
                boolean hasnextword = false;
                if(!chack(s,time)){
                    int local =time;

                    while (s.charAt(local)!= '<'){
                        if(chack(s,local))
                            hasnextword = true;
                        local++;
                    }
                    if(hasnextword)
                     out += s.charAt(time);
                }
            }
            if(s.charAt(time) == '<')
                break;
            time++;
        }
        System.out.println(out);
    }
    public static boolean chack(String s,int time){
        if(s.charAt(time)<='Z'&&s.charAt(time)>='A' || s.charAt(time)<='z'&&s.charAt(time)>='a')
            return true;
        else
            return false;
    }
}
