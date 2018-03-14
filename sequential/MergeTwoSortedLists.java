package sequential;

class ListNode
{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}

}
public class MergeTwoSortedLists {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 =  new MergeTwoSortedLists().mergeTwoLists(l1, l2);
		while(l3!=null)
		{
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}
	
	ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		ListNode exp = new ListNode(0);
		ListNode prev = exp;
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		while(l1 != null && l2!=null)
		{
			if(l1.val >= l2.val)
			{
				prev.next = l2;
				l2 = l2.next;
			}
			else
			{
				prev.next = l1;
				l1 = l1.next;
			}
			prev = prev.next;
		}
		if(l1 != null)
			prev.next = l1;
		if(l2!=null)
			prev.next = l2;
			
		return exp.next;
		
	}
	
	ListNode mergeTwoLists2(ListNode l1, ListNode l2)
	{
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		ListNode head;
		if(l1.val > l2.val)
		{
			head = l2;
			head.next = mergeTwoLists(l1, l2.next);
		}
		else
		{
			head = l1;
			head.next = mergeTwoLists(l1.next, l2);
		}
		return head;
	}
}

