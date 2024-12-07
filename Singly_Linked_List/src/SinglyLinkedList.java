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
    // Insert node at the beginning of a singly linked list
    public void InsertNodeAtB(int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    // Insert a node in a Singly Linked List at a given position
    public void Insert(int position, int value){
        ListNode node = new ListNode(value);
        if(position ==1){
            node.next=head;
            head = node;
        }
        else {
            ListNode previous = head;
            int count = 1;

            while (count <position-1){
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    // Insert node at the end of a Singly Linked List
    public void InsertNodeAtE(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next=newNode;
    }

    public ListNode deleteF(){
        if(head == null){
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        //Input data to head node
//        sll.head = new ListNode(10);
//        //Input data to other nodes
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);
//        //we will connect them together to form a chain
//        sll.head.next=second;//10-->1
//        second.next=third;//10-->1-->8
//        third.next=fourth;//10-->1-->8-->11-->null
        // Insert
        sll.InsertNodeAtB(10);
        sll.InsertNodeAtB(1);
        sll.InsertNodeAtB(8);
        sll.InsertNodeAtB(11);

        sll.InsertNodeAtE(9);
        sll.InsertNodeAtE(7);

        sll.Insert(1,4);
        sll.Insert(3,5);
        sll.Insert(9,14);

        // Display
        sll.display();
        System.out.println("\nlength of a Singly Linked List: "+sll.countNode());

        // Delete
        System.out.println("Delete first node "+sll.deleteF().data);

        // Display
        sll.display();
        System.out.println("\nlength of a Singly Linked List: "+sll.countNode());
    }
}