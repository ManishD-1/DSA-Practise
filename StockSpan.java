
import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        takingInputs();

    }

    public static void takingInputs() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans[] = stockSpan(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static int[] stockSpan(int arr[], int n) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(arr[0]);
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            int count = 0;
            while (!s1.empty() && arr[i] > s1.peek()) {
                s2.push(s1.pop());
                count++;
            }
            while (!s2.empty()) {
                s1.push(s2.pop());
            }
            s1.push(arr[i]);
            arr[i] = count + 1;
        }
        return arr;
    }

}
