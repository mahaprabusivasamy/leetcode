PROBLEM NO:83

  
Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.

INPUT:

 head = [1,1,2]

OUTPUT:
[1,2,3]


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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }
}
