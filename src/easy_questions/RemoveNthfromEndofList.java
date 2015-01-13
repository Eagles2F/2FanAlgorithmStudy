package easy_questions;

import utils.ListNode;

public class RemoveNthfromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode start = new ListNode(0);
		ListNode slow = start,fast = start;
		slow.next = head;
		
		//move the fast node n steps firstly
		for(int i=0;i<n;i++){
			fast = fast.next; 
		}
		//move fast and slow at the same time until the fast arrives the last
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next; // delete the node
		
		return start.next;
	}
}
