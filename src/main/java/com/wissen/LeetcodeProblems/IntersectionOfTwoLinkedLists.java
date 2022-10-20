package com.wissen.LeetcodeProblems;

public class IntersectionOfTwoLinkedLists {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode tempA = headA, tempB = headB;
        while(tempA != null)
        {
            lengthA++;
            tempA = tempA.next; 
        }
        tempA = headA;

        while(tempB != null)
        {
            lengthB++;
            tempB = tempB.next; 
        }
        tempB = headB;

        if(lengthA > lengthB)
        {
            for(int i=0;i<lengthA-lengthB;i++)
            {
                tempA = tempA.next;
            }
        }
        if(lengthA < lengthB)
        {
            for(int i=0;i<lengthB-lengthA;i++)
            {
                tempB = tempB.next;
            }
        }

        while(tempA != null && tempB != null)
        {
            if(tempA == tempB)
                return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }

}
