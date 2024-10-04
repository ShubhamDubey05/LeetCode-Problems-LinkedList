package singlyLinkedList;

  class ListNode {
        int val;
         ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    
   class Solution {
   
       public ListNode reverseList(ListNode head) {
   
           if(head == null){
               return head;
           }
           if(head.next == null){
               return head;
           }
           ListNode newnode = reverseList(head.next);
           head.next.next = head;
           head.next =null;
           return newnode;
       }
   }


public class recursiveReverseLinkedList {
    
    public static void main(String[] args) {
    

}
    
}
