//package LinkedList;
//
////617
////295
////617+295
////912
//public class SumLists {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//
//
//class Node {
//
//	Node next = null;
//	int data;
//
//	public Node(int d)
//	{
//		data = d;
//	}
//
//	Node takeToEnd(Node n)
//	{
//		while(n.next != null)
//		{
//			n = n.next;
//		}
//		return n;
//	}
//
//	void appendToTail(int d)
//	{
//		Node end = new Node(d);
//		Node n = this;
//		while(n.next != null)
//			n = n.next;
//		n.next = end;
//	}
//	
//	//617+295
//	//912
//	Node sumlists(Node n1, Node n2)
//	{
//		int antiCounter = 0;
//		Node n3 = null;
//		while(n1 != null && n2!=null)
//		{
//			if(n3 == null)
//			{
//				n3 = new Node(n1.data + n2.data);
//			}
//			else
//			{
//				n3.appendToTail(n1.data + n2.data);
//			}
//			
//		}
//		return null;
//	}
//
//}
