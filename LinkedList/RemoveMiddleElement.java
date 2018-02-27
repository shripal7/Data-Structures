//package LinkedList;
//
//public class RemoveMiddleElement {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			
//		Node n1 = new Node(2);
//		n1.appendToTail(1);
//		n1.appendToTail(6);
//		n1.appendToTail(5);
//		n1.removeMiddleElement(n1);
//		while(n1 != null)
//		{
//			System.out.println(n1.data);
//			n1 = n1.next;
//		}
//	}
//
//}
// class Node {
//	
//	Node next = null;
//	int data;
//	
//	public Node(int d)
//	{
//		data = d;
//	}
//	
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
//	Node removeMiddleElement(Node n)
//	{
//		Node temp = n;
//		Node doubletemp = n;
//		if(n.next == null || n.next.next == null)
//		{
//			System.out.println("No middle element to remove");
//			return n;
//		}
//		else
//		{
//			Node prev = null;
//			while(doubletemp.next != null)
//			{
//				prev = n;
//				n = n.next;
//				if(doubletemp.next.next == null)
//					break;
//				doubletemp = doubletemp.next.next;
//			}
//			prev.next = n.next;
//			return temp;
//			
//		}
//		//return n;
//		
//	}
//}