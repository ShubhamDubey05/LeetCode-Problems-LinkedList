public class middleElementOfLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
        
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow =head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static void main(String[] args) {
        
    }
    
}
