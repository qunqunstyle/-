package LanQiao;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class jianyoupiao {

		/**
		 * ˼·1��ö��<a, b, c, d, e>��Ԫ��ϣ���֤a<b<c<d<e���ж�abcde�Ƿ�����һ��
			����S = {��1��}, ����T = {����4��}
			for i = 0 �� 3:
			  for j in T: 
			    if ��j����S��ĳ������ then S = S + {��j��}, T = T �C {��j��}
		 * @param args
		 */
		static int a[]=new int[5];
		static int ants=0;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			dfs(0,0);
			System.out.println(ants);
		}
		/**
		 * adj�������ж�x��y�����Ƿ�����
		 * @param x
		 * @param y
		 * @return
		 */
		public static boolean adj(int x,int y){
			if(x>y){
				int t=x;
				x=y;
				y=t;
			}
			if(y-x==4||(y-x==1&&x%4!=0)) return true;
			return false;
		}
		/**
		 * �ж�ö�ٵ�������Ƿ���������һ��
		 * @return
		 */
		public static boolean check(){
			Set<Integer>set=new ConcurrentSkipListSet<Integer>();
			//ʹ��ConcurrentSkipListSet,����Ϊ��foreach����ʱ��set���ϻᱻ�޸ģ�����ʹ��HashSet
			set.add(a[0]);
			for(int i=0;i<4;i++){//���ѭ���㲻��Ϊʲô���ڣ�����һ��
				for(int k=1;k<5;k++){
					for(int x:set){
						if(adj(a[k],x)) set.add(a[k]);
					}
				}
			}
			return set.size()==5;
		}
		public static void dfs(int x,int pre){
			if(x==5){
				if(check()) ants++;
				return ;
			}
			for(int i=pre+1;i<=12;i++){
				a[x]=i;
				dfs(x+1,i);
			}
		}
	 
	}

