package LanQiao;

import java.util.Scanner;

public class quqiuboyi {
	static int ns[] = new int[3];//��ȡ��Ŀ
	static int xs[] = new int[5];//��ʼ������
	static char dp[][][] = new char[2][1000][1000];//��̬�滮�������飬���������ҷ���A�������������B������������������Ľ��
	
	//���������Сֵ
	public static int min(int a[]) {
		int min=9999;
		for (int i : a) {
			if (min>i) {
				min=i;
			}
		}
		return min;
	}
	 //�������A�������������B�����������,��������
	static char dfs(int p,int Aown,int Bown,int totoalNum){
		int min = min(ns);//��ȡ��������Сֵ
		int rest = totoalNum - Aown - Bown;//��ǰ���г���ʣ��������������-Aӵ������-Bӵ�е�����
		if (dp[p][Aown][Bown] != '\u0000') {//java��char�������û�г�ʼ������\u0000 ��һ���ո�
			return dp[p][Aown][Bown];//��̬�滮������Ѿ����������ʼ��������ֱ�ӷ��ؼ���
		}
		if (rest < min) {//�����С��ȡ2����������ֻ��1������˫����������ȥ����ʼ����Ӯ
			if (Aown % 2 == 1 && Bown % 2 == 0) {//���A��Bż����Ӯ��ע��+��ʾ����AӮ�������
				dp[p][Aown][Bown] = '+';  
			}
			else if (Aown % 2 == 0 && Bown % 2 == 1) {//A�����
				dp[p][Aown][Bown] = '-';
			}else {
				dp[p][Aown][Bown] = '0';
			}
			return dp[p][Aown][Bown];
		}
		
		if (p==0) {//�����ǰ�ֵ�����Aȡ��
			boolean iseq = false;//�ж��Ƿ��к͵Ŀ���
			for (int i = 0; i < ns.length; i++) {//������ȡ������
				if (rest >= ns[i]) { //�������ȡ�������С��ȡ2����������ֻ��1�����Ͳ���ȡ��ns[i] �ǵ�ǰ�ڳ��Ե�ȡ����
					if (dfs(1, Aown + ns[i], Bown,totoalNum)=='+') {//�Խ�������ȡ����б�����ֻҪ�ҵ�һ��ȡ�򷽷�ʹ��AӮ����ôA����Ӯ
						return dp[0][Aown][Bown] = '+';
					}else if (dfs(1, Aown + ns[i], Bown,totoalNum) == '0') {//����ҵ��ܺ͵ľ��棬�����ܺ�
						iseq = true;
					}
				}
			}
			//forѭ�������������ߵ������Ѿ��϶�����Ӯ
			if (iseq) //���Ժ;֣����Ƿ����ܺ�
				dp[0][Aown][Bown] = '0';
			else 
				dp[0][Aown][Bown] = '-';
			
		}
		if (p==1) {//����ֵ�����Bȡ��
			boolean iseq = false;
			for (int i = 0; i < ns.length; i++) {
				if (rest >= ns[i]) { //�������ȡ�������С��ȡ2����������ֻ��1�����Ͳ���ȡ��ns[i] �ǵ�ǰ�ڳ��Ե�ȡ����
					if (dfs(0, Aown , Bown+ ns[i],totoalNum)=='-') {//ֻҪ��A�ı����������ҵ�һ������ľ��棬��A�ͻ��䣬��Ϊ���������ȡ��
						return dp[1][Aown][Bown] = '-';
					}else if (dfs(0, Aown , Bown+ ns[i],totoalNum) == '0') {//���Ƿ��ܺ�
						iseq = true;
					}
				}
			}			//�ߵ������Ѿ�����Ӯ�����Ƿ��ܺ�
			if (iseq) 
				dp[1][Aown][Bown] = '0';
			else 
				dp[1][Aown][Bown] = '+';
			
		}
		return dp[p][Aown][Bown];
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < ns.length; i++) {
			ns[i] = scanner.nextInt();
		}
		for (int i = 0; i < xs.length; i++) {
			xs[i] = scanner.nextInt();
		}
		scanner.close();
		int k;
		for (int i = 0; i < xs.length; i++) {
			dp = new char[2][1000][1000];//ÿ���¿�һ��Ҫ���³�ʼ��dp����
			k = dfs(0, 0, 0,xs[i]);
			System.out.print((char)k + " ");
		}
	}
}
