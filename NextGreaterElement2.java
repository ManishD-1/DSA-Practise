import java.util.*;
public class  NextGreaterElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans[] = NextGreater(arr);
        for(int i : ans)
        {
            System.out.print(i+" ");
        }
    }
    public static int[] NextGreater(int arr[]){
        int n =arr.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i = 2*n -1 ; i>=0;i--)
        {
            while(!st.empty() && st.peek()<=arr[i%n]){
                st.pop();
            }
            ans[i%n] = st.empty() ? -1 : st.peek();
            st.push(arr[i%n]);
        }
        return ans;
    }
}
