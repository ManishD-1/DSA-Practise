
public class InsertionSort2 {
    public static void main(String[] args) {
      int theArray[] = {4,3,7,8,1,2};
      for (int i = 0; i < theArray.length; i++) {

        // shift it to the left until it's in the right spot
        int index = i;
        while (index > 0 && theArray[index - 1] >= theArray[index]) {
            int tmp = theArray[index - 1];
            theArray[index - 1] = theArray[index];
            theArray[index] = tmp;
            index --;//when we want swap 1 to the front...we need to swap with all elements before that
        }
    }
    for(int i : theArray)
    {
      System.out.print(i+" ");
    }
    }
}
