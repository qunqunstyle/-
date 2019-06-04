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
			return;// 一次全排列
		}
		for (int i = start;i<=end;i++) {
			swap(a, i, start);
			dfs(a, start+1, end);
			swap(a, i, start);//因为修改是对唯一的数组做了修改，为了不影响后续的排列，每一次会递归完成并回到这里时都要将交换复原
		}

	}

	//判断是否符合
	public static boolean judge(int a[]) {
		if (a[1] + a[2] == a[3] && a[4] - a[5] == a[6] && a[7] * a[8] == a[9]
				&& (a[10] / a[11] == a[12] && a[10] % a[11] == 0)) {// 必须判断余数为零
			return true;
		} else {
			return false;
		}
	}
	//交换两个数组值的位置
	public static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
