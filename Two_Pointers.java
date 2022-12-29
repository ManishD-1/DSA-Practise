import java.util.*;

public class Two_Pointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // input is sorted array

        int ans[] = twoSum(arr, n, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    public static int[] twoSum(int[] arr, int n, int target) {
        int i = 0;
        int j = n - 1;
        int ans[] = { -1, -1 };

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            } else if (arr[i] + arr[j] > target) {
                j--;

            } else if (arr[i] + arr[j] < target) {
                i++;
            }
        }
        return ans;// if target is not found then -1 ,-1
    }


}
