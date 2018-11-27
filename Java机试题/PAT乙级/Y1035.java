
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
        //�ж��ź����λ��
        for (; b[i] <= b[i + 1] && i < n; i++);
        boolean isInsert = true;
        for (int j = i + 1; j < n; j++) {
        	//�ж��ź����λ�õĺ��濪ʼ��a��b�ǲ���ÿһλ����ͬ�������ֲ���ͬ�����ǲ�������
            if (a[j] != b[j]) {
                isInsert = false;
                break;
            }
        }
        if (isInsert) {
            System.out.println("Insertion Sort");
            //�ټ�һ�����ֽ�������
            sort(a, 0, i + 1);
        } else {
            System.out.println("Merge Sort");
            //��a��ʼִ�й鲢���򣬵���bһ��ʱ����ִ��һ��
            int k = 1;
            boolean flag = false;
            while (flag == false) {
            	//��a==bʱ����ִ��һ�Σ���һ���ж�ʱ����
                flag = Arrays.equals(a, b);              
                k = k * 2;
                int p = 0;
                for (p = 0; p < n / k; p++)
                	//p�Ƿֳɵ�һ��һ��С�飬k��ÿ����ĳ�Ա����
                	//һ�����ʼ��p * k����������һ��Ŀ�ʼλ�ü�һ
                    sort(a, p * k, (p + 1) * k - 1);
                //�������ʣ�µĲ�������һ�η����ڵĹ鲢
                //��ʼ�� n / k * k������*���ȣ��������ǵ���������
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
