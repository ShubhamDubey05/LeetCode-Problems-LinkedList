 class ListNode {
         int val;
         ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    
   class Solution {
   
       public ListNode reverseList(ListNode head) {
           ListNode current=head;
           ListNode previous = null;
           ListNode forward = null;
           while(current!= null){
               forward = current.next;
               current.next = previous;
               previous = current;
               current = forward;
   
           }
   
         return previous;
       }
       public boolean isPalindrome(ListNode head) {
           ListNode slow=head;
           ListNode fast=head;
           while(fast.next!=null && fast.next.next != null){
               slow=slow.next;
               fast=fast.next.next;
           }
       ListNode temp = reverseList(slow.next);
       slow.next =temp;
       ListNode p1= head;
       ListNode p2= slow.next;
       while(p2!=null){
           if(p1.val != p2.val)
               return false;
           p1=p1.next;
           p2=p2.next;
       }
       return true;
       }
   }

public class palindromeofLinkedList {
    public static void main(String[] args) {
        
    }
    
}
