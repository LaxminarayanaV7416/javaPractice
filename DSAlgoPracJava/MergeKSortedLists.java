import java.util.*;

// You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

// Merge all the linked-lists into one sorted linked-list and return it.

 

// Example 1:

// Input: lists = [[1,4,5],[1,3,4],[2,6]]
// Output: [1,1,2,3,4,4,5,6]
// Explanation: The linked-lists are:
// [
//   1->4->5,
//   1->3->4,
//   2->6
// ]
// merging them into one sorted list:
// 1->1->2->3->4->4->5->6
// Example 2:

// Input: lists = []
// Output: []
// Example 3:

// Input: lists = [[]]
// Output: []

// NOTES: Not so optimal solution please revist after learning Merge sort join

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {

    public ArrayList<Integer> explode(ListNode inp){
        ArrayList<Integer> arr = new ArrayList<>();
        while(inp!=null){
            arr.add(inp.val);
            inp = inp.next;
        }
        return arr;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        ListNode prev = null;

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i<lists.length; i++){
            arr.addAll(explode(lists[i]));
        }

        Collections.sort(arr);

        for(Integer i : arr){
            ListNode temp = new ListNode(i);
            if(res==null){
                res = temp;
            } else {
                prev.next = temp;
            }
            prev = temp;
        }

        return res;

    }
}