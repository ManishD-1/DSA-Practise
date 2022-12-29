import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans[] = MaxSlidingWindow(arr, k);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] MaxSlidingWindow(int[] arr, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        int ans[] = new int[n - k + 1];
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        ans[0] = arr[dq.getFirst()];

        int j = 1;
        for (int i = k; i < n; i++) {
            if (dq.getFirst() < i - k + 1) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);
            ans[j] = arr[dq.getFirst()];
            j++;
        }
        return ans;

    }
}
