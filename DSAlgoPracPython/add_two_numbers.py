
#  Definition for singly-linked list.

# /*
#  * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
#  * and each of their nodes contains a single digit. 
#  * Add the two numbers and return the sum as a linked list. 
#  * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
#  * 
#  * Input: l1 = [2,4,3], l2 = [5,6,4]
#     Output: [7,0,8]
#     Explanation: 342 + 465 = 807.
#     Example 2:

#     Input: l1 = [0], l2 = [0]
#     Output: [0]
#     Example 3:

#     Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
#     Output: [8,9,9,9,0,0,0,1]


#     Solution description - as this is in reverse order we have to add the two numbers of current node
#     then take the remainder with 10 if the remainder is exactly equal to the added value then we mark
#     remainder as zero and assign contiunue to create the node and assign it previous node and move ahead
#     later we check the remainder is zero then we add no remainder else we add the remainder usually remainder will be 
#     1 it will not cross 1 since max numbers is 9 if we add them they end up getting 18 so max it doesnt cross 1.



# Definition for singly-linked list.


class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """

        res = None
        prev = None
        remainder = 0
        while True:
            if (l1 is None and l2 is None):
                if remainder>0:
                    temp = ListNode(1)
                    prev.next = temp
                break
            if l1 is not None:
                l1_val = l1.val
                l1 = l1.next
            else:
                l1_val = 0
            if l2 is not None:
                l2_val = l2.val
                l2 = l2.next 
            else:
                l2_val = 0
            
            if remainder == 0:
                temp = l1_val+l2_val
            else:
                temp = l1_val+l2_val+remainder

            remainder = temp%10
            node = ListNode(remainder)
            if remainder==temp:
                remainder = 0
            else:
                remainder = 1

            if res is None:
                res = node
            else:
                prev.next = node
            prev = node
        return res
        

            



        