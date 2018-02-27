//package LinkedList;
//
//public class PartitionLinkedList {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Node n1 = new Node(3);
//		n1.appendToTail(5);
//		n1.appendToTail(8);
//
//		n1.appendToTail(5);
//		n1.appendToTail(10);
//		n1.appendToTail(2);
//		n1.appendToTail(1);
//
//		Node temp = n1.partitioner(n1, 5);
//		while(temp != null)
//		{
//			System.out.println(temp.data);
//			temp = temp.next;
//		}
//
//	}
//
//
//}
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
//	//	Node dissector(Node n, int partitioner)
//	//		{
//	//			Node smaller = null;
//	//			Node greater = null;
//	//			Node equal = null;
//	//			Node temp1 = null;
//	//			//Node temp2 = null;
//	//			//Node temp3 = null;
//	//			
//	//			while(n != null)
//	//			{
//	//			
//	//					if(n.data < partitioner)
//	//					{
//	//						if(smaller == null)
//	//						{
//	//							smaller = new Node(n.data);
//	//							 temp1 = smaller;
//	//						}
//	//						else
//	//						{
//	//						smaller.appendToTail(n.data);
//	//					//	smaller = smaller.next;
//	//						}
//	//						
//	//						
//	//					}
//	//					else if(n.data > partitioner)
//	//					{
//	//						if(greater == null)
//	//						{
//	//							greater = new Node(n.data);
//	//							// temp2 = greater;
//	//						}
//	//						else
//	//						{
//	//						greater.appendToTail(n.data);
//	//						}
//	//					}
//	//					else
//	//					{
//	//						if(equal == null)
//	//						{
//	//							equal = new Node(n.data);
//	//						}
//	//						else
//	//						{
//	//							equal.appendToTail(n.data);
//	//						}
//	//					}
//	//					n = n.next;
//	//			}
//	//			smaller = smaller.takeToEnd(smaller);
//	//			smaller.next = equal;
//	//			equal =  equal.takeToEnd(equal);
//	//			equal.next = greater;
//	//			
//	//			return temp1;
//	//			
//	//			
//	//			
//	//		}
//
//	Node partitioner(Node n, int partition)
//	{
//		Node head = n;
//		Node i = null;
//		Node j = n;
//		Node pivot = null;
//		while(n.next.data != partition)
//		{
//			n = n.next;
//		}
//		Node prev = n;
//		n = n.next;
//		pivot = n;
//		prev.next = n.next;
//
//		while(n.next != null)
//			n = n.next;
//		n.next = pivot;
//		pivot.next = null;
//		
//		while(j != pivot) {
//			if(j.data <= pivot.data) {
//				if(i == null) {
//					i = j;
//				} else {
//					i = i.next;
//				}
//				int temp = j.data;
//				j.data = i.data;
//				i.data = temp;
//			}
//			
//			j = j.next;
//		}
//		
//		i = i.next;
//		int temp = i.data;
//		i.data = pivot.data;
//		pivot.data = temp;
//	
//		return head;
//	}
//	
//}
//
