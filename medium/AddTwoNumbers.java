package medium;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

public class AddTwoNumbers {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode res = new AddTwoNumbers().addTwoNumbers(l1, l2);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}

	ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int sum = 0;
		ListNode l3 = new ListNode(0);
		ListNode temp = l3;
		while (l1 != null || l2 != null) {
			sum /= 10;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			
		}
		if (sum / 10 == 1) {
			temp.next = new ListNode(1);
		}
		return l3.next;
	}

}
