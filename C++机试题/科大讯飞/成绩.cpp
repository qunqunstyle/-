#include<iostream>
#include<algorithm>
using namespace std;

int main(){
	
	int t ;                         //������Ŀ 
	scanf("%d",&t);
	int *size = new int[t];         //����t��С��һά������ÿ�������ѧ����	
	int *average = new int[t];      //ÿ���ƽ���ɼ� 
	int **score = new int*[t];      //ÿ���˵ĳɼ�������һ����λ�����У�ÿһ��Ϊһ����ĳɼ� 
	
	for(int i = 0;i<t;i++){
		score[i] = new int [1000];     //��̬�����λ���� 
	}
	int *temp = new int[t];         //��������ܷ��� 
	int *count = new int[t];        //ͳ����Ҫ������
	 
	/*int temp[t];�˴���������ʱ�����Բ���ǰ��ķ�ʽ��
	���ǲ��Ϸ��ģ���Ȼ��Щ�������ǿ���ͨ��,���� DEVC++��
	��Ϊ����ջ��Ҫ�󣬾����ں�������ǰ����������б����Ŀռ䣬
	t�ǲ����ģ����Բ���������ǰ���ͷ���ÿռ䡣
	Ӧ���ö�̬����ķ�ʽ����ִ�е�ʱ�򣬲ŷ���ռ䣬
	���ǺϷ��ķ�ʽ��
	���߽���������Ϊconst���� */ 
	
	for(int i=0;i<t;i++){
		scanf("%d %d",&size[i],&average[i]);
		for(int k=0;k<size[i];k++){
			scanf("%d",&score[i][k]);
		}
	}
	//sort���� �����ɼ�����ÿһ�ж���С�������� 
	for(int i =0;i<t;i++){
		sort(score[i],score[i]+size[i]) ;
	}
	
	for(int i=0;i<t;i++){
		
		count[i] = 0;
		int temp1=0;                   //ͳ��ÿ�����ķ������ۼ�ֵ 
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

