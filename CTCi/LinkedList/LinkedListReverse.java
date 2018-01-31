package LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Node n1 = new Node(1);
			n1.appendToTail(2);
			n1.appendToTail(3);
			n1.appendToTail(4);
			
			n1 = n1.reverse(n1);
			
			while(n1 != null)
			{
				System.out.println(n1.data);
				n1 = n1.next;
			}
	}
	

}
class Node{
	
	Node next = null;
	int data;
	public Node(int d){

		data = d;
	}
	
	void appendToTail(int d)
	{
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
		
		
	}
	
	Node reverse(Node n)
	{
		Node curr = n;
		Node newer = null;
		Node prev = null;
		while(curr != null)
		{
			newer = curr.next;
			curr.next = prev;
			prev = curr;
			curr = newer;
		}
		return prev;
	}
}
