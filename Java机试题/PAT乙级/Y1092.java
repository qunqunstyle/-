import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Y1092 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String one = in.readLine();
		String two[] = one.split(" ");
		int N = Integer.parseInt(two[0]);
		int M = Integer.parseInt(two[1]);
		Count[] counts = new Count[N];
		for (int i = 0; i < N; i++) {
			counts[i] = new Count();
			counts[i].index = i + 1;
		}		
		String[] input = new String[M];
		for (int i = 0; i < M; i++) {
			input[i] = in.readLine();
		}
		in.close();
		//累加计算每个种类的销售量
		for (int i = 0; i < M; i++) {//行
			String[] temp = input[i].split(" ");
			for (int j = 0; j < N; j++) {//列
				counts[j].count += Integer.parseInt(temp[j]);
			}
		}
		Arrays.sort(counts);//按照自定义的排序规则排列
		System.out.println(counts[0].count);
		System.out.print(counts[0].index);
		int last = counts[0].count;
		for (int i=1;i<counts.length;i++) {
			if (last == counts[i].count) {//若与前面的值相等，则输出
				System.out.print(" ");
				System.out.print(counts[i].index);
			}else 
				break;		
		}
	}
}

class Count implements Comparable<Count> {
	int index;
	int count;
	public int compareTo(Count p) {
		int result = this.count - p.count;
		if (result != 0)
			return -result;//从大到小排列
		else {
			return this.index - p.index;//从小到大排列
		}
	};
}
