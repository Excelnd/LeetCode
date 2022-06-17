package solution;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class LinkedListCycle_II {

	public ListNode detectCycle(ListNode head) {

		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				ListNode anotherSlow = head;

				while (anotherSlow != slow) {
					slow = slow.next;
					anotherSlow = anotherSlow.next;
				}
				return slow;
			}

		}
		return null;
	}
}
