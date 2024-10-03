class LinkedList{

    class Node{
        int val ;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

        void  getElement(Node head){
            if(head==null){
                return ;
            }
            getElement(head.next);
            System.out.println(head.val);
          

        }


}






public class reverseLinkedList {
    public static void main(String[] args) {
    
}
    
}
