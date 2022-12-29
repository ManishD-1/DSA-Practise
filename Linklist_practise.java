
class Node {
    int val;
    Node next;

    public Node() {
        this.val = 0;
        this.next = null;
    }

    public Node(int x) {
        this.val = x;
        next = null;
    }

    public Node(int x, Node next) {
        this.val = x;
        this.next = next;
    }
}
public class Linklist_practise{
    Node head;
    void insert(int x){
        Node n = new Node(x);
        if(head==null)
        {
            head=n;
            return; // return statement is very important
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next = n;
        return; // return statement is very important
    }
    void delete(int x){
        Node temp = head;
        Node prev = null;
        
        while(temp!=null && temp.val!= x)
        {
            prev = temp;
            temp = temp.next;   
        }
        if(prev == null)
        {
            head = temp.next;
            temp.next = null;
            return; // return statement is very important
        }
        else if (temp==null)
        {
            System.out.println("Element not present !");
            return; // return statement is very important
        }
        else{
        prev.next = temp.next;
        temp.next = null;
        return; // return statement is very important
        }
    }
    void printlst(Node head){
        if(head==null)
        {
            System.out.println("Empty list !");
            return; // return statement is very important
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    Node reverselist(){
        Node prev = null;
        Node curr = head;
        Node temp = null;
        if(head==null){
            return null;
        }
        while(curr!=null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
