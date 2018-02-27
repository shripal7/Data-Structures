//package LinkedList;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class PalindromeLinkedList {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Node n1 = new Node(1);
//		n1.appendToTail(2);
//		n1.appendToTail(2);
//		n1.appendToTail(1);
//
//	//	System.out.println(n1.palindromechecker(n1));;
//	}
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
////	String palindromechecker(Node n)
////	{
////		
////		Node temp = n;
////		Node doubletemp = n;
////		int count = 0;
////		if(n.next == null)
////		{
////			System.out.println("No valid node for palindrome");
////			//return n;
////		}
////		else
////		{
////			Map<Integer, Integer> placer = new HashMap();
////			while(n.next !=null)
////			{
////				count++;
////				n = n.next;
////
////			}
////			int init = 0;
////			while(init <= count/2)
////			{
////				placer.put(temp.data, init);
////				init++;
////				temp = temp.next;
////			}
////			while(init <= count)
////			{
////				if(placer.get(temp.data) == null || placer.get(temp.data) != (count - init))
////				{
////					return ("Not palindrome");
////					
////				}
////				temp = temp.next;
////				init++;
////			}
////			return "Palindrome";
////			
////					
////		}
////		return null;
////	
////		
////		
////	}
////	
//	
//	
//	
//	
//	
//}
