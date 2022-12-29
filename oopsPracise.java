public class oopsPracise {
    public static void main(String[] args) {
        person p1 = new person();// it will call non parameterized constructor
        person p2 = new person(45);//it will call parameterized constructor
        p2.eat();



       //encapsulation
        encaps e1 = new encaps();
        e1.setprice(1170);//getter
        System.out.println(e1.getprice());//setter

       //inheritance
       Developer d1 = new Developer(56, "manish");//it first call default costructor then it will call parameterized constructor
        d1.age=76;
        d1.walk();
        d1.walk("manish"); //inherited parent class method

       // abstraction
           audi a1 =new audi();
           a1.start();
           bmw b1 = new bmw();
           b1.start();


       // polymorphism
        p1.walk();
        p1.walk("manish");
        p1.walk(10);

       // interface
          dell d = new dell();
          d.boot();
          d.shutDown();

          // constructor
          men m = new men("maddy");// when we call child class constructor then parent class default 
            m.ride();                       // constructor also got called
    }
}
class person {
    int age;
    String name;
     person()
    {
          System.out.println(" hello");
    }
    person(int x)
    {
        System.out.println(x+" kya bhai");
    }
    void walk()                            //
    {                                      //
        System.out.println("walking");     //
    }                                      // 
    void walk(int a)                       //         Example of POLYMORPHISM
    {                                      //         It is also an example of OverLoading
        System.out.println(a +" kms");     //
    }                                      //
    void walk(String A)                    //
    {                                      //
        System.out.println(A + " is walking");
    }
    void eat()
    {
        System.out.println("eating");
    }

}
class Developer extends person{
    Developer(int x, String name){
        System.out.println(x+" "+ name);
    }
}
class encaps{
    private int price;//private variables or methods only availabe in its class
    void setprice(int p){//setters are used to change private values from other class 
        price = p;  // encaps e1 = new encaps();
                             // e1.setprice(1170);  Sysout(e1.getprice());
    }
    int getprice()
    {
        return price;// getters are basically to return values
    }

}
abstract class cars{
    int price=9000000;
    abstract void start();//abstract methods doesnt have a body
}
class bmw extends cars{

    @Override//Override happens when a method which is already present in parent class is implemented in child class
    void start() {//this start() is already present in parent class 
                   // this  happens in abstraction 
        System.out.println("starting bmw "+ price);
        
    }
    
}
class audi extends cars{

    @Override
    void start() {
        System.out.println("starting audi");
        
    }
    
}
interface laptop{
    void boot();// int interface all methods are public abstract by default ..its a true abstraction
     void shutDown();           // we cannot add any method without abstraction (i.e. with body) in interface
}
class dell implements laptop{ // here laptop is superinterface of dell

    @Override
    public void boot() {
        System.out.println("booting");
        
    }

    @Override
    public void shutDown() {
       System.out.println("bye bye");
        
    }
    
}
class humans{
     humans(){//default constructor...it will be called whenever child class constructor is called 
         System.out.println("humans hellooo");
    }
    humans(int c){
        System.out.println(c);
    }
}
class men extends humans{
    men(String a)
    {
        System.out.println(a);
    }
    void ride()
    {
        System.out.println("riding");
    }
}
