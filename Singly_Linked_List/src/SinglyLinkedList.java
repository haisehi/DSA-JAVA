public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    //print element of a singly linked list
    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data +"-->");
            current = current.next;
        }
        System.out.print("null");
    }
    //Find length of a Singly Linked List
    public int countNode(){
        int count =0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        //Input data to head node
        sll.head = new ListNode(10);
        //Input data to other nodes
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        //we will connect them together to form a chain
        sll.head.next=second;//10-->1
        second.next=third;//10-->1-->8
        third.next=fourth;//10-->1-->8-->11-->null

        sll.display();
        System.out.println("\nlength of a Singly Linked List: "+sll.countNode());
    }
}