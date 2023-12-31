You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.


code in java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode n=new ListNode(0);int c=0;
        ListNode dummy=n;
        while(a!=null||b!=null){
            
            int x=a!=null?a.val:0;
            int y=b!=null?b.val:0;
            int k=x+y+c;
            c=k/10;
            dummy.next=new ListNode(k%10);
            dummy=dummy.next;
            if(a!=null)
                a=a.next;
            if(b!=null)
                b=b.next;
        }
        if(c>0){
            dummy.next=new ListNode(c);
        }
        return n.next;
    }
}
