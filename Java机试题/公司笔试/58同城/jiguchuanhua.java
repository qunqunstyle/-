
import java.util.Scanner;

public class jiguchuanhua {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int step = b;
        ringQuit1(a,step);
    }

    public static void ringQuit1(int a,int step){
        int tempStep=0;
        int[] ringArray =new int[a];
        for(int i= 0;i<a;i++){
            ringArray[i]=i+1 ;
        }
        int leftLength=ringArray.length;
        while(leftLength>=0){
            for(int i=0;i<ringArray.length;i++){
                if(ringArray[i]>0){
                    tempStep++;
                    if(tempStep==step){
                        System.out.print(ringArray[i]+" ");
                        tempStep=0;
                        ringArray[i]=-1;
                        leftLength--;
                    }
                }
            }
        }
    }

}

