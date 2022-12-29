import java.util.function.Function;
// Here we are importing Function module for Functional Interface.

import java.util.function.BiFunction;
// Here we are importing Bi Function module for taking 2 args in Functional Interface

public class Functional {


    protected static class MyMath{ //here we created a class inside Functional class which contains a method 
                                   // of type Integer and takes arg of type Integer
        public static Integer triple(Integer x) {
            return x*3;
        }
    }
    public static void main(String[] args) {
        Function<Integer,Integer> myTriple = MyMath::triple; // This is the Syntax for calling a method from another class
        Integer result = myTriple.apply(5);// here myTriple.apply() for passing args
        System.out.println(result);
    // Here what we did overall is we created an object of method(triple) and we called it.


    //--------------------------------------  Bi Function  ------------------------------------------------------------------------------------
    

        BiFunction<Integer, Integer, Integer> add = (x,y) -> x+y;// Using lambda expression
        // If we want to take more than 1 args in functional interface then we can use bi function
        // we took 3 wrapper Integer classes, First 2 for input and third for output
        System.out.println(add.apply(54, 87)); 
  
  

    }
}
