import java.util.HashMap;
import java.util.Scanner;

/**
 * Longest_Subarray_With_Sum_K
 */
public class Longest_Subarray_With_Sum_K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
          {
            arr[i] = sc.nextInt();
          }
          sc.close();
        System.out.println(lenOfLongSubarr(arr,  n,  k));
    }
    public static int lenOfLongSubarr(int[] arr,int n,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0; int maxLen=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                maxLen=i+1;
            }
            if(!hm.containsKey(sum))
            {
                hm.put(sum, i);
            }
            if(hm.containsKey(sum-k))
            {
                if(maxLen<i-hm.get(sum-k))
                {
                    maxLen =i- hm.get(sum-k);
                }
            }
        }
        return maxLen;

    }
}