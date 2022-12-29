import java.util.*;
public class RecPrintPattern {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
             printPattern(n);
        }
   } 
  static void printPattern(int n)
   {
      if (n == 0 || n < 0) {

           System.out.print(n + " ");

           return;
       }

       System.out.print(n + " ");// it will print when stacks are creating.

       printPattern(n - 5);

       System.out.print(n + " ");//it will print when stacks are deleting.
}
}
