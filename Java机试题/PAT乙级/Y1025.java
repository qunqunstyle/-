import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Y1025 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int firstaddress =in.nextInt();
		int N =in.nextInt();
		int k=in.nextInt();
		//建立一个Node型数组，下标按照地址存贮，最大可包含100000的地址空间
		Node[] list=new Node[100000];
		List<Node> array =new ArrayList<>();
		for(int i=0;i<N;i++) {
			Node node =new Node(in.nextInt(),in.nextInt(), in.nextInt());
			list[node.address]=node;			
		}
		in.close();
		link(firstaddress,list,array);
		reverse(array, k);
		//一次打印信息，需注意的是next用下一节点的地址代替，只打印N-1个，因为最后一个的next需打印为-1
		for(int i=0;i<array.size()-1;i++) {
			System.out.printf("%05d %d %05d\n", array.get(i).address,array.get(i).data, array.get(i + 1).address);
		}
		//打印最后一个节点
		int end = array.size() - 1;
		System.out.printf("%05d %d -1", array.get(end).address,
                array.get(end).data);
	}
	/*
	 * 第一个循环按照k进行跳跃，当队列的后续节点满足k的大小时，进入下一层循环，不满足则跳出
	 *进入下一循环时，头尾依次交换即可，相遇停止跳出 
	 */
	public static void reverse(List<Node> array , int k) {
		//并未修改next的值，而是在打印的时候选择打印下一个节点的address，即为上一节点的next
		for(int i=0;i+k<=array.size();i+=k) {
			//当head>tail时既一个循环内全部翻转，跳出
			for(int head=i, tail=i+k-1;head<=tail;head++,tail--) {
				Node node=array.get(head);
				array.set(head, array.get(tail));
				array.set(tail, node);
			}			
		}
		
	}
	/*
	 *添加队列，按照node数组的下标地址进行排列，首地址已知 
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
