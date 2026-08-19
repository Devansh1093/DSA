// Partition List



class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode pointer = left;
        ListNode right = new ListNode(0);
        ListNode point = right;
        ListNode curr = head;
        while(curr!=null){
             ListNode next = curr.next;
             curr.next = null;           
             if(curr.val < x){
                pointer.next = curr;
                pointer = pointer.next;
             }
             else if(curr.val>=x){
                point.next = curr;
                point = point.next;

             }
             curr=next;
        }
        if(right!=null){
            pointer.next = right.next;
            
        }
        return left.next;

    }
}