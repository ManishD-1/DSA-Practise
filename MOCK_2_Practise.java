import java.util.*;
public class  MOCK_2_Practise {
    public static void main(String[] args) {
        takingInputs();
    }
    public static void takingInputs(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        DecodeString(str);
       // System.out.println(remove_Duplicates(str));
        // int n = sc.nextInt();
        // int k = sc.nextInt();
         //int arr[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // int m  =sc.nextInt();
        // int arr2[] = new int[m];
        // for(int i=0;i<m;i++)
        // {
        //     arr2[i] = sc.nextInt();
        // }
        sc.close();
       //System.out.println(LastStoneWeight(arr,n));
        //int ans[] = NextGreaterElement(arr, n);
        //int ans[] = NextGreaterElement2(arr, arr2,n,m);
        //  int ans[] = NextSmallerEle(arr,n);


        //  for(int i : ans)
        //  {
        //      System.out.print(i + " ");
        //  }
    }
    public static String remove_Duplicates(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char arr[] = str.toCharArray();
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            if(!st.empty() && arr[i]==st.peek())
            {
                st.pop();
            }
            else
               st.push(arr[i]);
        }
        while(!st.empty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
    public static int[] NextGreaterElement(int [] arr , int n){
        Stack<Integer> st = new Stack<>();
        // 6 8 0 1 3 --> 8 -1 3 3 -1
        st.push(arr[n-1]);
        arr[n-1] = -1;
        for(int i=n-2 ; i>=0;i--)
        {
            int tmp = arr[i];
            while(!st.empty() && arr[i]>= st.peek())
            {
                st.pop();
            }
              
            if(!st.empty())
              arr[i] = st.peek();
            else
              arr[i] = -1;

            st.push(tmp);
        }
        return arr;
    }
    public static int [] NextGreaterElement2(int [] arr , int [] arr2 , int n , int m ){
        Stack<Integer> st = new Stack<>();
        //  arr = [4,1,2], arr2 = [1,3,4,2]
        //      [-1,3,-1]
        Map <Integer , Integer> hm = new HashMap<>();
        for(int i:arr2)
        {
            while(!st.empty() && st.peek() <i)
            {
                hm.put(st.pop() , i);
            }
            st.push(i);
        }
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = hm.getOrDefault(arr[i], -1);
        }
        return arr;
    }
    public static int[] NextGreaterElement3(int [] arr , int n){
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[n];
        for(int i = 2*n -1 ;i>=0;i--)
        {
            while(!st.empty() && arr[i%n]>= st.peek())
            {
                st.pop();
            }
            if(!st.empty())
               ans[i%n] = st.peek();
            else
               ans[i%n] = -1;
            st.push(arr[i%n]);      
              
        }
        return ans;
    }
    public static int LargestAreaOfHistogram(int [] arr , int n){
     
        int []left = LeftGreatest(arr ,n);
        int []right = RightGreatest(arr, n);
        int max = 0;
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i] = right[i] - left[i] -1;
        }
        for(int i=0;i<n;i++)
        {
            int result = ans[i]*arr[i];
            if(result>max)
            {
                max = result;
            }
        }
        return max;

    }
    public static int[] LeftGreatest(int arr[] , int n){
        Stack <Integer> st = new Stack<>();
        int [] left = new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && arr[i]<=arr[st.peek()])
            {
                st.pop();
            }
            if(!st.empty())
            {
                left[i] = st.peek();
            }
            else
            {
                left[i] = -1;
            }
            st.push(i);
        }
        return left;
    }
    public static int[] RightGreatest(int arr[] ,int n){
        Stack<Integer> st = new Stack<>();
        int[] right = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty() && arr[i]<= arr[st.peek()])
            {
                st.pop();
            }
            if(!st.empty())
            {
                right[i] = st.peek();
            }
            else
            {
                right[i] = n;
            }
            st.push(i);
        }
        return right;

    }
    public static int[] NextSmallerEle(int arr[] , int n){
        Stack <Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            int tmp  = arr[i];
            while(!st.empty() && arr[i]< st.peek())
            {
                st.pop();
            }
            arr[i] = st.empty() ? -1 : st.peek();
            st.push(tmp);
        }

        return arr;
    }
    public static int LastStoneWeight(int arr[] , int n){
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        while(pq.size()>1)
        {
            int x = pq.poll();
            int y = pq.poll();
            if(x!=y)
            {
                pq.add(x-y);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
   public static void  simplifyPath(String str){
       Stack <String> st = new Stack<>();
       String[] arr = str.split("/");
       for(int i=0;i<arr.length;i++)
       {
           if(!st.empty() && arr[i] == "..")
           {
               st.pop();
           }
           else if(!arr[i].equals(".") &&  !arr[i].equals("") && !arr[i].equals(".."))
           {
               st.push(arr[i]);
           }
          
       }
       List<String> list = new ArrayList<>(st);
       String res= "/" + String.join("/", list);
       System.out.print(res);
   }
   public static void DecodeString(String s){
       Stack<Integer> num = new Stack<>();
       Stack<String> str = new Stack<>();
       int idx = 0;
       String res = "";
       while(idx<s.length()){
            char ch = s.charAt(idx);
            if(Character.isDigit(ch))
            {
                int currnum = 0;
                while(Character.isDigit(ch)){
                    currnum = currnum*10 + (ch-'0');
                    idx++;
                }
                num.push(currnum);
            }
            else if(ch=='[')
            {
                str.push(res);
                res = "";
                idx++;
            }
            else if(ch==']')
            {
                StringBuilder sb = new StringBuilder(str.pop());
                int n = num.pop();
                for(int i=0;i<n;i++)
                {
                    sb.append(res);
                }
                res = sb.toString();
                idx++;
            }
            else{
                res += ch;
                idx++;
            }
       }
       System.out.print(res);
   }
   public String removeKdigits(String num, int k) {
    Stack<Character> st = new Stack<>();
    if(k==num.length())
        return "0";
    int i=0;
    while(i<num.length()){
        while(k>0 && !st.empty() && st.peek()>num.charAt(i))
        {
            st.pop();
            k--;
        }
        st.push(num.charAt(i++));
    }
    while(k>0 && !st.empty())
    {
        st.pop();
        k--;
    }
    StringBuilder sb = new StringBuilder();
    while(!st.empty())
    {
        sb.append(st.pop());
    }
    sb.reverse();
     while (sb.toString().startsWith("0")) 
          sb.deleteCharAt(0);
    
    return sb.length() ==0 ? "0": sb.toString();
}

}
