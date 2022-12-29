import java.util.*;
public class MinimumCostOFRopes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
        sc.close();
        System.out.println(minCost( arr,  n));
    }
    public static long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        long count=0;
        while(pq.size()>1)
        {
            long a = pq.poll();
            long b = pq.poll();
            pq.add(a+b);
            count+=a+b;
        }
        return count;
    }
}
