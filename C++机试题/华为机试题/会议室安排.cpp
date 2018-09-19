#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

typedef struct node
{
	int s;
	int e;
	int number;//会议个数 
}Node;//采用结构体来存储会议信息

vector<Node> v;

bool compare(Node a, Node b)
{
	return a.e<b.e;
}

void MeetArra()
{
	int CurrTime = 0;
	sort(v.begin(), v.end(), compare);//按照结束时间进行排序
	for (auto it = v.begin(); it != v.end(); ++it)
	{
		if (it->s >= CurrTime)
		{
			cout << it->s<<","<<it->e<<endl;
			CurrTime = it->e;
		}
	}
}

int main()
{
	int i, k = 1;
	//cout<<"请输入总会议数：";
	//cin>>n;
	Node t;
	for (i = 1; ; ++i)
	{
		t.number = k;//用于给会议编号，方便输出
		k++;
		//cout<<"输入起始时间：";
		//cin >> t.s >> t.e;
		scanf("%d,%d", &t.s, &t.e);
		if (t.s == 0 && t.e == 0) {
			break;
		}
		//cout<<"输入结束时间：";
		//cin>>t.e;		
		v.push_back(t);
	}
	MeetArra();
	system("pause");
	return 1;
}
