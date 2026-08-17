// Merge 2 list



        class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode  ans  = new ListNode(0);
        ListNode curr = ans;

       while(head1!= null && head2!=null){
             if(head2.val > head1.val){
                curr.next = head1;
                head1 = head1.next;
             }
             else {
                curr.next = head2;
                head2 = head2.next;
             }
             curr = curr.next;
       }
       


        if (head1 != null) {
            curr.next = head1;
        } 
        else {
            curr.next = head2;
        }
       return ans.next;


    }
}