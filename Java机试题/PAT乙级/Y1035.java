
import java.util.Arrays;
import java.util.Scanner;
public class Y1035 {
 
    public static void main(String[] args) throws Exception {
    	Scanner inScanner = new Scanner(System.in);
    	int n =inScanner.nextInt();
    	int [] a =new int[n];
    	int [] b =new int[n];
    	for(int i=0;i<n;i++)
    		a[i]=inScanner.nextInt();
    	for(int i=0;i<n;i++)
    		b[i]=inScanner.nextInt();
    	inScanner.close();

        int i = 0;
        //判断排好序的位置
        for (; b[i] <= b[i + 1] && i < n; i++);
        boolean isInsert = true;
        for (int j = i + 1; j < n; j++) {
        	//判断排好序的位置的后面开始，a与b是不是每一位都相同，若出现不相同，则不是插入排序
            if (a[j] != b[j]) {
                isInsert = false;
                break;
            }
        }
        if (isInsert) {
            System.out.println("Insertion Sort");
            //再加一个数字进行排序
            sort(a, 0, i + 1);
        } else {
            System.out.println("Merge Sort");
            //从a开始执行归并排序，当与b一样时，再执行一次
            int k = 1;
            boolean flag = false;
            while (flag == false) {
            	//当a==b时，再执行一次，下一次判断时跳出
                flag = Arrays.equals(a, b);              
                k = k * 2;
                int p = 0;
                for (p = 0; p < n / k; p++)
                	//p是分成的一个一个小组，k是每个组的成员个数
                	//一组的起始是p * k，结束是下一组的开始位置减一
                    sort(a, p * k, (p + 1) * k - 1);
                //分完组后剩下的不够的做一次分组内的归并
                //开始是 n / k * k（组数*长度），结束是到数组的最后
                sort(a, n / k * k, n - 1);
            }
        }
        for (int k = 0; k < n ; k++) {
        	if(k!=0)
        		System.out.print(" ");
        	System.out.print(a[k]);
        }
    }
    
    public static void sort(int[] a, int from, int to) {
        for (int i = from; i < to; i++) {
            for (int j = i + 1; j <= to; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
