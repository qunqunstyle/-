package LanQiao;

public class hanjiazuoye {
	static int count = 0;

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		dfs(a,0,12);
		System.out.println(count);

	}

	public static void dfs(int[] a, int start, int end) {
		if (start == end) {
			if (judge(a))
				count++;
			return;// һ��ȫ����
		}
		for (int i = start;i<=end;i++) {
			swap(a, i, start);
			dfs(a, start+1, end);
			swap(a, i, start);//��Ϊ�޸��Ƕ�Ψһ�����������޸ģ�Ϊ�˲�Ӱ����������У�ÿһ�λ�ݹ���ɲ��ص�����ʱ��Ҫ��������ԭ
		}

	}

	//�ж��Ƿ����
	public static boolean judge(int a[]) {
		if (a[1] + a[2] == a[3] && a[4] - a[5] == a[6] && a[7] * a[8] == a[9]
				&& (a[10] / a[11] == a[12] && a[10] % a[11] == 0)) {// �����ж�����Ϊ��
			return true;
		} else {
			return false;
		}
	}
	//������������ֵ��λ��
	public static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
