import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Y1025 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int firstaddress =in.nextInt();
		int N =in.nextInt();
		int k=in.nextInt();
		//����һ��Node�����飬�±갴�յ�ַ���������ɰ���100000�ĵ�ַ�ռ�
		Node[] list=new Node[100000];
		List<Node> array =new ArrayList<>();
		for(int i=0;i<N;i++) {
			Node node =new Node(in.nextInt(),in.nextInt(), in.nextInt());
			list[node.address]=node;			
		}
		in.close();
		link(firstaddress,list,array);
		reverse(array, k);
		//һ�δ�ӡ��Ϣ����ע�����next����һ�ڵ�ĵ�ַ���棬ֻ��ӡN-1������Ϊ���һ����next���ӡΪ-1
		for(int i=0;i<array.size()-1;i++) {
			System.out.printf("%05d %d %05d\n", array.get(i).address,array.get(i).data, array.get(i + 1).address);
		}
		//��ӡ���һ���ڵ�
		int end = array.size() - 1;
		System.out.printf("%05d %d -1", array.get(end).address,
                array.get(end).data);
	}
	/*
	 * ��һ��ѭ������k������Ծ�������еĺ����ڵ�����k�Ĵ�Сʱ��������һ��ѭ����������������
	 *������һѭ��ʱ��ͷβ���ν������ɣ�����ֹͣ���� 
	 */
	public static void reverse(List<Node> array , int k) {
		//��δ�޸�next��ֵ�������ڴ�ӡ��ʱ��ѡ���ӡ��һ���ڵ��address����Ϊ��һ�ڵ��next
		for(int i=0;i+k<=array.size();i+=k) {
			//��head>tailʱ��һ��ѭ����ȫ����ת������
			for(int head=i, tail=i+k-1;head<=tail;head++,tail--) {
				Node node=array.get(head);
				array.set(head, array.get(tail));
				array.set(tail, node);
			}			
		}
		
	}
	/*
	 *��Ӷ��У�����node������±��ַ�������У��׵�ַ��֪ 
	 */
	public static void link(int firstaddress,Node[] list,List<Node> array) {
		while(firstaddress!=-1) {
			array.add(list[firstaddress]);
			firstaddress=list[firstaddress].next;
		}
		
	}

}
class Node {
	int address;
	int data;
	int next;
	public Node(int address,int data,int next) {
		// TODO Auto-generated constructor stub
		this.address=address;
		this.data=data;
		this.next=next;
	}
}
