package solution;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        
        ListNode dummySentinel = new ListNode(0);
        ListNode d = dummySentinel;
        ListNode c1 = l1;
        ListNode c2 = l2;
        // Input: l1 = [2,4,3], 
        //        l2 = [5,6,4]
        // Output: [7,0,8]
        
        int sum = 0;
        int carry = 0;
        while (c1 != null || c2 != null) {
        	sum = sum / 10;
        	if(c1 != null) {
        		sum = c1.val + sum;
        		c1 = c1.next;
        	}
        	if (c2 != null) {
        		sum = c2.val + sum;
        		c2 = c2.next;
        	}
        	
        	int val = sum % 10;
        	carry = sum / 10;
        	d.next = new ListNode(val);
        	d = d.next;
        }
        
        if (carry != 0) { d.next = new ListNode(1); }
        
    	return dummySentinel.next;        
    }
}
