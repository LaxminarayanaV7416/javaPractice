// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

// Example 1:

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]

//   Definition for singly-linked list.
public class ListNode {
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

// class Solution {
// public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
// ListNode arr = null;
// ListNode prev = null;
// while (true) {
// Integer l1Val = null;
// Integer l2Val = null;
// if (list1 != null) {
// l1Val = list1.val;
// list1 = list1.next;
// }
// if (list2 != null) {
// l2Val = list2.val;
// list2 = list2.next;
// }
// if (l1Val == null && l2Val != null) {
// ListNode l2 = new ListNode(l2Val);
// if (arr == null) {
// arr = l2;
// } else {
// prev.next = l2;
// }
// prev = l2;
// } else if (l1Val != null && l2Val == null) {
// ListNode l1 = new ListNode(l1Val);
// if (arr == null) {
// arr = l1;
// } else {
// prev.next = l1;
// }
// prev = l1;

// } else if(l1Val != null && l2Val!=null){
// if (l1Val > l2Val) {
// ListNode l1 = new ListNode(l1Val);
// ListNode l2 = new ListNode(l2Val);
// if (arr == null) {
// arr = l2;
// prev = l2;
// prev.next = l1;
// } else {
// prev.next = l2;
// prev = l2;
// prev.next = l1;
// }
// prev = l1;

// } else {
// ListNode l1 = new ListNode(l1Val);
// ListNode l2 = new ListNode(l2Val);

// if (arr == null) {
// arr = l1;
// prev = l1;
// prev.next = l2;
// } else {
// prev.next = l1;
// prev = l1;
// prev.next = l2;

// }
// prev = l2;
// }
// }

// if (list1 == null && list2 == null) {
// break;
// }
// }
// return arr;
// }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        while (true) {
            Integer l1 = null;
            Integer l2 = null;
            if (list1 != null) {
                l1 = list1.val;
                list1 = list1.next;
            }
            if (list2 != null) {
                l2 = list2.val;
                list2 = list2.next;
            }

            if (l1 != null && l2 != null) {
                list.add(l1);
                list.add(l2);
            } else if (l1 != null) {
                list.add(l1);
            } else if (l2 != null) {
                list.add(l2);
            } else {
                break;
            }
        }
        Collections.sort(list);
        ListNode arr = null;
        ListNode prev = null;
        for (int i = 0; i < list.size(); i++) {
            ListNode temp = new ListNode(list.get(i));
            if (arr == null) {
                arr = temp;
            } else {
                prev.next = temp;
            }
            prev = temp;
        }
        return arr;
    }
}