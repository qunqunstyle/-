import java.util.Scanner;

public class Y1090 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String[][] num=new String[n][2];
        //成对不相容物品
        for (int i = 0 ; i < n ; i++){
            num[i][0]=in.next();
            num[i][1]=in.next();
        }
        //货物清单
        String[][] menu=new String[m][2];
        for (int i = 0; i < m ; i++){
            menu[i][0]=in.next();
            menu[i][1]=in.nextLine();
        }
        in.close();
        
        //判断是否存在不相容物品对
       for (int j = 0 ; j < m ; j++){
           bgn:for (int i = 0 ; i < n ; i++){
        	   int time =menu[j][1].trim().split(" ").length;
        	   String menu1[] =menu[j][1].trim().split(" ");
               bgm:for (int k = 0 ; k < time ; k++){
                    if (num[i][0].equals(menu1[k])){
                        for (int l = 0 ; l < time ; l++){
                            if(num[i][1].equals(menu1[l])){
                                System.out.println("No");
                                break bgn;
                            }
                        }
                    }else if (i==n-1){
                        System.out.println("Yes");
                        break bgn;
                    }
                }
            }
        }
    }
}
