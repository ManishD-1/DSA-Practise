import java.util.Stack;

class minS{
    Stack <Integer> st = new Stack<>();
    Stack <Integer> min = new Stack<>();

    public void push(int val){
        st.push(val);
        if(min.empty())
        {
            min.push(val);
        }
        else if(!min.empty() && min.peek()>=val){
            min.push(val);
        }
    }
    public void pop(){
        int curr = st.pop();
        int currmin = min.peek();

        if( curr == currmin)
        {
            min.pop();
        }
    }
    public int getmin(){
        return min.peek();
    }
    public int top(){
        return st.peek();
    }
}
public class minStack {
    public static void main(String[] args) {
        minS obj = new minS();//taking obj of minS class
        obj.push(45);
        obj.push(3);
        obj.push(-1);
        obj.push(67);
        System.out.println(obj.getmin());
        System.out.println(obj.top()); 
        obj.pop();
        obj.pop();
        System.out.println(obj.getmin()); 
        System.out.println(obj.top()); 
        
    }
}
