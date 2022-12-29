import java.util.*;
public class FiboRec2 {
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            
            System.out.println(fibonacci(n));
        }
    }

    //definition of fibonacci sequence

    // fib(n) = fib(n-1) + fib(n-2)
    // base condition -> fib(1)=1, fib(2)=1

    public static int fibonacci(int n){
        if(n <= 0) {
            return 0;
        }

        else if (n == 1) {
            return 1;
        }

        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
