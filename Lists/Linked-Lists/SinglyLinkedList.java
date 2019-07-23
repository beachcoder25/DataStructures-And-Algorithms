public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; 
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;}
        System.out.print("null");
    }

    // Tester
    public static void main(String[] args){

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(8);
        ListNode four = new ListNode(11);

        sll.head.next = two;
        two.next = three;
        three.next = four;
        sll.display();

        
        
    }
}