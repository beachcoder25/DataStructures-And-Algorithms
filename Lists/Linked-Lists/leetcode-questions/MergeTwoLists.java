public class MergeTwoLists {

    private ListNode head;

    private static class ListNode {
        private int val; 
        private ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;}
        System.out.print("null");
    }

    public static ListNode merge_two_lists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        
        while( l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else{
                curr.next = l2;
                l2 = l2.next;  }
            
            curr = curr.next; 
        }
        
        if(l1 == null){curr.next = l2;}
        else if(l2 == null){curr.next = l1;}

        return temp.next;
    }
    // Tester
    public static void main(String[] args){

        MergeTwoLists sll0 = new MergeTwoLists();
        MergeTwoLists sll01 = new MergeTwoLists();
        sll0.head = new ListNode(1);
        ListNode two = new ListNode(4);
        ListNode three = new ListNode(8);
        ListNode four = new ListNode(11);

        sll0.head.next = two;
        two.next = three;
        three.next = four;

        sll01.head = new ListNode(3);
        ListNode two_01 = new ListNode(4);
        ListNode three_01 = new ListNode(9);
        ListNode four_01 = new ListNode(12);

        sll01.head.next = two_01;
        two_01.next = three_01;
        three_01.next = four_01;


        ListNode final_list = merge_two_lists(sll0.head, sll01.head);
       
        while(final_list != null){
            System.out.println(final_list.val);
            final_list = final_list.next;
        }

         
        
    }
}