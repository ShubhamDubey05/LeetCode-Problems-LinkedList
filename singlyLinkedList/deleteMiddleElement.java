package singlyLinkedList;

class Solution {
     static ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode slow=head;;
        ListNode fast =head;
        while(fast.next.next!=null && fast.next.next.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
          class ListNode{
            int val;
            ListNode next;
            public ListNode(int val) {
                this.val = val;
            }
            
        }


public class deleteMiddleElement {
    public static void main(String[] args) {
        
    }
    
}
