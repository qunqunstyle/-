// 0 ~ 1背包问题
//先推到其公式:F[i][j] = max(F[i-1][j],F[i-1][j-w[i]]+v[i])
/*定性：这实际是一个动态规划问题，F这个函数代表，当背包有j空间时，你可以选择i个物品放入，怎么放，价值最高*/
/*然后缩小范围，可以理解为F[i-1][j](不取第i个)，F[i-1][j-w[i]]+v[i](取第i个)*/
/*这就是典型的动态规划问题，划分子区间的问题*/
//#include<cstring>
#include<cstdio>
#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	//之所以设置长度是六，我是为了和底下的6*11（第一行和第一列均为0）的二维数组对应，第一个元素设置为0
	int value[6];//价值数组
	int weight[6];//重量数组
	
	int m;
	scanf("%d,%d,%d,%d,%d",&value[1],&value[2],&value[3],&value[4],&value[5]);
	scanf("%d,%d,%d,%d,%d",&weight[1],&weight[2],&weight[3],&weight[4],&weight[5]);
	cin>>m;
	
	//定义一个二维数组 dp[][],存放总价值
	int **dp;
	dp = new int*[6]; //定义了6行
	
	//这里是动态申请数组，每一行都是定值。其实也可以直接一开始就申请dp[6][11],然后memset（A，0，sizeof（A）），全部初始化为零;
	for(int i =0;i<=5;i++)
	{
		dp[i] = new int [m+1];//每一行都是在背包容量从0开始，到m，容量是m+1 
	}
	
	//初始化第一列为0
	for(int i =0;i<=5;i++)
	{
		dp[i][0] = 0;
	}
	//初始化第一行为0
	for(int j = 0;j<=m;j++)
	{
		dp[0][j] = 0;
	}
	
	//执行动态规划，自小到大计算，生成，value表
	for(int i = 1;i<=5;i++)
	{
		for(int j = 1;j<=m;j++)
		{
			if(j<weight[i])
			{
				//当背包的重量小于当前物品的重点时，则沿用上一行的value值
				dp[i][j] = dp[i-1][j];
			}
			else
			{
				//否则便进行计算，分两种情况，不包含i和包含i， 非一既零原则。
				//计算两种情况中较大的值，物品数从少到多进行计算
				//因为类似于斐波那契数列，前面会用到后面的值，故采用自底向上的计算方法
				//计算公式：F[i][j] = max(F[i-1][j],F[i-1][j-w[i]]+v[i])
				dp[i][j] = max(dp[i-1][j],dp[i-1][j - weight[i]]+value[i]);
			}
		}
	}
	cout<<dp[5][m]<<endl;
	return 0;
	
}
