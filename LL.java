public class LL {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        System.out.println("----------");
        l1.insert(19);
        l1.insert(81);
        l1.insert(99);
        l1.insert(67);
        l1.insert(20078);
        l1.smartDelete(19);
        //l1.printLinkList();
        System.out.println("----------");
        // l1.delete(99);
        // l1.delete(19);
        // l1.delete(67);
        // l1.delete(81);
        // l1.smartDelete(19)
        // l1.smartDelete(98);
        //System.out.println(l1.middle()); 
       
        //l1.printLinkList(l1.swapFirstLast());
        l1.printLinkList(l1.head);
        
        System.out.println("----------");


    }

}
