// Reorder List
class ListNode{

    
}

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev = slow;
        slow = slow.next;
        prev.next = null;

        // Reverse second half
        ListNode curr = slow;
        prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Merge
        ListNode pointer = head;
        ListNode point = prev;

        while (point != null) {
            ListNode temp1 = pointer.next;
            ListNode temp2 = point.next;

            pointer.next = point;
            point.next = temp1;

            pointer = temp1;
            point = temp2;
        }
    }
}