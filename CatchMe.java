import java.util.Arrays;
import java.util.Scanner;

public class CatchMe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    Arrays.sort(arr);
    System.out.println(catchme(arr, k, n));
  }

  public static int catchme(int arr[], int k, int n) {
    int police = 0;
    int count = 0;
    for (int i = n - 1; i >= 0; i--) {
      while (arr[i] != k && police < arr[i]) {
        arr[i] = arr[i] + 1;
        police = police + 1;
      }
      if (arr[i] == k) {
        count++;
      }
    }
    return count;
  }
}