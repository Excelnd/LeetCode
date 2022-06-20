package solution;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode duplicateRemover = head;

		while (duplicateRemover != null && duplicateRemover.next != null) {

			if (duplicateRemover.val == duplicateRemover.next.val) {
				duplicateRemover.next = duplicateRemover.next.next;
			} else {
				duplicateRemover = duplicateRemover.next;
			}
		}
		return head;
	}
}

