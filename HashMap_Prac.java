import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ans= maxFreq(s);
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        sc.close();
        // int ans= Longest_subarray(arr, n , k);
         System.out.println(ans);
    }
    public static int Longest_subarray(int arr[],int n,int k ){
        HashMap <Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for(int i=0;i<n;i++)
        {
            sum+= arr[i];
            if(sum==k)
            {
                maxlen = i+1;
            }
            if(!hm.containsKey(sum))
            {
                hm.put(sum, i);
            }
            if(hm.containsKey(sum-k))
            {
                if(maxlen<(i-hm.get(sum-k)))
                {
                    maxlen = i- hm.get(sum-k);
                }
            }
        }
        return maxlen;
    }
    public static char maxFreq(String s)
    {
        HashMap<Character ,Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i] , hm.getOrDefault(arr[i], 0)+1);
        }
        int max = 0;
        char ans = '-';
        for(Character key : hm.keySet())
        {
            if(hm.get(key)>max)
            {
                max = hm.get(key);
                ans = key;

            }
        }
        return ans;
    }
}
