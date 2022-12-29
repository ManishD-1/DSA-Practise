
class Node {
    int val;
    Node next;
   

    public Node() {
        val = 0;
        next = null;
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedList {
    Node head;

    void insert(int x) {
        /*
         * 1. Create a new node (Node n = new Node(x);)
         * 2. If head == null, head = n, return
         * 3. go to the last node
         * 4. last.next = n;
         */
        Node n = new Node(x);
        if (head == null) {
            this.head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
           // above while loop will end when, temp.next = null OR temp refers the last node

        temp.next = n;
        return;

    }

    void printLinkList(Node head) {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }
    void printLL() {//without head as a input needed
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }

    void delete(int x) {
        Node prev = null;
        Node curr = head;

        while (curr != null && curr.val != x) {
            prev = curr;// prev is taking the present value of curr (which will be previous for the new
                        // value of curr)

            curr = curr.next;
        }
        // curr will point to the node to be deleted
        // 1. Element to be deleted not found
        if (curr == null) {
            System.out.println(x + " is not present in Linked List");
            return;
        }
        // 2. Node to be deleted is the head node
        else if (prev == null) {
            head = curr.next;
            curr.next = null;
            return;
        }
        // 3. Node to be deleted is a middle/ last node
        else {
            prev.next = curr.next;
            curr.next = null;
            return;
        }
    }
    void smartDelete(int x){
        Node dummy = new Node(0,head);
        Node prev = dummy , curr = head;
        while(curr!=null && curr.val!=x)
        {
            prev = prev.next;
            curr = curr.next;
        }
        if(curr==null)
        {
            System.out.println(x + " is not present in Linked List");
            return;
        }
        prev.next = curr.next;
        curr.next = null;
        head = dummy.next;// V V IMP as we delete head node..so we have to change our head.
    }
    int middle(){
       Node tort = head, hare = head;
       while(hare != null && hare.next != null)
       {
           tort = tort.next;
           hare = hare.next.next;
       }
       return tort.val;
    }
     Node reverseLinkedList(){
        if(head==null){
            return null;
        }

        Node prev = null;
        Node curr = head;
        Node temp = null;

        while(curr!=null){
            temp = curr.next; //saving next of curr before switching
            curr.next = prev; //switching the link in reverse direction
            prev = curr;
            curr = temp;
        }

        return prev;
    }
    Node swapFirstLast(){
        Node dummy = new Node(0,head);
        Node pre = dummy;
        Node temp = head;
        Node curr = head;
        while(curr.next!=null)
        {
           curr = curr.next;
           pre  = pre.next;
        }
        curr.next = temp.next;
        temp.next = null;
        pre.next = head;
        head = curr;
        return head;

    }
    void printReverse(Node head){
        if(head==null)
        {
        

            return;
        }
        

        printReverse(head.next);
        System.out.print(head.val+" ");
    }

  
}
