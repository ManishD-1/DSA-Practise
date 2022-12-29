import java.util.*;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        char arr[] = str.toCharArray();
        Stack<Character> st = new Stack<>();
        int count=0;
        for(char c : arr)
        {
            if(c=='(' )
            {
                st.push(c);
            }
            else
            {
                if( !st.empty() && c == ')' )
                {
                    st.pop();
                    count++;
                }
                // else{
                //     continue;
                // }
            }
            
           
    }
    System.out.println(count*2);
    }

}