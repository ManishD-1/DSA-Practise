import java.util.ArrayDeque;

public class DeQUEUE {
    public static void main(String[] args) {
        // Its a Double Ended Queue 
        // Where we can perform insert and delete operations from both ends
        // So it works both like Stacks and Queue
        // i.e. LIFO and FIFO
        ArrayDeque <Integer> dq = new ArrayDeque <>();

        // For Insertion there are two methods - addFirst() , addLast()
        // For Deletion - pollFirst() , pollLast()
        // For Peeking values - getFirst() , getLast()
        // isEmpty()
        // size()
        // clear()
        int arr[] = {6,4,3,6,2,5,9,2};
        for(int i=0;i<arr.length;i++)
        {
            //dq.addFirst(arr[i]);// it will add like a stack.
            dq.addLast(arr[i]);//it will add like an array.
        }
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
        dq.addLast(16);
        dq.addFirst(92);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        
        String s1 = "hello";
        String s2 = "ll";
        System.out.println(s1.contains(s2));
        





    }
}
