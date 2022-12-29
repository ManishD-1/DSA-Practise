import java.util.*;


public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Stack<Integer> st = new Stack<>();
        for(int i=n-1 ; i>=0 ; i--)
        {
            int temp = arr[i];
            while(!st.empty() && arr[i]>st.peek())
            {
                st.pop();
            }
            if(st.empty())
            {
                arr[i] = -1;
            }
            else{
                arr[i] = st.peek();
            }
            st.push(temp);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
