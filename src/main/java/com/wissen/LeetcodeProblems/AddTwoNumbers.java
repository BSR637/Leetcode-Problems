package com.wissen.LeetcodeProblems;

public class AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int sum = 0, carry = 0, num1, num2;
        ListNode temp = dummy;

        while(l1 != null || l2 != null)
        {
            if(l1 != null)
                num1 = l1.val;
            else
                num1 = 0;
            
             if(l2 != null)
                num2 = l2.val;
            else
                num2 = 0;

            sum = carry + num1 + num2;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            
        }
        if(carry > 0)
            temp.next = new ListNode(carry);
        return dummy.next;
    }

}
