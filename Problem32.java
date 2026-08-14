// Remove Nth Node From End of List


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode curr = head;
      int index=0;
      int length = 1;
       
      while(curr.next!=null){
        length++;
        curr = curr.next;
      }
      int pos = length - n ;
      curr = head;
      
      if (pos == 0) {
            return head.next;
        }
        while(index != pos-1){
            index++;
            curr = curr.next;

        }
        curr.next = curr.next.next;
      
      return head;

    }
}
