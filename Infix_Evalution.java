import java.util.*;
public class Infix_Evalution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        int n = arr.length;
        sc.close();
        System.out.println(InfixEvaluate(arr , n));
        
    }
    public static int InfixEvaluate(char arr[] , int n ){
        Map<Character , Integer> hm = new HashMap<>();
        Stack<Character> charStack = new Stack<>();
        Stack <Integer> intStack = new Stack<>();
        // 5+4(4*(3-1))/2
        hm.put('*' , 2);
        hm.put('/' , 2);
        hm.put('+' , 1);
        hm.put('-' , 1);
        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(arr[i]))
            {
                intStack.push(Character.getNumericValue(arr[i]));
            }
            else
            {
                while(!charStack.empty()){

                }
            }
            

        }

        
         return 0;
    }
}
