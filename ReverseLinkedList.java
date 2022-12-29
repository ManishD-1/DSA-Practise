import java.util.*;
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
    ListNode(int x , ListNode next){
        val = x;
        this.next = next; 
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode list = takingInputAsLinkedList();
        // ListNode listAfterDeletingMiddle = deleteMiddleOfLinkedList(list);
        // printLinkedList(listAfterDeletingMiddle);

        ListNode listReversed = reverseLinkedList(list);
        printLinkedList(listReversed);
    }

    public static ListNode takingInputAsLinkedList(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ListNode head = new ListNode(s.nextInt());
        ListNode curr = head;

        for(int i=1;i<n;i++){
            ListNode nextNode = new ListNode(s.nextInt());
            curr.next = nextNode;
            curr = curr.next; 
        }
        s.close();

        return head;
    }

    public static ListNode deleteMiddleOfLinkedList(ListNode head){
        ListNode tortoise = head;
        ListNode hare = head;

        while(hare!=null && hare.next!=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        //after this tortoise will be the middle node
        //now we have to delete it

        ListNode temp = head;
        while(temp.next!=tortoise){
            temp = temp.next;
        }

        temp.next = tortoise.next; //deleting

        return head;
    }

    public static void printLinkedList(ListNode head){
        if(head==null){
            return;
        }

        ListNode curr = head;
        while(curr!=null){
            if(curr.next==null){
                System.out.print(curr.val);
            }
            else{
                System.out.print(curr.val+" ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static ListNode reverseLinkedList(ListNode head){
        if(head==null){
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;

        while(curr!=null){
            temp = curr.next; //saving next of curr before switching
            curr.next = prev; //switching the link in reverse direction
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}

