package problems;

 
import java.util.LinkedList;

/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

 */
public class AddTwoNumbers_q2 {
 
	 public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode answer = new ListNode(0);
		LinkedList<Integer> test = new LinkedList<Integer>();
		LinkedList<Integer> p = new LinkedList<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		while(l1 != null) {
			p.add(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			q.add(l2.val);
			l2 = l2.next;
		}
		int carry = 0;
		while(p.isEmpty() == false || q.isEmpty() == false) {
			int x = 0;
			int y = 0;
			if(p.isEmpty()== false) {
				x = p.poll();
			}
			if(q.isEmpty() == false) {
				y = q.poll();
			}
			int sum = x + y + carry;
			test.add(sum % 10);
			carry = sum / 10 ;
		}
		if(carry > 0) {
			test.add(carry);
		}
		
		answer.val = test.poll();
		ListNode head = answer;
		while(test.isEmpty()==false) {	
			answer.next = new ListNode(test.poll());
			answer = answer.next;
		}
		return head;
		
    }

	
	
	
	
	public static ListNode addTwoNumbers_secondtry(ListNode l1, ListNode l2) {
		ListNode answer = new ListNode(0);
		if(l1.val == 0 && l1.next == null) {
			answer.next = l2;
		}
		else if(l2.val == 0 && l2.next == null) {
			answer.next = l1;
		}
		else {
			ListNode p = l1,q=l2;
			ListNode result = answer;
			int carry = 0;
			
			while(p!= null || q!= null) {
				int x = 0;
				int y = 0;
				if(p!=null) {
					x = p.val;
				} 
				if(q!=null) {
					y = q.val;
				} 
				int sum = x + y + carry;
		 
				 
				result.next = new ListNode(sum%10);
				result = result.next;
				carry = sum / 10;
				
				if(p!=null) {
					p = p.next;
				}
				if(q!= null) {
					q = q.next;
				}
			}	
			if(carry > 0) {
				result.next = new ListNode(carry);
			}
		
		}
		return answer.next;
	}
	
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		//l1.next = new ListNode(4);
		//l1.next.next = new ListNode(3);
		System.out.println("l1.val :"+l1.val);
		//System.out.println(l1.next.val);
		//System.out.println(l1.next.next.val);
		 
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
		
		ListNode answer = addTwoNumbers(l1,l2);
		while(answer != null) {
			System.out.println(answer.val);
			answer = answer.next;
		}
	}

}
