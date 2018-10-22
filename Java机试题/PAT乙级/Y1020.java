package PATY;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class MoonCake implements Comparable<MoonCake>{
    double repertory,price;
    double averageSelling;

    @Override
    public int compareTo(MoonCake o) {
        averageSelling=price/repertory;
        int result ;
        double temp=this.averageSelling-o.averageSelling;
        if(temp>0.0f)
            result=-1;
        else
            result=1;
        return result;
    }
}
public class Y1020 {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        int type =in.nextInt();
        int allNeed=in.nextInt();
        double price=0.0f;//所有月饼的总售价
        double remain=0;//所有月饼的总库存
        MoonCake[] a=new MoonCake[type];
        Set<MoonCake>set=new TreeSet<>();

        for(int i=0;i<type;i++){
            a[i]=new MoonCake();
            a[i].repertory=in.nextDouble();
            remain+=a[i].repertory;
        }

        for(int i=0;i<type;i++){
            a[i].price=in.nextDouble();
            price+=a[i].price;
            set.add(a[i]);
        }
        in.close();
        if(remain<allNeed)
            System.out.printf("%.2f",price);
        else{
            price=0.0f;
            remain=allNeed;
            for(MoonCake moonCake:set){
                if(remain<moonCake.repertory){
                    price+=moonCake.averageSelling*remain;
                    break;
                }else {
                    price+=moonCake.price;
                    remain-=moonCake.repertory;
                }
            }
        }
        System.out.printf("%.2f",price);
    }
}
