public class LLpractise {
    public static void main(String[] args) {
        Linklist_practise ll = new Linklist_practise();
        ll.insert(45);
        ll.insert(46);
        ll.insert(47);
        ll.insert(48);
        ll.insert(49);
        ll.insert(50);
        ll.delete(48);
        ll.delete(45);
        ll.printlst(ll.head);
        System.out.println();
        ll.printlst(ll.reverselist());

    }
}
