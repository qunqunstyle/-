#include<iostream>
#include<algorithm>
using namespace std;

int main(){
	
	int t ;                         //分组数目 
	scanf("%d",&t);
	int *size = new int[t];         //定义t大小的一维数组来每个分组的学生数	
	int *average = new int[t];      //每组的平均成绩 
	int **score = new int*[t];      //每个人的成绩，存在一个二位数组中，每一行为一个组的成绩 
	
	for(int i = 0;i<t;i++){
		score[i] = new int [1000];     //动态申请二位数组 
	}
	int *temp = new int[t];         //达标所需总分数 
	int *count = new int[t];        //统计需要的人数
	 
	/*int temp[t];此处申请数组时不可以采用前面的方式，
	这是不合法的，虽然有些编译器是可以通过,比如 DEVC++，
	因为函数栈的要求，就是在函数运行前，分配好所有变量的空间，
	t是不定的，所以不能再运行前，就分配好空间。
	应采用动态申请的方式，在执行的时候，才分配空间，
	这是合法的方式。
	或者将变量定义为const常量 */ 
	
	for(int i=0;i<t;i++){
		scanf("%d %d",&size[i],&average[i]);
		for(int k=0;k<size[i];k++){
			scanf("%d",&score[i][k]);
		}
	}
	//sort排序 ，将成绩数组每一行都从小到大排列 
	for(int i =0;i<t;i++){
		sort(score[i],score[i]+size[i]) ;
	}
	
	for(int i=0;i<t;i++){
		
		count[i] = 0;
		int temp1=0;                   //统计每组所的分数的累加值 
		temp[i] = size[i]*average[i];  
		for(int k=0;k<size[i];k++){
			temp1 += score[i][k];
		}
	while(temp1<temp[i]){
		int j = 0;
		temp1 += (100-score[i][j++]);
		++count[i];
	}
		printf("%d\n",count[i]);
	}
	return 0;
}

