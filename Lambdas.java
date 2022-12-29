import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.*;



public class Lambdas {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        sc.close();

        Predicate <String> stringlen = (s) -> s.length()<10; // It only takes one arg and returns Boolean 
        System.out.println(stringlen.test("Apples") + " - Apples are less than 10");

        Consumer<String> converter = (s)->System.out.println(s.toLowerCase()); // It accepts single arg but return no value
        converter.accept("ABHSDUKHuhjnsdkDJD");

        Function<Integer,String> convert = (num) -> Integer.toString(num);// It accepts one arg and produces a result. It takes two wrapper classes
        // First wrapper class is for input values and other is for return.
        System.out.println("length of 26: " + convert.apply(26).length());
        // here we are passing int 26 and int converts to string and it returns its length i.e. 2

        Supplier  <String> s = () -> "java is fun"; // Supplier do not contain any arg
        System.out.println(s.get()); // s.get() used to get values in supplier

        BinaryOperator <Integer> add = (a,b)-> a+b;// here binary operator takes 2 args
        System.out.println("Add 10+25 = " + add.apply(10, 25));

        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("sndbakhwsndAJSDMSND"));

        IntFunction<String> inttostring = Integer :: toString;//This time this is the structure that creates a lambda from a method
        //Its called method ref and it enables us to pass ref of methods or constructors via :: syntax
        // We dont have to specify the datatype of a arg
        System.out.println(inttostring.apply(4567).length());


        Function<String, BigInteger> newbigInt = BigInteger::new;
        // It has two values in angle brackets it means i am giving string and return big integer
        // On right hand side we have an example of how we use :: with a constructor
        // it saying whatever string is coming in I am going to convert it into new big Integer
        // Basically creating a new object
        System.out.println("expected value: 123456789, Actual value: " + newbigInt.apply("123456789"));
        
        
        Consumer<String> print = System.out :: println;
        //println is an instance method of system.out. It wil automatically take in the string and print it to the console
        print.accept("Coming to you directly from a lambda...");

        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("peggy")); 



        // -------------------------------------------- STREAM -----------------------------------------------------

        Arrays.asList("red","green","blue")
        .stream()
        .sorted()
        .findFirst()
        .ifPresent(System.out::println);

        Stream.of("Apple","pear","guava","cherry","Apricot").filter(fruit->{
            System.out.println("filter: "+ fruit);
            return fruit.startsWith("A");
        })

        .forEach(fruit-> System.out.println("Starts with A: " + fruit));






    }
}
