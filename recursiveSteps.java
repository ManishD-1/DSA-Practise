import java.util.Scanner;

// Que = Give a ladder contains n steps you can take jump of 1 , 2 or 3 at each step.
//find the number of ways to climb a ladder
// n = 4
//output = 7
//explaination= (1,1,1,1),(1,2,1),(1,1,2),(2,1,1),(2,2),(3,1),(1,3) 

public class recursiveSteps {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            System.out.println(name(n));
        }
    }

    public static int name(int n) {
        if (n == 0) {
            return 1;

        }
        if (n < 0) {
            return 0;
        }
        int ans = name(n - 1) + name(n - 2) + name(n - 3);
        return ans;
    }

}

// Time complexity for this program is O(3^N)
