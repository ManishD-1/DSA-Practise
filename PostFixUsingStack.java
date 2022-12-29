import java .util.*;
public class PostFixUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack <Integer> st = new Stack<>();

        sc.close();
        //expression = "921*-8-4+" # 9 - 2 * 1 - 8 + 4
        for(int i=0;i<str.length();i++)
        {
            char exp = str.charAt(i);
            if(!Character.isDigit(exp))
            {
                int x = st.pop();
                int y = st.pop();
                switch(exp){
                    case '+':
                    st.push(y+x);
                    break;

                    case '-':
                    st.push(y-x);
                    break;

                    case '*':
                    st.push(x*y);
                    break;

                    case '/':
                    st.push(y/x);
                    break;
                }

            }
            else{
                st.push(Character.getNumericValue(exp));
            }
      
        }
        System.out.println(st.pop());
    }
}
