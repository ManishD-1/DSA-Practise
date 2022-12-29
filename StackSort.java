import java.util.*;
public class StackSort {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();

        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            st.push(arr[i]);
        }
        SortStack(st);
    }
    public static void SortStack(Stack<Integer> st){
        Stack <Integer> tmp = new Stack<>();
        //6 3 5 2 7   2 3 5 6 7 
        tmp.push(st.pop());//first add top element to the temp stack i.e 7
        while(!st.empty()){//we will iterate till our original stack will not be empty
       if(!tmp.empty()  && tmp.peek()>=st.peek())//we compare top elements of both stacks
        {
          tmp.push(st.pop());//if element is lesser than previous tmp top element then push in tmp
        }                    // i.e if previous top is 7 now st.peek is 2 so push
        else if(!tmp.empty() && tmp.peek()<st.peek()){
        
            int temp = st.pop();//we will store top value of original stack in temp variable
            while(!tmp.empty() && temp>tmp.peek()){//until temp variable is greater than tmp top element
            st.push(tmp.pop());// we pop out elements in tmp and store in original stack
            }
            tmp.push(temp);//after all elements poped out then we push temp variable
        // now we will continue till our original stack will not be empty
    }

    }
    while(!tmp.empty())
    {
        System.out.print(tmp.pop()+" ");
    }
    }
}
