import java.util.*;
public class StackPrac {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       sc.close();
       int ans[] = nextGreater(arr,n);
       for(int i=0;i<n;i++)
       {
           System.out.print(ans[i]+" ");
       }
    }
    public static int[] nextGreater(int arr[] , int n){
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        arr[n-1] = -1; 
        for(int i =n-2 ;i>=0;i--){
            int temp = arr[i];
        while(!s.empty() && arr[i]>s.peek())
        {
            s.pop();
        }
        if(!s.empty())
          arr[i] = s.peek();
        else 
          arr[i] = -1;
        s.push(temp);
    }
        return arr;

    }
}
