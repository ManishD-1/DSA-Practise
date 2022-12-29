import java.util.*;


public class stackQues {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        String str = sc.next();
        sc.close();
        System.out.println(stak( str));
     
        
    }
    public static boolean stak(String str){
        char arr[] = str.toCharArray();
        Stack <Character> s = new Stack<>();
        for(char c : arr)
        {
           if(c =='(' || c == '{' || c == '[' )
           {
               s.push(c);
           }
           else{
               if(!s.empty() &&  isMatch( s.peek() , c))
               {
                   s.pop();
               }
               else{
                   return false;
               }
           }
        }
        if(s.empty())
        {
            return true;
        }
        return false;

    }
    public static boolean isMatch(char open , char close)
    {
        if(open == '(' && close == ')')
        return true;
        else if(open == '{' && close == '}')
        return true;
        else if (open == '[' && close == ']')
        return true;
        else return false;
    }
}
