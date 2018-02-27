package LinkedList;

public class DoublyLinkedList {

	DoublyLinkedList prev = null;
	DoublyLinkedList next = null;
	int data;

	public DoublyLinkedList(int d)
	{
		data = d;
	}

	public void appendToTail(int d)
	{
		DoublyLinkedList end = new DoublyLinkedList(d);
		DoublyLinkedList dll = this;
		while(dll.next!=null)
		{
			dll = dll.next;
		}
		dll.next = end;
		end.prev = dll;

	}

	public void printList()
	{
		DoublyLinkedList dll = this;
		DoublyLinkedList head = this;
		//the or condition for 
		do
		{
			System.out.println(dll.data);
			dll = dll.next;
		}while(dll != head && dll.next != null);
		//System.out.println(dll.data);
	}

	//connect circular
	public void makeCircular()
	{
		DoublyLinkedList dll = this;
		DoublyLinkedList head = this;
		while(dll.next!=null)
		{
			dll = dll.next;
		}
		dll.next = head;
		head.prev = dll;	
	}

	public void LoopDetection()
	{
		DoublyLinkedList dll = this;
		DoublyLinkedList dll2 = this;
		DoublyLinkedList dll_faster = this;
		DoublyLinkedList head = this;
		int count = 0;
		while(dll.next == head && dll.next == null)
		{
			dll = dll.next;
		}
		if(dll.next == null)
		{
			return ;
		}
		else
		{
			do
			{
				dll_faster = dll_faster.next.next;
				dll2 = dll2.next;
				count = ++count;
				System.out.println("Count: "+count);
			}while((dll_faster.data != dll2.data) && dll2 != head);
			if(dll_faster.data == dll2.data)
			{
				System.out.println("Loop detected at : "+dll2.data);
			}
			else
			{
				System.out.println("No loop "+ dll2.data);
			}
		}
	}

	public void InsertAtSpecific(int d, int after)
	{
		DoublyLinkedList dll = this;
		DoublyLinkedList head = this;
		while(dll.data != after)
		{
			dll = dll.next;
		}
		DoublyLinkedList old_nextDll = dll.next;
		DoublyLinkedList placer_node = new DoublyLinkedList(d);
		dll.next = placer_node;
		placer_node.prev = dll;
		placer_node.next = old_nextDll;

	}

	public void RemoveDups()
	{
		DoublyLinkedList dll = this;
		//DoublyLinkedList 
	}
}

