/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }
        
        ListNode oddList = head;
        ListNode evenList = head.next;
        
        ListNode oddTemp = oddList;
        ListNode evenTemp = evenList;
        
        while ((oddTemp.next!=null) && (evenTemp.next!=null)){
            oddTemp.next = evenTemp.next;
            oddTemp = oddTemp.next;
            evenTemp.next = oddTemp.next;
            evenTemp = evenTemp.next;
        }
        
        oddTemp.next = evenList;
        return oddList;
    }
}