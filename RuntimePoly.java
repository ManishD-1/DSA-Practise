public class RuntimePoly {
    public static void main(String[] args) {
        person p1 = new men();
        p1.dance();
        
    }
    
}
class person{
  void dance(){
    System.out.println("From person class");
  }
}
class men extends person{
    void dance(){
        System.out.println("From men class");

    }
}
class women extends person{
    void dance(){
        System.out.println("From women class");

    }
}
