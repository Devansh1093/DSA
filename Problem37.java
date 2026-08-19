public class Problem37 {
    
}


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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode curr = slow;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
        }
        ListNode left = head;
        ListNode right = prev;
        int max =0;
        while(right!=null){
            int sum = left.val +right.val;
            max = Math.max(sum,max);
            left = left.next;
            right = right.next;
        }
        return max;
    }
}