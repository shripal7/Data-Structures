//package LinkedList;
////Return Kth element from the last
//
//
//public class ReturnKthElement {
//
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//
//		Node n1 = new Node(1);
//		n1.appendToTail(2);
//		n1.appendToTail(6);
//		n1.appendToTail(4);
//		n1.appendToTail(3);
//		System.out.println(n1.returnkthlement2(n1, 3));
//		
//		
//	}
//}
//	
//	class Node{
//		Node next = null;
//		int data;
//		
//		public Node(int d)
//		{
//			data = d;
//		}
//		
//		void appendToTail(int d)
//		{
//			Node end = new Node(d);
//			Node n = this;
//			while(n.next != null)
//				n = n.next;
//			n.next = end;
//		}
//	
//	public int returnkthlement(Node n, int k) throws Exception{
//		int counter = 0;
//		int checker = 0;
//		Node temp = n;
//		while(n!=null)
//		{
//			counter++;
//			n = n.next;
//		}
//		int k_starter = counter - k;
//		if(k_starter >= counter || k_starter <0)
//		{
//			throw new Exception("NO such element fromn the kth");
//			//return 0;
//		}
//		else
//		{
//			while(temp!=null)
//			{
//				if(checker == k_starter)
//				{
//					return temp.data;
//				}
//				checker++;
//				temp = temp.next;
//			}
//		}
//		throw new Exception("NO such element fromn the kth");
//		
//	}
//	
//	
//	//Optimized method
//	public int returnkthlement2(Node n, int k) throws Exception
//	{
//		Node temp = n;
//		while(k > 0)
//		{
//			temp = temp.next;
//			k--;
//		}
//		
//		
//		Node curr = n;
//		while(temp != null)
//		{
//			curr = curr.next;
//			temp = temp.next;
//		}
//		if(curr != null)
//		return curr.data;
//		
//		throw new Exception("No such element fromn the kth");
//		
//		
//	}
//	
//	}
//	
//	
