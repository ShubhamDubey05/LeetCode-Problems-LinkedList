
public class LinkedList1 {

    public class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
        
    }
    public static Node  nodeDeleteFromEnd(Node head,int m  ){
                Node slow=head;
                Node fast=head;
                for(int i =0; i<m; i++){
                    fast=fast.next;
                }
                while(fast.next!=null){
                    slow=slow.next;
                    fast=fast.next;
                }
                slow.next=slow.next.next;

        return slow;
    }
    public static void main(String[] args) {

    
}
    
}
