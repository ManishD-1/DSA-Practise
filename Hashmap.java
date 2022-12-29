import java.util.HashSet;

public class Hashmap {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5); // O(1) complexity
        hs.add(5); // if you add 2 same no.s in hashset then java over write this 5 with previous 5
        hs.add(8);
        hs.add(98);
        System.out.println(hs); // it will print all elements in random order.
        hs.remove(8); // O(1) complexity
        if (hs.contains(98)) { // O(1) complexity
            System.out.println("present");
        }
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs.isEmpty());


    //---------------------------------------------------------------------------------------------------
    
//------------------------       PROGRAM FOR COUNTING DISTINCT NUMBER IN ARRAYS       ------------------------
      
        int arr[] = {5 , 4 , 5 , 1 , 4 , 10 , 1};//we have to count distinct numberss from this array
        for(int element : arr)
        {
            hs.add(element);//HashSet over write same values..so it will only take distinct values
        }
        System.out.println( hs.size());
        System.out.println(hs); // [1 , 4 , 5 ,10]
    }
}
