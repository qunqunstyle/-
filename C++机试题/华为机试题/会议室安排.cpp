#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

typedef struct node
{
	int s;
	int e;
	int number;//������� 
}Node;//���ýṹ�����洢������Ϣ

vector<Node> v;

bool compare(Node a, Node b)
{
	return a.e<b.e;
}

void MeetArra()
{
	int CurrTime = 0;
	sort(v.begin(), v.end(), compare);//���ս���ʱ���������
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
	//cout<<"�������ܻ�������";
	//cin>>n;
	Node t;
	for (i = 1; ; ++i)
	{
		t.number = k;//���ڸ������ţ��������
		k++;
		//cout<<"������ʼʱ�䣺";
		//cin >> t.s >> t.e;
		scanf("%d,%d", &t.s, &t.e);
		if (t.s == 0 && t.e == 0) {
			break;
		}
		//cout<<"�������ʱ�䣺";
		//cin>>t.e;		
		v.push_back(t);
	}
	MeetArra();
	system("pause");
	return 1;
}
