package LanQiao;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class jianyoupiao {

		/**
		 * 思路1：枚举<a, b, c, d, e>五元组合，保证a<b<c<d<e。判断abcde是否连在一起。
			集合S = {第1张}, 集合T = {其余4张}
			for i = 0 … 3:
			  for j in T: 
			    if 第j张与S中某张相连 then S = S + {第j张}, T = T – {第j张}
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
		 * adj方法：判断x和y数字是否相邻
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
		 * 判断枚举的五个数是否都满足连在一起
		 * @return
		 */
		public static boolean check(){
			Set<Integer>set=new ConcurrentSkipListSet<Integer>();
			//使用ConcurrentSkipListSet,是因为在foreach遍历时，set集合会被修改，不能使用HashSet
			set.add(a[0]);
			for(int i=0;i<4;i++){//这个循环搞不懂为什么存在？，第一层
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

