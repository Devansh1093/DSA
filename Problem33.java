// Remove Duplicates from Sorted List



class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        if(head== null){
            return head;
        }

        while(curr.next!=null ){
            if(curr.next.val == curr.val){
                curr.next = curr.next.next;
            }
            else{
            curr = curr.next;}
        }
        return head;
    }
}
