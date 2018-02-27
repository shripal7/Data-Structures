package LinkedList;

public class LinkedListReverseRecursive {

	public static void main(String[] args) {
		//System.out.println("H");

		Node n = new Node(3);
		n.appendToTail(5);
		n.appendToTail(431);
		n.appendToTail(1);
		n.appendToTail(2);
		n.linkedListReverse(n);
	}



}
class Node {

	Node next = null;
	int data;

	public Node(int d)
	{
		data = d;
	}


	void appendToTail(int d)
	{
		Node end = new Node(d);
		Node n = this;
		while(n.next != null)
			n = n.next;
		n.next = end;
	}


	void linkedListReverse(Node n)
	{
		Node n1 = n;
		Node head = n;
		if(n1 != null)
		{
			//n1 = n1.next;
			linkedListReverse(n1.next);
			System.out.println(n1.data);

		}
	}
}

