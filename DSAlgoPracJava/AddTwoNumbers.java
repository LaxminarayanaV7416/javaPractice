
//   Definition for singly-linked list.

/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
 * and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list. 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
    Example 2:

    Input: l1 = [0], l2 = [0]
    Output: [0]
    Example 3:

    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]


    Solution description - as this is in reverse order we have to add the two numbers of current node
    then take the remainder with 10 if the remainder is exactly equal to the added value then we mark
    remainder as zero and assign contiunue to create the node and assign it previous node and move ahead
    later we check the remainder is zero then we add no remainder else we add the remainder usually remainder will be 
    1 it will not cross 1 since max numbers is 9 if we add them they end up getting 18 so max it doesnt cross 1.

 */



class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode prev = null;
        ListNode l1Next = l1;
        ListNode l2Next = l2;

        int remainder = 0;
        while (true) {
            int l1Temp;
            int l2Temp;
            if (l1Next != null) {
                l1Temp = l1Next.val;
                l1Next = l1Next.next;
            } else {
                l1Temp = 0;
            }

            if (l2Next != null) {
                l2Temp = l2Next.val;
                l2Next = l2Next.next;
            } else {
                l2Temp = 0;
            }

            int tempRes;
            if (remainder == 0) {
                tempRes = l1Temp + l2Temp;
            } else {
                tempRes = l1Temp + l2Temp + remainder;
            }
            remainder = tempRes % 10;
            ListNode lTemp = new ListNode(remainder);

            if (remainder == tempRes) {
                remainder = 0;
            } else {
                remainder = 1;
            }

            if (res == null) {
                res = lTemp;
            } else {
                prev.next = lTemp;
            }
            prev = lTemp;

            // condition to break the loop
            if (l1Next == null && l2Next == null) {
                if (remainder > 0) {
                    ListNode lTempFinal = new ListNode(remainder);
                    prev.next = lTempFinal;
                }
                break;
                // System.out.println(" ");
            }
        }
        return res;
    }
}