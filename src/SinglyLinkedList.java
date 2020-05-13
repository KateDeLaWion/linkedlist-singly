public class SinglyLinkedList {

        // a separate class of ListNode
        private static class ListNode{
            private int data;
            private ListNode next;
            public ListNode(int data){
                this.data = data;
                this.next = null;
            }
        }


//    private ListNode head; // head has the entire Singly LinkedList, unlike Doubly LinkedList
        // head will be declared in this way when a constructor is written

        // function to print
        public void display(ListNode head){ // ListNode head is needed if it is not declared by constructor
            if (head == null){
                return;
            }
            ListNode current = head;
            while (current != null){
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.print(current); // current is null in the end
        }



        public static void main(String[] args) {
            // 10-->8-->1-->11-->null
            ListNode head = new ListNode(10);
            ListNode second = new ListNode(8);
            ListNode third = new ListNode(1);
            ListNode fourth = new ListNode(11);
            head.next = second;
            second.next = third;
            third.next = fourth;

            SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
            singlyLinkedList.display(head);

        }


}
