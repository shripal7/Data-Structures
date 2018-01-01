package LinkedList;

import java.util.HashMap;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		n1.appendToTail(2);
		n1.appendToTail(3);
		n1.appendToTail(1);
		n1.appendToTail(5);
		n1.detectDup(n1);
		//System.out.println(n1.data);
		while(n1 != null)
		{
			System.out.println(n1.data);
			n1 = n1.next;
		}
		
		
	}

}

class Node {
	Node next = null;
	int data;
	
	public Node(int d) {
		data = d;
	}
	
	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = end;
	}
	
	Node detectDup(Node n)
	{
		Node temp = n;
		HashMap<Integer, Integer> h1 = new HashMap();
		Node prev = null;
		
		if(n!=null)
		{
		h1.put(n.data, 1);
		//System.out.println(n.data+"first");
		prev = n;
		n = n.next;
		
		}
	
		while(n != null)
		{
			
			if(h1.containsKey(n.data))
			{
				System.out.println("dup:"+n.data);
				prev.next = n.next;
//				n = n.next;
			}
			else
			{
				h1.put(n.data, 1);
				prev = n;
//				n = n.next;
			}			
			n = n.next;
		}
		return temp;
	}

}
